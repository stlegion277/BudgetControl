package com.example.budgetcontrol

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_class.*

class ClassActivity : AppCompatActivity() {

//    var value = categoryEditText.getText().toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class)

        addCategoriesButton.setOnClickListener {
            val intent = Intent(this, AddCategoriesActivity::class.java)
            startActivity(intent)
        }
    }
}


//        val `in` = Intent(this, AddCategoriesActivity::class.java)
//        `in`.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
//        `in`.putExtra("key", value)
//        startActivity(`in`)
//    }
//
//    private fun onAddCategoryClick() {
//        val text = categoryEditText.text
//
//        if (text.isBlank()) onBlankText()
//        else onAddCategory(text.toString())
//    }
//
//    private fun onAddCategory(text: String) {
//        val intent = Intent(applicationContext, AddCategoriesActivity::class.java)
//        setResult(Activity.RESULT_OK, intent)
//        finish()
//    }
//
//    private fun onBlankText() {
//        Toast.makeText(this, "AAAAAAA", Toast.LENGTH_LONG).show()
//    }
//}
