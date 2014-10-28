package com.example.localdirectory;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class CategoryListFragment extends ListFragment{
	public static final String TAG = "CategoryListFragment";
	public ArrayList<Categories> mCategories;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState); 
		getActivity().setTitle(R.string.hello_world);
		mCategories = CategoryArchive.get(getActivity()).getCategories();
		CategoryAdapter adapter = new CategoryAdapter(mCategories);
        setListAdapter(adapter);
	}
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) { 
        Categories c = (Categories)(getListAdapter()).getItem(position);
        Log.d(TAG, c.getmCategoryName() + " was clicked");
    }

	 private class CategoryAdapter extends ArrayAdapter<Categories> {
	        public CategoryAdapter(ArrayList<Categories> categories) {
	            super(getActivity(), android.R.layout.simple_list_item_1, categories);
	        }

	        @Override
	        public View getView(int position, View convertView, ViewGroup parent) {
	            if (null == convertView) {
	                convertView = getActivity().getLayoutInflater()
	                    .inflate(R.layout.list_category, null);
	            }
	     
	            Categories c = getItem(position);

	            TextView categoryName =
	                (TextView)convertView.findViewById(R.id.category_name);
	            categoryName.setText(c.getmCategoryName());
	            
	            return convertView;
	        }
	    }
	    
}
