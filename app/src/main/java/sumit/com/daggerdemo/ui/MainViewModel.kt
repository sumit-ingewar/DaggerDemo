package sumit.com.daggerdemo.ui


import sumit.com.daggerdemo.data.local.DatabaseService
import sumit.com.daggerdemo.data.remote.NetworkService


class MainViewModel(databaseService: DatabaseService,networkService: NetworkService) {

    private val databaseService: DatabaseService
    private val networkService: NetworkService

    val someData: String
        get() = databaseService.dummyData + " : " + networkService.dummyData

    init {
        this.networkService = networkService
        this.databaseService = databaseService
    }
}
