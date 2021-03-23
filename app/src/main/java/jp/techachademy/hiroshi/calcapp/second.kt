package jp.techachademy.hiroshi.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import android.util.Log
import android.view.View

class second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val Result = intent.getDoubleExtra("RESULT", 0.0)


        if(Result != null){
             textViewResult.text = String.format("%.2f", Result)
         }


    }
}