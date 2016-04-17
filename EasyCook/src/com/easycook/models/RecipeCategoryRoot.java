package com.easycook.models;

import java.util.ArrayList;
import java.util.List;

public class RecipeCategoryRoot {
	
	private List<RecipeCategory> recipe_categories = new ArrayList<RecipeCategory>();

	public List<RecipeCategory> getRecipeCategory() {
		return recipe_categories;
	}

}
