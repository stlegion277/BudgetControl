package com.example.budgetcontrol.Categories

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.budgetcontrol.R
import kotlinx.android.synthetic.main.activity_add_categories.*

class AddCategoriesActivity : AppCompatActivity(), CategoriesView {

    private val adapter = CategoriesAdapter()
    private val presener = AddCategoriesPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_categories)

        categoriesRecyclerView.layoutManager = LinearLayoutManager(this)
        categoriesRecyclerView.adapter = adapter
        addButton.setOnClickListener {
            val intent = Intent(this, ClassActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        presener.bindView(this)
    }

    override fun onStop() {
        super.onStop()
        presener.unbindView()
    }

    override fun showCategories(categories: List<String>) {
        adapter.setCategories(categories)
    }
}
//
//    private fun foo() {
//        val intent = Intent(this, AddCategoriesActivity::class.java).putExtra(CREATION_KEY, CATEGORY_CREATION)
//
//        startActivityForResult(intent, CATEGORY_REQUEST_CODE)
//
//
//        val name = "asdfasdfasdf"
//        val bar = Bar(name)
//
//        val intent = Intent().putExtra(CREATION_RESULT, bar)
//
//        setResult(Activity.RESULT_OK, intent)
//        finish()
//    }
//
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//
//        if (resultCode != Activity.RESULT_OK) {
//            presenter.onFailedResult()
//        }
//
//        val extra: Any = data?.getSerializableExtra(CATEGORY_CREATION)
//            ?: data?.getSerializableExtra(PRODUCT_CREATION)
//            ?: return
//
//        when(requestCode) {
//            CATEGORY_REQUEST_CODE -> presenter.onCategoryResult(extra)
//            PRODUCT_REQUEST_CODE -> presenter.onProductResult(extra)
//        }
//    }
//
//    data class Bar(val name: String) : Serializable
//}
//
//const val CREATION_KEY = "category_key"
//const val CREATION_RESULT = "creation_result"
//
//const val CATEGORY_REQUEST_CODE = 42
//const val PRODUCT_REQUEST_CODE = 101
//
//const val CATEGORY_CREATION = "CATEGORY_CREATION"
//const val PRODUCT_CREATION = "PRODUCT_CREATION"