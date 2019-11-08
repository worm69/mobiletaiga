package pt.dbmg.mobiletaiga

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.apollographql.apollo.ApolloCall
import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.api.Response
import com.apollographql.apollo.exception.ApolloException
import io.realm.Realm
import okhttp3.OkHttpClient
import pt.dbmg.mobiletaiga.app.FindQuery
import pt.dbmg.mobiletaiga.app.MediaListByNameQuery
import pt.dbmg.mobiletaiga.app.MediaListCollection3ArgsQuery
import pt.dbmg.mobiletaiga.app.type.MediaType.ANIME
import pt.dbmg.mobiletaiga.repository.data.settingsDB.Update
import java.util.logging.Logger

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [LibraryFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [LibraryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LibraryFragment : Fragment() {
    private lateinit var client: ApolloClient
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val realm : Realm = Realm.getDefaultInstance()
        val update : Update? = realm.where(Update::class.java).findFirst()
        if(update?.activeservice=="Kitsu"){

        } else if(update?.activeservice=="Anilist"){
        client=setupApollo()
        client.query(
            MediaListCollection3ArgsQuery    //From the auto generated class
                .builder()
                .type(ANIME)
                .userName("ktloindev")
                .userId(231906)
                .build())
                .enqueue(object : ApolloCall.Callback<MediaListCollection3ArgsQuery.Data>() {

                    override fun onFailure(e: ApolloException) {
                        Log.i("",e.message.toString())
                    }
                    override fun onResponse(response: Response<MediaListCollection3ArgsQuery.Data>) {
                        Log.i("",response.toString())
                        Log.i(response.data()?.toString(), MainActivity::class.java.name)

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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_library, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment LibraryFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            LibraryFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
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
