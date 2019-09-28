package sumit.com.daggerdemo

import android.app.Application
import sumit.com.daggerdemo.data.local.DatabaseService
import sumit.com.daggerdemo.data.remote.NetworkService

class MyApplication : Application() {

    lateinit var networkService: NetworkService
    lateinit var databaseService: DatabaseService

    override fun onCreate() {
        super.onCreate()

        DependencyComponent.inject(this)

    }
}