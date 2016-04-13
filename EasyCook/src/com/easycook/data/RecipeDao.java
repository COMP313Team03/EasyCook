package com.easycook.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import com.easycook.models.BridgeTable;
import com.easycook.models.BridgeTableRoot;
import com.easycook.models.Ingredient;
import com.easycook.models.IngredientCategory;
import com.easycook.models.IngredientRoot;
import com.easycook.models.Recipe;
import com.easycook.models.RecipeCategory;
import com.easycook.models.RecipeCategoryRoot;
import com.easycook.models.RecipeRoot;
import com.google.gson.Gson;

import android.database.Cursor;
import android.util.Log;

public class RecipeDao {
	
	public static ArrayList<Recipe> GetIngredients()
	{
		HttpURLConnection c = null;

		try {
			URL u = new URL("http://easycook.herokuapp.com/recipes");
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
				RecipeRoot list = new Gson().fromJson(sb.toString(), RecipeRoot.class);				
				return (ArrayList<Recipe>) list.getRecipes();
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
		return  new ArrayList<Recipe>();		
	}	
	
	public static ArrayList<Recipe> GetIngredients(Cursor cursor)
	{
		ArrayList<Recipe> recipes = new ArrayList<Recipe>();

		if (cursor != null)
		{
			if ( cursor.moveToFirst())
			{
				do
				{
					int _id = cursor.getInt(cursor.getColumnIndex("_id"));
					int category_id = cursor.getInt(cursor.getColumnIndex("recipe_category_id"));					
					String name = cursor.getString(cursor.getColumnIndex("recipe_name"));					
					String image_name = cursor.getString(cursor.getColumnIndex("photo_name"));			
					Recipe recipe = new Recipe();
					recipe.set_id(_id);			    	    	
					recipe.setRecipe_name(name);
					recipe.setPhoto_name(image_name);
					recipe.setDescription(cursor.getString(cursor.getColumnIndex("description")));
					recipe.setIngredient_list(cursor.getString(cursor.getColumnIndex("ingredient_list")));
					recipe.setRecipe_category_id(category_id);
					recipes.add(recipe);

				}while(cursor.moveToNext());
			}
		}		
		cursor.close();
		return recipes;
	}	
	
	public static ArrayList<RecipeCategory> GetRecipeCategory(){
		
		HttpURLConnection c = null;

		try {
			URL u = new URL("http://easycook.herokuapp.com/rcategory");
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
				RecipeCategoryRoot list = new Gson().fromJson(sb.toString(), RecipeCategoryRoot.class);				
				return (ArrayList<RecipeCategory>) list.getRecipeCategory();
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
		return  new ArrayList<RecipeCategory>();			

				
	}
	
	public static ArrayList<RecipeCategory> GetRecipeCategory(Cursor cursor)
	{
		ArrayList<RecipeCategory> categories = new ArrayList<RecipeCategory>();

		if (cursor != null)
		{
			if ( cursor.moveToFirst())
			{
				do
				{
					int _id = cursor.getInt(cursor.getColumnIndex("_id"));									
					String name = cursor.getString(cursor.getColumnIndex("recipe_category_name"));					
					RecipeCategory cat = new RecipeCategory();
					cat.setName(name);
					cat.set_id(_id);			    	    	
					categories.add(cat);
				}while(cursor.moveToNext());
			}
		}			
		cursor.close();
		return categories;
	}	

	public static ArrayList<BridgeTable> GetBridgeTable(){
		
		HttpURLConnection c = null;

		try {
			URL u = new URL("http://easycook.herokuapp.com/bridge");
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
				BridgeTableRoot list = new Gson().fromJson(sb.toString(), BridgeTableRoot.class);				
				return (ArrayList<BridgeTable>) list.getBridgeTable();
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
		return  new ArrayList<BridgeTable>();			
	}
	
	public static ArrayList<BridgeTable> GetBridgeTable(Cursor cursor)
	{
		ArrayList<BridgeTable> bridgeTables = new ArrayList<BridgeTable>();

		int i = 0;
		
		if (cursor != null)
		{
			if ( cursor.moveToFirst())
			{
				do
				{
					int _id = cursor.getInt(cursor.getColumnIndex("_id"));
					int ingredient_id = cursor.getInt(cursor.getColumnIndex("ingredient_id"));					
					int recipe_id = cursor.getInt(cursor.getColumnIndex("recipe_id"));										
					
					BridgeTable bridgeTable = new BridgeTable();
					bridgeTable.set_id(_id);			    	    	
					bridgeTable.setIngredient_id(ingredient_id);
					bridgeTable.setRecipe_id(recipe_id);
					bridgeTables.add(bridgeTable);
					i++;				

				}while(cursor.moveToNext());
			}
		}		
		cursor.close();
		return bridgeTables;
	}	
}
