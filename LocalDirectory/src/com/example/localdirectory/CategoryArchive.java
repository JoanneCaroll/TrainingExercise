package com.example.localdirectory;

import java.util.ArrayList;

import android.content.Context;

public class CategoryArchive {

	private ArrayList<Categories> mCategories;
	private Context mAppContext;
	private static CategoryArchive sCatArch;
	private CategoryArchive(Context c){
		mAppContext = c;
		mCategories = new ArrayList<Categories>();
		
		for(int i=0; i<11; i++){
			Categories cat = new Categories();
			if(i==0) cat.setmCategoryName("Accomodation");
			if(i==1) cat.setmCategoryName("Automotive");
			if(i==2) cat.setmCategoryName("Education and Learning");
			if(i==3) cat.setmCategoryName("Entertainment");
			if(i==4) cat.setmCategoryName("Financial Services");
			if(i==5) cat.setmCategoryName("Food and beverages");
			if(i==6) cat.setmCategoryName("Hair and beauty");
			if(i==7) cat.setmCategoryName("Medical");
			if(i==8) cat.setmCategoryName("Professional Services");
			if(i==9) cat.setmCategoryName("Religion");
			if(i==10) cat.setmCategoryName("Restaurant");
			if(i==11) cat.setmCategoryName("Travel and Transport");
			
			mCategories.add(cat);	
		}
	}
	public ArrayList<Categories> getCategories(){
		return mCategories;
	}
	
	public static CategoryArchive get(Context c) {
	        if (sCatArch == null) {
	        	sCatArch = new CategoryArchive(c.getApplicationContext());
	        }
	        return sCatArch;
	    }
}
