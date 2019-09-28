package sumit.com.daggerdemo.ui

import android.os.Bundle
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity
import sumit.com.daggerdemo.MyApplication

import sumit.com.daggerdemo.R


class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialize MainViewModel
        val application = application as MyApplication
        viewModel = MainViewModel(application.databaseService,application.networkService)

        val tvData = findViewById<TextView>(R.id.tvData)
        tvData.text = viewModel.someData
    }
}
