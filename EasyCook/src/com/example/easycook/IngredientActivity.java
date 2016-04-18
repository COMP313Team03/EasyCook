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
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class IngredientActivity extends Activity {
	
	public ArrayList<IngredientCategory> ingredientCategory = new ArrayList<IngredientCategory>();

	Button saveButton;
	Button browseButton;
	Spinner spinner;
	TextView imageName;

	String imageURL="";
	
	int categoryID = -1;

	IngredientWorker worker;

	private static int RESULT_LOAD_IMAGE = 1;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.newingredient);
		
		worker = new IngredientWorker();
		worker.main = this;
		worker.start();

		spinner = (Spinner) findViewById(R.id.spinnerType);
		imageName = (TextView) findViewById(R.id.textView3);
		saveButton = (Button) findViewById(R.id.ingredientSubmitButton);
		browseButton = (Button) findViewById(R.id.ingredientImageButton);	
		
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
					Toast.makeText(IngredientActivity.this, "Please Select a file", Toast.LENGTH_LONG).show();
					return;
				}
				
				categoryID = ((IngredientCategory) spinner.getSelectedItem()).get_id();				
				
				
				EditText titleEditText = (EditText) findViewById(R.id.ingredientNameEditText);
				String title = titleEditText.getText().toString();
				if (title.matches("")) {
				    Toast.makeText(IngredientActivity.this, "Please enter a Title", Toast.LENGTH_SHORT).show();
				    return;
				}				
				
				Ingredient newIngredient = new Ingredient();
				
				newIngredient.setIngredient_name(title);
				newIngredient.setLike(0);
				newIngredient.setCategory_id(categoryID);

				worker = new IngredientWorker();
				worker.main = IngredientActivity.this;
				worker.Action = "SaveIngredient";
				worker.newIngredient = newIngredient;
				worker.imageURL = imageURL;
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

		ArrayAdapterCategory adapter = new ArrayAdapterCategory(this, android.R.layout.simple_list_item_1, ingredientCategory);
		spinner.setAdapter(adapter);
	}
	
	public void Finish()
	{
		Intent intent = new Intent();
		setResult(RESULT_OK,intent );
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
