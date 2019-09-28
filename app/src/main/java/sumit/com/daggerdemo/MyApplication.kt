package sumit.com.daggerdemo

import android.app.Application
import sumit.com.daggerdemo.data.local.DatabaseService
import sumit.com.daggerdemo.data.remote.NetworkService

class MyApplication : Application() {

    lateinit var networkService: NetworkService
    lateinit var databaseService: DatabaseService

    override fun onCreate() {
        super.onCreate()

        networkService = NetworkService(this, "SOME_API_KEY")
        databaseService = DatabaseService(this, "MyDB", 1)

    }
}