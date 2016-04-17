package com.easycook.models;

public class Recipe {	
	
	private int _id;
	private String recipe_name;
	private String description;
	private String photo;
	private String photo_name;
	private String ingredient_list;
	private int recipe_category_id;
	
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String getRecipe_name() {
		return recipe_name;
	}
	public void setRecipe_name(String recipe_name) {
		this.recipe_name = recipe_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getPhoto_name() {
		return photo_name;
	}
	public void setPhoto_name(String photo_name) {
		this.photo_name = photo_name;
	}
	public String getIngredient_list() {
		return ingredient_list;
	}
	public void setIngredient_list(String ingredient_list) {
		this.ingredient_list = ingredient_list;
	}
	public int getRecipe_category_id() {
		return recipe_category_id;
	}
	public void setRecipe_category_id(int recipe_category_id) {
		this.recipe_category_id = recipe_category_id;
	}
}
