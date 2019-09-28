package sumit.com.daggerdemo.ui

import android.os.Bundle
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity
import sumit.com.daggerdemo.DependencyComponent

import sumit.com.daggerdemo.R


class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        DependencyComponent.inject(this)

        val tvData = findViewById<TextView>(R.id.tvData)
        tvData.text = viewModel.someData
    }
}
