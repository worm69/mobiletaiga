package pt.dbmg.mobiletaiga.mvp.presenter

import com.maddog05.maddogutilities.android.Checkers
import pt.dbmg.mobiletaiga.BuildConfig
import pt.dbmg.mobiletaiga.mvp.view.MainView
import pt.dbmg.mobiletaiga.network.LogicNetworkRetrofit
import pt.dbmg.mobiletaiga.repository.data.LogicPreferenceSharedPref
import pt.dbmg.mobiletaiga.repository.entity.output.SearchDetail
import pt.dbmg.mobiletaiga.util.ImageEncoder

class MainPresenter(private val view: MainView) {

    private val network = LogicNetworkRetrofit.newInstance()
    private val preferences = LogicPreferenceSharedPref.newInstance(view.mvpContext())
    private val docs = mutableListOf<SearchDetail.Doc>()
    private var searchQuota = 0
    private var searchPerMinute = 0

    fun onCreate() {
        view.showIndicatorSearchResults(true)
        view.showLoading(false)
        val currentVersion = BuildConfig.VERSION_CODE
        val isChangelogViewed = preferences.lastChangelogVersion == currentVersion
        if (!isChangelogViewed) {
            view.showChangelog()
            preferences.lastChangelogVersion = currentVersion
        }
        getQuota()
    }

    fun actionSearch() {
        if (Checkers.isInternetInWifiOrData(view.mvpContext())) {
            val bitmap = view.getInputBitmap()
            if (bitmap != null) {
                view.showLoading(true)
//                val baos = ByteArrayOutputStream()
//                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos)
//                val imageBytes = baos.toByteArray()
//                val imageString = Base64.encodeToString(imageBytes, Base64.DEFAULT)
//                if (imageString!!.isNotEmpty()) {
//                    network.searchWithPhoto(view.mvpContext(), imageString, "") { pair ->
//                        view.showLoading(false)
//                        if (pair.first!!.isEmpty()) {
//                            docs.clear()
//                            docs.addAll(filterHContent(pair.second!!.docs))
//                            view.showIndicatorSearchResults(docs.isEmpty())
//                            view.drawSearchResults(docs)
//                            getQuota()
//                        } else
//                            view.showErrorServer(pair.first!!)
//                    }
//                } else {
//                    view.showLoading(false)
//                    view.showErrorImageEmpty()
//                }
                ImageEncoder.with(bitmap)
                        .callback { encoded ->
                            if (encoded!!.isNotEmpty()) {
                                network.searchWithPhoto(view.mvpContext(), encoded, "") { pair ->
                                    view.showLoading(false)
                                    if (pair.first!!.isEmpty()) {
                                        docs.clear()
                                        docs.addAll(filterHContent(pair.second!!.docs))
                                        view.showIndicatorSearchResults(docs.isEmpty())
                                        view.drawSearchResults(docs)
                                        getQuota()
                                    } else
                                        view.showErrorServer(pair.first!!)
                                }
                            } else {
                                view.showLoading(false)
                                view.showErrorImageEmpty()
                            }
                        }
                        .encode()
            } else
                view.showErrorImageEmpty()
        } else
            view.showErrorInternet()
    }

    private fun filterHContent(items: MutableList<SearchDetail.Doc>): MutableList<SearchDetail.Doc> {
        val isHContentEnabled = preferences.hContentEnabled
        if (isHContentEnabled)
            return items
        else {
            val response = mutableListOf<SearchDetail.Doc>()
            for (i in items.indices) {
                val doc = items[i]
                if (!doc.isHentai)
                    response.add(doc)
            }
            return response
        }
    }

    private fun getQuota() {
        if (Checkers.isInternetInWifiOrData(view.mvpContext())) {
            network.getQuota(view.mvpContext()) { pair ->
                if (pair.first!!.isEmpty()) {
                    searchQuota = pair.second!!.searchQuota
                    searchPerMinute = pair.second!!.searchsPerMinute
                    view.setSearchQuota(searchQuota)
                    view.setSearchPerMinute(searchPerMinute)
                }
            }
        } else {
            view.setSearchQuota(searchQuota)
            view.setSearchPerMinute(searchPerMinute)
        }
    }
}