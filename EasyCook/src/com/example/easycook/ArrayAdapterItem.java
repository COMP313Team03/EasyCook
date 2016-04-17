package com.example.easycook;

import java.util.ArrayList;

import com.easycook.models.Ingredient;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ArrayAdapterItem extends ArrayAdapter<Ingredient> {

	Context mContext;

	int layoutResourceId;

	ArrayList<Ingredient> data = null;

	public ArrayAdapterItem(Context mContext, int layoutResourceId, ArrayList<Ingredient> data) {
		super(mContext, layoutResourceId, data);
		this.layoutResourceId = layoutResourceId;
		this.mContext = mContext;
		this.data = data;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		Ingredient objectItem = (Ingredient) data.toArray()[position];

		// get the TextView and then set the text (item name) and tag (item ID)
		// values

		TextView textViewItem = new TextView(mContext);
		textViewItem.setText(objectItem.getIngredient_name());
		textViewItem.setTag(objectItem.get_id());

		return textViewItem;
	}

}
