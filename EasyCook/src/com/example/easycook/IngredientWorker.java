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
import com.easycook.models.Ingredient;
import com.easycook.models.Recipe;

import android.util.Log;

public class IngredientWorker extends Thread{

	public IngredientActivity main;
	boolean FLAG = true;

	String imageURL;

	public String Action = "main";
	
	public Ingredient newIngredient;

	public void run() {
		
		try {

			if (Action == "main") {
				Log.e("THREAD", "INIT");

				main.ingredientCategory = IngredientDao.GetIngredientCategory();	
				
				Thread.sleep(1000);
				main.Populate();

				Log.e("THREAD", "END");
			}

			if (Action == "SaveIngredient") {
				
				int id = 0;
				boolean FLAG = false;

				ArrayList<Ingredient> ingredients = IngredientDao.GetIngredients();
				
				do {
					FLAG = false;
					id++;					

					for (Ingredient auxRecipe : ingredients) {
						if (auxRecipe.get_id() == id)
							FLAG = true;
					}

				} while (FLAG);

				newIngredient.set_id(id);
				
				Map config = new HashMap();
				config.put("cloud_name", "easycook");
				config.put("api_key", "338338817659347");
				config.put("api_secret", "UV7O8MTwQoTw_lYBtIWMnWahJCk");
				Cloudinary cloudinary = new Cloudinary(config);				
				
				File file = new File(imageURL);
				FileInputStream fileInputStream = new FileInputStream(file);				
				cloudinary.uploader().upload(fileInputStream,ObjectUtils.asMap("public_id", newIngredient.getIngredient_name().replaceAll("\\s","_")));
				String url = cloudinary.url().generate(newIngredient.getIngredient_name().replaceAll("\\s","_")+".jpg");
				newIngredient.setImage_name(newIngredient.getIngredient_name().replaceAll("\\s","_"));
				Log.d("URL", url);				
				newIngredient.setIngredient_image(url);
				IngredientDao.CreateIngredient(newIngredient);
				
				main.Finish();
			}

		} catch (Exception e) {
			Log.e("THREAD", e.getMessage());
		}

	}

}
