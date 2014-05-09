package com.example.bindingdb;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;

public class SearchResult extends Activity{


	ListView list;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.search_result);
		
		list = (ListView)findViewById(R.id.result_list);
		
		 
	}
}
class SingleRow
{
	String title;
	String description;
	int image;
}
class BarAdapter extends BaseAdapter
{

	ArrayList<SingleRow> list;
	BarAdapter(Context c)
	{
		list = new ArrayList<SingleRow>();
		
		Resources res = c.getResources();
		String[] titles = res.getStringArray(R.array.titles);
		String[] descriptions = res.getStringArray(R.array.descriptions);
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
