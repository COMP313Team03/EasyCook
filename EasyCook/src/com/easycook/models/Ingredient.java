package com.easycook.models;

/*
 * This class is a model that should be identical
 * to the Ingredient table on the database so 
 * the name of the attributes should be the same as on the DB
 */
public class Ingredient  {
	
	private int _id;
	private String ingredient_name;
	private String ingredient_image;
	private String image_name;
	private int category_id;
	private int like;
	
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
	public String getIngredient_image() {
		return ingredient_image;
	}
	public void setIngredient_image(String ingredient_image) {
		this.ingredient_image = ingredient_image;
	}
	public String getImage_name() {
		return image_name;
	}
	public void setImage_name(String image_name) {
		this.image_name = image_name;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}	
}