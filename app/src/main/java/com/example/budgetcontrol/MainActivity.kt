package com.example.budgetcontrol

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT: Long = 2000;
    private val mDelayHandler: Handler = Handler()
    private var mRunnable: Runnable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getData()
    }

    public override fun onDestroy() {
        mDelayHandler.removeCallbacks(mRunnable)
        super.onDestroy()
    }

    private fun getData() {
        val items = listOf("asdasdasd")

        mRunnable = Runnable {
            if (!isFinishing) {
                val intent = Intent(
                    applicationContext,
//                    if (items.isEmpty()) ClassActivity::class.java else AddCategoriesActivity::class.java
                AddCategoriesActivity::class.java
               )

                startActivity(intent)
                finish()
            }
        }

        mDelayHandler.postDelayed(mRunnable, SPLASH_TIME_OUT)
    }
}
