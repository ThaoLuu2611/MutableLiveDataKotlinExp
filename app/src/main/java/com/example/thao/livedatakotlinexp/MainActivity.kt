package com.example.thao.livedatakotlinexp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import viewmodelonly.ScoreViewModelActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnViewModel.setOnClickListener{v ->
            startActivity(Intent(this@MainActivity,
                    ScoreViewModelActivity::class.java))
        }

    }
}
