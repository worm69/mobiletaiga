package pt.dbmg.mobiletaiga.rss

import android.os.AsyncTask
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.util.Xml
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParser.END_TAG
import org.xmlpull.v1.XmlPullParser.FEATURE_PROCESS_NAMESPACES
import org.xmlpull.v1.XmlPullParser.START_TAG
import org.xmlpull.v1.XmlPullParserException
import pt.dbmg.mobiletaiga.R
import java.io.IOException
import java.io.InputStream
import java.net.URL

/**
 *Created by E818 on 11/07/2019
 */
class RssFeed : AppCompatActivity() {

    private var mRecyclerView: RecyclerView? = null
    private var mEditText: EditText? = null
    private var mFetchFeedButton: Button? = null
    private var mSwipeLayout: SwipeRefreshLayout? = null
    private var mFeedTitleTextView: TextView? = null
    private var mFeedLinkTextView: TextView? = null
    private var mFeedDescriptionTextView: TextView? = null

    private var mFeedModelList: List<RssFeedModel>? = null
    private var mFeedTitle: String? = null
    private var mFeedLink: String? = null
    private var mFeedDescription: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rss_feed)

        mRecyclerView = findViewById<View>(R.id.recyclerView) as RecyclerView
        mEditText = findViewById<View>(R.id.rssFeedEditText) as EditText
        mFetchFeedButton = findViewById<View>(R.id.fetchFeedButton) as Button
        mSwipeLayout = findViewById<View>(R.id.swipeRefreshLayout) as SwipeRefreshLayout
        mFeedTitleTextView = findViewById<View>(R.id.feedTitle) as TextView
        mFeedDescriptionTextView = findViewById<View>(R.id.feedDescription) as TextView
        mFeedLinkTextView = findViewById<View>(R.id.feedLink) as TextView

        mRecyclerView!!.layoutManager = LinearLayoutManager(this)

        mFetchFeedButton!!.setOnClickListener { FetchFeedTask().execute(null as Void?) }
        mSwipeLayout!!.setOnRefreshListener { FetchFeedTask().execute(null as Void?) }
    }

    private inner class FetchFeedTask : AsyncTask<Void, Void, Boolean>() {

        private var urlLink: String? = null

        protected override fun onPreExecute() {
            mSwipeLayout!!.isRefreshing = true
            urlLink = mEditText!!.text.toString()
        }

        protected override fun doInBackground(vararg voids: Void): Boolean? {
            if (TextUtils.isEmpty(urlLink))
                return false

            try {
                if (!urlLink!!.startsWith("http://") && !urlLink!!.startsWith("https://"))
                    urlLink = "http://" + urlLink!!

                val url = URL(urlLink)
                val inputStream = url.openConnection().getInputStream()
                mFeedModelList = parseFeed(inputStream)
                return true
            } catch (e: IOException) {
                Log.e("FragmentActivity", "Error", e)
            } catch (e: XmlPullParserException) {
                Log.e("FragmentActivity", "Error", e)
            }

            return false
        }

        protected override fun onPostExecute(success: Boolean?) {
            mSwipeLayout!!.isRefreshing = false

            if (success!!) {
                mFeedTitleTextView!!.text = "Feed Title: $mFeedTitle"
                mFeedDescriptionTextView!!.text = "Feed Description: $mFeedDescription"
                mFeedLinkTextView!!.text = "Feed Link: $mFeedLink"
                // Fill RecyclerView
                mRecyclerView!!.adapter = mFeedModelList?.let { RssFeedListAdapter(it) }
            } else {
//                Toast.makeText(
//                    RssFeed,
//                    "Enter a valid Rss feed url",
//                    Toast.LENGTH_LONG
//                ).show()
            }
        }
    }

    @Throws(XmlPullParserException::class, IOException::class)
    fun parseFeed(inputStream: InputStream): List<RssFeedModel> {
        var title: String? = null
        var link: String? = null
        var description: String? = null
        var isItem = false
        val items =  mutableListOf<RssFeedModel>()

        try {
            val xmlPullParser = Xml.newPullParser()
            xmlPullParser.setFeature(FEATURE_PROCESS_NAMESPACES, false)
            xmlPullParser.setInput(inputStream, null)

            xmlPullParser.nextTag()
            while (xmlPullParser.next() !== XmlPullParser.END_DOCUMENT) {
                val eventType = xmlPullParser.eventType

                val name = xmlPullParser.name ?: continue

                if (eventType == END_TAG) {
                    if (name.equals("item", ignoreCase = true)) {
                        isItem = false
                    }
                    continue
                }

                if (eventType == START_TAG) {
                    if (name.equals("item", ignoreCase = true)) {
                        isItem = true
                        continue
                    }
                }

                Log.d("MyXmlParser", "Parsing name ==> $name")
                var result = ""
                if (xmlPullParser.next() === XmlPullParser.TEXT) {
                    result = xmlPullParser.text
                    xmlPullParser.nextTag()
                }

                if (name.equals("title", ignoreCase = true)) {
                    title = result
                } else if (name.equals("link", ignoreCase = true)) {
                    link = result
                } else if (name.equals("description", ignoreCase = true)) {
                    description = result
                }

                if (title != null && link != null && description != null) {
                    if (isItem) {
                        val item = RssFeedModel(title, link, description)
                        items.add(item)
                    } else {
                        mFeedTitle = title
                        mFeedLink = link
                        mFeedDescription = description
                    }

                    title = null
                    link = null
                    description = null
                    isItem = false
                }
            }

            return items
        } finally {
            inputStream.close()
        }
    }
}