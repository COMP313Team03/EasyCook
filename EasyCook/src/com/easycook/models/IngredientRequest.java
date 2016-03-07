package com.easycook.models;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IngredientRequest {
	
	@SerializedName("ingredients")
	@Expose
	private List<Ingredient> ingredients = new ArrayList<Ingredient>();

	/**
	 * 
	 * @return
	 * The ingredients
	 */
	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	/**
	 * 
	 * @param ingredients
	 * The ingredients
	 */
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
}
