package sumit.com.daggerdemo.data.local

import android.content.Context

/**
 * Dummy class to simulate the actual Database using Room or Realm etc
 */
class DatabaseService(private val context: Context) {
    private val databaseName: String
    private val version: Int

    val dummyData: String
        get() = "DATABASE_DUMMY_DATA"

    init {
        databaseName = "dummy_db"
        version = 1
    }// do the initialisation here
}
