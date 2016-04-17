package com.easycook.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.easycook.models.Ingredient;
import com.easycook.models.IngredientCategory;
import com.easycook.models.IngredientCategoryRoot;
import com.easycook.models.IngredientRoot;
import com.google.gson.Gson;

public class IngredientDao {

	// List of ingredients for testing
	static String[] ingredientBase = { "Chicken", "Tomato", "Beef", "Onion", "Eggs" };

	public static ArrayList<Ingredient> GetIngredients() {
	
		HttpURLConnection c = null;

		try {
			URL u = new URL("http://easycook.herokuapp.com/ingredients");
			c = (HttpURLConnection) u.openConnection();
			c.setRequestMethod("GET");
			c.setRequestProperty("Content-length", "0");
			c.setUseCaches(false);
			c.setAllowUserInteraction(false);
			c.connect();
			int status = c.getResponseCode();

			switch (status) {
			case 200:
			case 201:
				BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream()));
				StringBuilder sb = new StringBuilder();
				String line;
				while ((line = br.readLine()) != null) {
					sb.append(line + "\n");
				}
				br.close();	
				IngredientRoot list = new Gson().fromJson(sb.toString(), IngredientRoot.class);				
				return (ArrayList<Ingredient>) list.getIngredients();
			}

		} catch (MalformedURLException ex) {
			Log.d("DAO", ex.getMessage());
			//Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Log.d("DAO", ex.getMessage());
			//Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
		} finally {
			if (c != null) {
				try {
					c.disconnect();
				} catch (Exception ex) {
					Log.d("DAO", ex.getMessage());
					//Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
				}
			}
		}

		return new ArrayList<Ingredient>();
	}
	
	public static ArrayList<Ingredient> GetIngredients(Cursor cursor) {
		
		ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();

		if (cursor != null) {
			if (cursor.moveToFirst()) {
				do {
					int _id = cursor.getInt(cursor.getColumnIndex("_id"));
					int category_id = cursor.getInt(cursor.getColumnIndex("category_id"));
					String name = cursor.getString(cursor.getColumnIndex("ingredient_name"));
					String image_name = cursor.getString(cursor.getColumnIndex("image_name"));
					int like = cursor.getInt(cursor.getColumnIndex("Like"));

					Ingredient ingredient = new Ingredient();
					ingredient.set_id(_id);
					ingredient.setCategory_id(category_id);
					ingredient.setIngredient_name(name);
					ingredient.setImage_name(image_name);
					ingredient.setLike(like);
					ingredients.add(ingredient);

				} while (cursor.moveToNext());
			}
		}
		cursor.close();
		return ingredients;		 
	}

	public static ArrayList<IngredientCategory> GetIngredientCategory() {
		
		HttpURLConnection c = null;

		try {
			URL u = new URL("http://easycook.herokuapp.com/icategory");
			c = (HttpURLConnection) u.openConnection();
			c.setRequestMethod("GET");
			c.setRequestProperty("Content-length", "0");
			c.setUseCaches(false);
			c.setAllowUserInteraction(false);
			c.connect();
			int status = c.getResponseCode();

			switch (status) {
			case 200:
			case 201:
				BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream()));
				StringBuilder sb = new StringBuilder();
				String line;
				while ((line = br.readLine()) != null) {
					sb.append(line + "\n");
				}
				br.close();	
				IngredientCategoryRoot list = new Gson().fromJson(sb.toString(), IngredientCategoryRoot.class);				
				return (ArrayList<IngredientCategory>) list.getIngredientCategory();
			}

		} catch (MalformedURLException ex) {
			Log.d("DAO", ex.getMessage());
			//Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Log.d("DAO", ex.getMessage());
			//Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
		} finally {
			if (c != null) {
				try {
					c.disconnect();
				} catch (Exception ex) {
					Log.d("DAO", ex.getMessage());
					//Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
				}
			}
		}

		return new ArrayList<IngredientCategory>();
	}
	
	public static ArrayList<IngredientCategory> GetIngredientCategory(Cursor cursor) {
		ArrayList<IngredientCategory> categories = new ArrayList<IngredientCategory>();

		if (cursor != null) {
			if (cursor.moveToFirst()) {
				do {
					int _id = cursor.getInt(cursor.getColumnIndex("_id"));
					String name = cursor.getString(cursor.getColumnIndex("ingredient_category_name"));
					IngredientCategory cat = new IngredientCategory();
					cat.setName(name);
					cat.set_id(_id);
					categories.add(cat);
				} while (cursor.moveToNext());
			}
		}
		cursor.close();
		return categories;
	}

	/*
	 * This method should return all the ingredients from the table Ingredients
	 */
	@SuppressLint("DefaultLocale")
	public static ArrayList<Ingredient> GetIngredientsTest() {
		ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();

		Random randomGenerator = new Random();
		for (int i = 0; i < 50; i++) {
			Ingredient ingredient = new Ingredient();
			ingredient.set_id(i);
			int number = randomGenerator.nextInt(ingredientBase.length);
			ingredient.setIngredient_name(ingredientBase[number]);
			ingredient.setImage_name(ingredientBase[number].toLowerCase());
			ingredients.add(ingredient);
		}
		return ingredients;
	}
}
