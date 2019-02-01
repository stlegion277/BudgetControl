package com.example.budgetcontrol

class AddCategoriesPresenter {
    private var view: CategoriesView? = null

    fun bindView(view: CategoriesView) {
        this.view = view
        updateCategories()
    }

    private fun updateCategories() {
        val categories = listOf(
            "Food",
            "Education",
            "Leisure",
            "Communication expenses",
            "Transport",
            "Medicine",
            "Dog",
            "Cat",
            "Public utilites",
            "Rent",
            "Other"
        )
        view?.showCategories(categories)
    }

    fun unbindView() {
        this.view = null
    }
}