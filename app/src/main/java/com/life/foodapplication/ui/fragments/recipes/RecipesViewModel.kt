package com.life.foodapplication.ui.fragments.recipes

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.life.foodapplication.utils.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RecipesViewModel @Inject constructor(
    application: Application
) : AndroidViewModel(application) {

    fun applyQueries(): HashMap<String, String> {
        val queries = hashMapOf<String, String>()

        queries["number"] = "50"
        queries["apiKey"] = Constants.API_KEY
        queries["type"] = "snack"
//        queries["diet"] = "vegan"
        queries["addRecipeInformation"] = "true"
        queries["fillIngredients"] = "true"

        return queries
    }

}