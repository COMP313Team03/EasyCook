package com.example.easycook;

import java.io.File;
import java.util.ArrayList;

import com.easycook.models.BridgeTable;
import com.easycook.models.Ingredient;
import com.easycook.models.IngredientCategory;
import com.easycook.models.Recipe;
import com.easycook.models.RecipeCategory;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class RecipeActivity extends Activity {

	public ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
	public ArrayList<Recipe> recipes = new ArrayList<Recipe>();
	ArrayList<BridgeTable> bridgeTables;
	public ArrayList<RecipeCategory> recipeCategory;
	public ArrayList<IngredientCategory> ingredientCategory;

	Button saveButton;
	Button browseButton;
	ListView listView;
	TextView imageName;

	String imageURL="";

	RecipeWorker worker;

	private static int RESULT_LOAD_IMAGE = 1;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.newrecipe);

		worker = new RecipeWorker();
		worker.main = this;
		worker.start();

		listView = (ListView) findViewById(R.id.listView);
		imageName = (TextView) findViewById(R.id.imageName);
		saveButton = (Button) findViewById(R.id.saveButton);
		browseButton = (Button) findViewById(R.id.browseButton);

		browseButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(Intent.ACTION_PICK,
						android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
				startActivityForResult(i, RESULT_LOAD_IMAGE);
			}
		});

		saveButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				File file = new File(imageURL);
				if (!file.exists()) {
					Toast.makeText(RecipeActivity.this, "Please Select a file", Toast.LENGTH_LONG).show();
					return;
				}
				
				SparseBooleanArray checked = listView.getCheckedItemPositions();
				ArrayList<BridgeTable> newBridges = new ArrayList<BridgeTable>();
				String listIngredients = "";

				for (int i = 0; i < checked.size(); i++) {
					if (checked.valueAt(i) == true) {
						Ingredient ingredient = (Ingredient) listView.getItemAtPosition(checked.keyAt(i));
						BridgeTable newBridge = new BridgeTable();
						newBridge.setIngredient_id(ingredient.get_id());
						newBridges.add(newBridge);
						listIngredients+= " " + ingredient.getIngredient_name();
					}
				}
				
				if (newBridges.isEmpty()) {
					Toast.makeText(RecipeActivity.this, "Please Select an Ingredient", Toast.LENGTH_LONG).show();
					return;
				}
				
				EditText titleEditText = (EditText) findViewById(R.id.editText);
				String title = titleEditText.getText().toString();
				if (title.matches("")) {
				    Toast.makeText(RecipeActivity.this, "Please enter a Title", Toast.LENGTH_SHORT).show();
				    return;
				}
				
				EditText descriptionEditText = (EditText) findViewById(R.id.editText2);
				String description = descriptionEditText.getText().toString();
				if (description.matches("")) {
				    Toast.makeText(RecipeActivity.this, "Please enter the steps", Toast.LENGTH_SHORT).show();
				    return;
				}				
				
				Recipe newRecipe = new Recipe();

				newRecipe.setDescription(description);
				newRecipe.setRecipe_name(title);
				newRecipe.setIngredient_list(listIngredients);				
				newRecipe.setRecipe_category_id(1);

				worker = new RecipeWorker();
				worker.main = RecipeActivity.this;
				worker.Action = "SaveRecipe";
				worker.newRecipe = newRecipe;
				worker.imageURL = imageURL;
				worker.newBridges = newBridges;
				worker.start();

			}
		});
	}

	public void Populate() {
		this.runOnUiThread(new Runnable() {
			@Override
			public void run() {
				InitApplication();
			}
		});

	}

	public void InitApplication() {

		ArrayAdapterItem adapter = new ArrayAdapterItem(this, android.R.layout.simple_list_item_1, ingredients);

		listView.setAdapter(adapter);
	}
	
	public void Finish()
	{
		this.finish();
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);

		if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && null != data) {
			Uri selectedImage = data.getData();
			String[] filePathColumn = { MediaStore.Images.Media.DATA };

			Cursor cursor = getContentResolver().query(selectedImage, filePathColumn, null, null, null);
			cursor.moveToFirst();

			int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
			String picturePath = cursor.getString(columnIndex);
			cursor.close();

			imageURL = picturePath;
			imageName.setText(picturePath);
		}
	}

}
