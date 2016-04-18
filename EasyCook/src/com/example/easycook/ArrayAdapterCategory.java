package com.example.easycook;

import java.util.ArrayList;

import com.easycook.models.IngredientCategory;

import android.app.ActionBar.LayoutParams;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ArrayAdapterCategory extends ArrayAdapter<IngredientCategory> {

	Context mContext;

	int layoutResourceId;

	ArrayList<IngredientCategory> data = null;

	public ArrayAdapterCategory(Context mContext, int layoutResourceId, ArrayList<IngredientCategory> data) {
		super(mContext, layoutResourceId, data);
		this.layoutResourceId = layoutResourceId;
		this.mContext = mContext;
		this.data = data;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		IngredientCategory objectItem = (IngredientCategory) data.toArray()[position];

		// get the TextView and then set the text (item name) and tag (item ID)
		// values

		TextView textViewItem = new TextView(mContext);
		textViewItem.setText(objectItem.getName());
		textViewItem.setTag(objectItem.get_id());

		return textViewItem;
	}

	@Override
	public View getDropDownView(int position, View convertView, ViewGroup parent) {
		
		
		IngredientCategory objectItem = (IngredientCategory) data.toArray()[position];

		// get the TextView and then set the text (item name) and tag (item ID)
		// values

		TextView textViewItem = new TextView(mContext);
		
		textViewItem.setText(objectItem.getName());
		textViewItem.setTag(objectItem.get_id());

		return textViewItem;
	}

}
