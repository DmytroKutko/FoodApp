package com.life.foodapplication.db

import com.life.foodapplication.db.dao.RecipesDao
import com.life.foodapplication.db.entity.recipe.RecipesEntity
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

interface LocalDataSource {
    suspend fun insertRecipes(recipesEntity: RecipesEntity)
    fun readDatabase(): Flow<List<RecipesEntity>>
}

@ViewModelScoped
class LocalDataSourceImplementation @Inject constructor(
    private val recipesDao: RecipesDao
) : LocalDataSource {

    override suspend fun insertRecipes(recipesEntity: RecipesEntity) {
        recipesDao.insertRecipes(recipesEntity)
    }

    override fun readDatabase(): Flow<List<RecipesEntity>> {
        return recipesDao.readRecipes()
    }

}