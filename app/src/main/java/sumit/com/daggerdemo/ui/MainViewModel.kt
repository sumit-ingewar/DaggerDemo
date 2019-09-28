package sumit.com.daggerdemo.ui

import android.content.Context

import sumit.com.daggerdemo.data.local.DatabaseService
import sumit.com.daggerdemo.data.remote.NetworkService


class MainViewModel(context: Context) {

    private val databaseService: DatabaseService
    private val networkService: NetworkService

    val someData: String
        get() = databaseService.dummyData + " : " + networkService.dummyData

    init {
        networkService = NetworkService(context)
        databaseService = DatabaseService(context)
    }
}
