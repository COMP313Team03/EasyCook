package com.example.easycook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.easycook.data.EasyCookDBContext;
import com.easycook.data.IngredientDao;
import com.easycook.data.RecipeDao;
import com.easycook.models.BridgeTable;
import com.easycook.models.Recipe;
import com.easycook.ui.IngredientControl;

import android.util.Log;

public class RecipeWorker extends Thread {

	public RecipeActivity main;
	boolean FLAG = true;
	
	String imageURL;

	public String Action = "main";

	public ArrayList<BridgeTable> newBridges;
	public Recipe newRecipe;

	public void run() {
		try {

			if (Action == "main") {
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
				main.Populate();

				Log.e("THREAD", "END");
			}

			if (Action == "SaveRecipe") {
				
				int id = 0;
				boolean FLAG = false;

				do {
					FLAG = false;
					id++;

					main.recipes = RecipeDao.GetRecipes();

					for (Recipe auxRecipe : main.recipes) {
						if (auxRecipe.get_id() == id)
							FLAG = true;
					}

				} while (FLAG);

				newRecipe.set_id(id);
				
				Map config = new HashMap();
				config.put("cloud_name", "easycook");
				config.put("api_key", "338338817659347");
				config.put("api_secret", "UV7O8MTwQoTw_lYBtIWMnWahJCk");
				Cloudinary cloudinary = new Cloudinary(config);				
				
				File file = new File(imageURL);
				FileInputStream fileInputStream = new FileInputStream(file);				
				cloudinary.uploader().upload(fileInputStream,ObjectUtils.asMap("public_id", newRecipe.getRecipe_name().replaceAll("\\s","_")));
				String url = cloudinary.url().generate(newRecipe.getRecipe_name().replaceAll("\\s","_")+".jpg");
				newRecipe.setPhoto_name(newRecipe.getRecipe_name().replaceAll("\\s","_"));
				Log.d("URL", url);				
				newRecipe.setPhoto(url);
				RecipeDao.CreateRecipe(newRecipe);
				
				Log.d("B", String.valueOf(newBridges.size()));
				
				for (BridgeTable bridge : newBridges) {
					id = 0;
					boolean FLAGB = false;

					do {
						FLAGB = false;
						id++;
						for (BridgeTable auxBridge : main.bridgeTables) {
							if (auxBridge.get_id() == id)
								FLAGB = true;
						}
						for (BridgeTable auxBridge : newBridges) {
							if (auxBridge.get_id() == id)
								FLAGB = true;
						}
					} while (FLAGB);
					
					Log.d("B", String.valueOf(id));
					bridge.set_id(id);
					bridge.setRecipe_id(newRecipe.get_id());
					
					RecipeDao.CreateBridgeTable(bridge);
				}				
				
				main.Finish();
			}

		} catch (Exception e) {
			Log.e("THREAD", e.getMessage());
		}
	}

}
