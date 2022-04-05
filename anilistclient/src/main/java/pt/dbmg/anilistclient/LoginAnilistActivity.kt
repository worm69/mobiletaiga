package pt.dbmg.anilistclient

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
//import kotlinx.android.synthetic.main.web_login_anilist.webView1
import pt.dbmg.anilistclient.oauth2client.OAuthClient
import pt.dbmg.anilistclient.oauth2client.URLConnectionClient
import pt.dbmg.anilistclient.oauth2client.request.OAuthClientRequest
import pt.dbmg.anilistclient.oauth2common.message.types.GrantType.AUTHORIZATION_CODE

class LoginAnilistActivity() : AppCompatActivity(){

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.web_login_anilist)
        var request: OAuthClientRequest?
        request = OAuthClientRequest
            .authorizationLocation("https://anilist.co/api/v2/oauth/authorize")
            .setClientId("1542").setRedirectURI("https://anilist.co/api/v2/oauth/pin")
            .buildQueryMessage()

        val webview = findViewById<WebView>(R.id.webView1)
        webview.webViewClient = object : WebViewClient() {
            override fun onPageStarted(view: WebView, url: String, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)

                Log.d("WebView", "your current url when webpage loading..$url")
            }

            override fun onPageFinished(view: WebView, url: String) {
                Log.d("WebView", "your current url when webpage loading.. finish$url")

                super.onPageFinished(view, url)

                getCode()
            }

            override fun onLoadResource(view: WebView, url: String) {
                // TODO Auto-generated method stub
                super.onLoadResource(view, url)
            }

            @Deprecated("Deprecated in Java")
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                println("when you click on any interlink on webview that time you got url :-$url")
                return super.shouldOverrideUrlLoading(view, url)
            }
        }
        webview.settings.javaScriptEnabled = true
        webview.settings.javaScriptCanOpenWindowsAutomatically = true
        webview.settings.domStorageEnabled = true
        webview.loadUrl(Uri.parse(request!!.locationUri + "&response_type=code").toString())
    }

    private fun getCode() {
        val webview = findViewById<WebView>(R.id.webView1)
        val uri = webview.url!!.toUri()
        if (uri.toString()
                .startsWith("https://anilist.co/api/v2/oauth/pin?code=")
        ) {
            val code = uri.getQueryParameter("code")
            var request: OAuthClientRequest?



            request = OAuthClientRequest.tokenLocation("https://anilist.co/api/v2/oauth/token")
                .setGrantType(AUTHORIZATION_CODE)
                .setClientId("1542")
                .setClientSecret("jA95juoTN2BshTKueYdCqNz9Aaw9SZiq94Rr7oYh")
                .setRedirectURI("https://anilist.co/api/v2/oauth/pin")
                .setCode(code)
                .buildBodyMessage()

            val thread = Thread(Runnable {
                try {
                    val oAuthClient = OAuthClient(URLConnectionClient())
                    val headers = mutableMapOf("Content-Type" to "application/json", "Accept" to "application/json")
                    request.headers = headers
                    val response = oAuthClient.accessToken(request)
                    val intent = Intent()
                    intent.putExtra("token", response.accessToken)
                    intent.putExtra("tokenExpires", response.expiresIn)
                    intent.putExtra("refreshToken", response.refreshToken)
                    setResult(Activity.RESULT_OK, intent)
                    finish()
                } catch (e: Exception) {
                   Log.e("ERROR", e.toString())
                }
            })

            thread.start()
        }
    }
}
