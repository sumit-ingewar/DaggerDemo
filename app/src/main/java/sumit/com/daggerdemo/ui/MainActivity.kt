package sumit.com.daggerdemo.ui

import android.os.Bundle
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity

import sumit.com.daggerdemo.R


class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialize MainViewModel
        viewModel = MainViewModel(this.applicationContext)

        val tvData = findViewById<TextView>(R.id.tvData)
        tvData.text = viewModel.someData
    }
}
