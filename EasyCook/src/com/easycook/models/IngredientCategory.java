package com.easycook.models;

public class IngredientCategory {
	
	private int _id;
	private String ingredient_category_name;
	
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String getName() {
		return ingredient_category_name;
	}
	public void setName(String name) {
		this.ingredient_category_name = name;
	}

}
