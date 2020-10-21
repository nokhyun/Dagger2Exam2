package com.nokhyun.daggerexam2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.nokhyun.daggerexam2.di.Candy
import com.nokhyun.daggerexam2.di.DaggerExamComponent

class MainActivity : AppCompatActivity() {
    companion object{
        private val TAG = MainActivity::class.simpleName
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val candy = DaggerExamComponent.builder().build().injectAndReturnSomeType(Candy())
        Log.d(TAG, "component result: ${candy.candyName}")

    }
}