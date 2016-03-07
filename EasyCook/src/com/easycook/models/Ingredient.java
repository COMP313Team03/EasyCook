package com.easycook.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/*
 * This class is a model that should be identical
 * to the Ingredient table on the database so 
 * the name of the attributes should be the same as on the DB
 */
public class Ingredient  {
	
	@SerializedName("_id")
	@Expose
	private int _id;
	
	@SerializedName("ingredient_name")
	@Expose
	private String ingredient_name;
	
	@SerializedName("ingredient_image")
	@Expose
	private String ingredientImage;	
	
	private int ingredient_category_id;
	
	@SerializedName("like")
	@Expose
	private int like;
	
	@SerializedName("category_id")
	@Expose
	private int category;
	
	@SerializedName("image_name")
	@Expose
	private String ingredient_picture_name; // wee need to add this to the table

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}
	
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String getIngredient_name() {
		return ingredient_name;
	}
	public void setIngredient_name(String ingredient_name) {
		this.ingredient_name = ingredient_name;
	}
	public String getIngredient_picture_name() {
		return ingredient_picture_name;
	}
	public void setIngredient_picture_name(String ingredient_picture_name) {
		this.ingredient_picture_name = ingredient_picture_name;
	}
	public String getIngredientImage() {
		return ingredientImage;
	}
	public void setIngredientImage(String ingredientImage) {
		this.ingredientImage = ingredientImage;
	}
	public int getIngredient_category_id1() {
		return ingredient_category_id;
	}
	public void setIngredient_category_id1(int ingredient_category_id) {
		this.ingredient_category_id = ingredient_category_id;
	}
}
