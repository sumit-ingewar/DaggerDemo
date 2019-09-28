package sumit.com.daggerdemo.ui;

import android.content.Context;

import sumit.com.daggerdemo.data.local.DatabaseService;
import sumit.com.daggerdemo.data.remote.NetworkService;


public class MainViewModel {

    private DatabaseService databaseService;
    private NetworkService networkService;

    public MainViewModel(Context context) {
        networkService = new NetworkService(context);
        databaseService = new DatabaseService(context);
    }

    public String getSomeData() {
        return databaseService.getDummyData() + " : " + networkService.getDummyData();
    }
}
