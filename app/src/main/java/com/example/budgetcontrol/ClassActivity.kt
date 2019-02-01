package com.example.budgetcontrol

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_class.*

class ClassActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class)

        addCategoriesButton.setOnClickListener {
            onAddCategoryClick()
        }


    }

    private fun onAddCategoryClick() {
        val text = categoryEditText.text

        if (text.isBlank()) onBlankText()
        else onAddCategory(text.toString())
    }

    private fun onAddCategory(text: String) {
        val intent = Intent(applicationContext, AddCategoriesActivity::class.java)
        setResult(Activity.RESULT_OK, intent)
        finish()
    }

    private fun onBlankText() {
        Toast.makeText(this, "AAAAAAA", Toast.LENGTH_LONG).show()
    }
}
