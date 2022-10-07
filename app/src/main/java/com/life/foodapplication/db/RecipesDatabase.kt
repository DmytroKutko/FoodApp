package com.life.foodapplication.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.life.foodapplication.db.dao.RecipesDao
import com.life.foodapplication.db.entity.recipe.RecipesEntity
import com.life.foodapplication.utils.RecipesTypeConverter

@Database(
    entities = [RecipesEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(RecipesTypeConverter::class)
abstract class RecipesDatabase : RoomDatabase() {

    abstract fun recipesDao(): RecipesDao
}