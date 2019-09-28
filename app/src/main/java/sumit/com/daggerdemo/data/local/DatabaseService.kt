package sumit.com.daggerdemo.data.local

import android.content.Context

/**
 * Dummy class to simulate the actual Database using Room or Realm etc
 */
class DatabaseService(
    appContext: Context, dataBaseName: String,
    dbVersion: Int
) {
    private val databaseName: String
    private val version: Int
    private val context: Context

    val dummyData: String
        get() = "DATABASE_DUMMY_DATA"

    init {
        context = appContext
        databaseName = dataBaseName
        version = dbVersion
    }// do the initialisation here
}
