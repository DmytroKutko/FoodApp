package com.life.foodapplication.db.entity.recipe

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.life.foodapplication.model.recipe.FoodRecipe
import com.life.foodapplication.utils.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}