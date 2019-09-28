package sumit.com.daggerdemo

import sumit.com.daggerdemo.data.local.DatabaseService
import sumit.com.daggerdemo.data.remote.NetworkService
import sumit.com.daggerdemo.ui.MainActivity
import sumit.com.daggerdemo.ui.MainViewModel

object DependencyComponent {

    fun inject(myApplication: MyApplication) {
        myApplication.networkService = NetworkService(myApplication, "apiKey")
        myApplication.databaseService = DatabaseService(myApplication, "MyDB", 2)
    }

    fun inject(mainActivity: MainActivity) {
        val myApplication = mainActivity.application as MyApplication
        mainActivity.viewModel =
            MainViewModel(myApplication.databaseService, myApplication.networkService)
    }
}