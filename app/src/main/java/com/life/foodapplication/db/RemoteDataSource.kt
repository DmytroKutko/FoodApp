package com.life.foodapplication.db

import com.life.foodapplication.api.FoodRecipesApi
import com.life.foodapplication.model.recipe.FoodRecipe
import dagger.hilt.android.scopes.ViewModelScoped
import retrofit2.Response
import javax.inject.Inject

interface RemoteDataSource {
    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe>
}

@ViewModelScoped
class RemoteDataSourceImplementation @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) : RemoteDataSource {

    override suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe> {
        return foodRecipesApi.getRecipes(queries)
    }

}