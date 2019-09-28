package sumit.com.daggerdemo.data.remote

import android.content.Context

/**
 * Dummy class to simulate the actual NetworkService using Retrofit or OkHttp etc
 */
class NetworkService(private val context: Context, apikey: String) {
    private val apiKey: String

    val dummyData: String
        get() = "NETWORK_DUMMY_DATA"

    init {
        // do the initialisation here
        apiKey = apikey
    }
}
