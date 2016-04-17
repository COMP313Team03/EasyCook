package com.example.easycook;

import com.easycook.data.EasyCookDBContext;
import com.easycook.data.IngredientDao;
import com.easycook.data.RecipeDao;


import android.util.Log;

public class Worker extends Thread {

	public MainActivity main;
	boolean FLAG = true;
	
	public void run()
	{
		try
		{	
			Log.e("THREAD", "INIT");
			
			EasyCookDBContext db;
			db = new EasyCookDBContext(main);	
			
			main.ingredients = IngredientDao.GetIngredients();
			main.recipes = RecipeDao.GetRecipes();
			main.bridgeTables = RecipeDao.GetBridgeTable();
			main.ingredientCategory = IngredientDao.GetIngredientCategory();			
			main.recipeCategory = RecipeDao.GetRecipeCategory();
			
			db.close();
			Thread.sleep(1000);
			main.StartAPP();
			
			Log.e("THREAD", "END");
		}
		catch (Exception e)
		{			
			Log.e("THREAD", e.getMessage());
		}			
	}
	
}
