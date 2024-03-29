package pt.dbmg.mobiletaiga.ui.activity

import android.app.Activity
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.devbrackets.android.exomedia.listener.OnCompletionListener
import com.devbrackets.android.exomedia.listener.OnPreparedListener
import com.devbrackets.android.exomedia.ui.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import es.dmoral.toasty.Toasty
import pt.dbmg.mobiletaiga.R
import pt.dbmg.mobiletaiga.util.C
import pt.dbmg.mobiletaiga.util.Mapper

class VideoSelectActivity : AppCompatActivity(), OnPreparedListener, OnCompletionListener {

    private lateinit var videoView: VideoView
    private lateinit var loadingPbar: ProgressBar

    private lateinit var pathVideo: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_select)
        setupExtraData()
        setupToolbar()
        setupViews()
        setupActions()
        setupData()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home)
            onBackPressed()
        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        setResult(Activity.RESULT_CANCELED)
        super.onBackPressed()
    }

    private fun setupToolbar() {
        setSupportActionBar(findViewById<Toolbar>(R.id.toolbar))
        val actionBar: ActionBar? = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
        }
    }

    private fun setupExtraData() {
        val extras = intent.extras
        if (extras != null) {
            pathVideo = extras.getString(C.Extras.SELECT_LOCAL_VIDEO_PATH, C.EMPTY)
        }
    }

    private fun setupViews() {
        loadingPbar = findViewById<ProgressBar>(R.id.pbar_loading)
        videoView = findViewById<VideoView>(R.id.video_view_preview)
        videoView.setOnPreparedListener(this)
        videoView.setOnCompletionListener(this)
        videoView.setVolume(0f)
    }

    private fun setupActions() {
        findViewById<FloatingActionButton>(R.id.fab_confirm).setOnClickListener { confirmSelectedFrame() }
    }

    private fun setupData() {
        if(::pathVideo.isInitialized){
            videoView.setVideoURI(Uri.parse(pathVideo))
        }else{
            videoView.setVideoURI(intent.data)
        }
    }

    private fun confirmSelectedFrame() {
        if (loadingPbar.visibility == View.INVISIBLE) {
            showError(getString(R.string.error_video_not_loaded))
        } else {
            if (videoView.isPlaying)
                videoView.stopPlayback()
            val newBitmap: Bitmap? = videoView.bitmap
            if (newBitmap == null) {
                showError(getString(R.string.error_encoding_image))
            } else {
                val byteArray = Mapper.parseBitmapToByteArray(newBitmap, 512)
                val newIntent = intent
                val bundle = Bundle()
                bundle.putByteArray(C.Extras.VIDEO_FRAME_BITMAP, byteArray)
                newIntent.putExtras(bundle)
                setResult(Activity.RESULT_OK, newIntent)
                finish()
            }
        }
    }

    private fun showError(text: String) {
        Toasty.error(this, text, Toast.LENGTH_SHORT).show()
    }

    //FROM VIDEO VIEW
    override fun onPrepared() {
        loadingPbar.visibility = View.GONE
        videoView.start()
    }

    override fun onCompletion() {
        loadingPbar.visibility = View.GONE
        videoView.restart()
    }
}
