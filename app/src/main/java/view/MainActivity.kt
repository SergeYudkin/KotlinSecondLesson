package view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinsecondlesson.R
import com.example.kotlinsecondlesson.databinding.ActivityMainBinding


lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState==null){
            supportFragmentManager.beginTransaction().replace(R.id.container,MainFragment.newInstance())
                .commit()
        }


    }






}