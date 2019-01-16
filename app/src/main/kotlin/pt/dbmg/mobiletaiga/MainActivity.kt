package pt.dbmg.mobiletaiga

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.apollographql.apollo.ApolloCall
import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.exception.ApolloException
import okhttp3.OkHttpClient
import com.apollographql.apollo.api.Response

import pt.dbmg.mobiletaiga.view.UsersListFragment
import pt.dbmg.mobiletaiga.R
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {
    private lateinit var client: ApolloClient
    companion object {
        val Log = Logger.getLogger(MainActivity::class.java.name)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.frag_container, UsersListFragment()).commit()
        }
        client=setupApollo()
        client.query(FindQuery    //From the auto generated class
                .builder()
                .id(15125)
                .build())
                .enqueue(object : ApolloCall.Callback<FindQuery.Data>() {

                    override fun onFailure(e: ApolloException) {
                        Log.info(e.message.toString())
                    }
                    override fun onResponse(response: Response<FindQuery.Data>) {
                        Log.info(response.toString())
                        android.util.Log.w(response.data()?.Media()?.title()?.romaji(), MainActivity::class.java.name)


//                        runOnUiThread({
//                            progress_bar.visibility = View.GONE
//                            name_text_view.text = String.format(getString(R.string.name_text),
//                                    response.data()?.repository()?.name())
//                            description_text_view.text = String.format(getString(R.string.description_text),
//                                    response.data()?.repository()?.description())
//                            forks_text_view.text = String.format(getString(R.string.fork_count_text),
//                                    response.data()?.repository()?.forkCount().toString())
//                            url_text_view.text = String.format(getString(R.string.url_count_text),
//                                    response.data()?.repository()?.url().toString())
//                        })
                    }
                })
    }


    private fun setupApollo(): ApolloClient {
        val BASE_URL = "https://graphql.anilist.co"
        val okHttp = OkHttpClient
                .Builder()
                .addInterceptor { chain ->
                    val original = chain.request()
                    val builder = original.newBuilder().method(original.method(),
                            original.body())
        //                builder.addHeader("Authorization"
        //                        , "Bearer " + BuildConfig.AUTH_TOKEN)
                    chain.proceed(builder.build())
                }
                .build()
        return ApolloClient.builder()
                .serverUrl(BASE_URL)
                .okHttpClient(okHttp)
                .build()
    }
}
