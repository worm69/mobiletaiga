package pt.dbmg.mobiletaiga.rss

import android.widget.TextView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pt.dbmg.mobiletaiga.R

/**
 *Created by E818 on 11/07/2019
 */
class RssFeedListAdapter(private val mRssFeedModels: List<RssFeedModel>) :
    RecyclerView.Adapter<RssFeedListAdapter.FeedModelViewHolder>() {

    class FeedModelViewHolder( val rssFeedView: View) : RecyclerView.ViewHolder(rssFeedView)

    override fun onCreateViewHolder(parent: ViewGroup, type: Int): FeedModelViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_rss_feed, parent, false)
        return FeedModelViewHolder(v)
    }

    override fun onBindViewHolder(holder: FeedModelViewHolder, position: Int) {
        val rssFeedModel = mRssFeedModels[position]
        (holder.rssFeedView.findViewById(R.id.titleText) as TextView).text = rssFeedModel.title
        (holder.rssFeedView.findViewById(R.id.descriptionText) as TextView).text = rssFeedModel.description
        (holder.rssFeedView.findViewById(R.id.linkText) as TextView).text = rssFeedModel.link
    }

    override fun getItemCount(): Int {
        return mRssFeedModels.size
    }
}
