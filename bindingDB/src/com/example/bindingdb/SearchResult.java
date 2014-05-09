package com.example.bindingdb;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class SearchResult extends Activity{


	ListView list;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.search_result);
		
		list = (ListView)findViewById(R.id.result_list);
		list.setAdapter(new BarAdapter(this));
		 
	}
}
class SingleRow
{
	String title;
	String description;
	int image;
	String ic;
	String smile;
	
	SingleRow(String Title, String Description, int Image, String IC, String SMILE)
	{
		this.title = Title;
		this.description = Description;
		this.image = Image;
		this.ic = IC;
		this.smile = SMILE;
	}
}
class BarAdapter extends BaseAdapter
{

	ArrayList<SingleRow> list;
	Context context;
	BarAdapter(Context c)
	{
		context = c;
		list = new ArrayList<SingleRow>();
		
		Resources res = c.getResources();
		String[] titles = res.getStringArray(R.array.titles);
		String[] descriptions = res.getStringArray(R.array.descriptions);
		int[] images = {R.drawable.caf,R.drawable.caf,R.drawable.caf,R.drawable.caf,R.drawable.caf};
		String[] ic = res.getStringArray(R.array.ic);
		String[] smile = res.getStringArray(R.array.smile);
		
		for(int i=0; i<5; i++)
		{
			list.add(new SingleRow(titles[i], descriptions[i], images[i], ic[i], smile[i]));
		}
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View row=inflater.inflate(R.layout.single_row, parent, false);
		TextView title = (TextView)row.findViewById(R.id.title);
		TextView description = (TextView)row.findViewById(R.id.description);
		ImageView image = (ImageView)row.findViewById(R.id.imageView);
		TextView ic = (TextView)row.findViewById(R.id.IC50);
		TextView smile = (TextView)row.findViewById(R.id.SMILES);
		
		SingleRow temp = list.get(position);
		
		title.setText(temp.title);
		description.setText(temp.description);
		image.setImageResource(temp.image);
		ic.setText(temp.ic);
		smile.setText(temp.smile);
		
		return row;
	}
	
}
