package pt.dbmg.mobiletaiga.mvp.view

import android.content.Context
import android.graphics.Bitmap
import pt.dbmg.mobiletaiga.repository.entity.output.SearchDetail

interface MainView {
    fun mvpContext(): Context
    fun drawSearchResults(results: MutableList<SearchDetail.Doc>)
    fun getInputBitmap(): Bitmap?
    fun setSearchQuota(number: Int)
    fun setSearchPerMinute(number: Int)
    fun showChangelog()
    fun showErrorImageEmpty()
    fun showErrorInternet()
    fun showErrorServer(text: String)
    fun showIndicatorSearchResults(wantVisible: Boolean)
    fun showLoading(wantVisible: Boolean)
}