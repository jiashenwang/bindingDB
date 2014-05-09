package com.example.bindingdb;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	
	Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 button = (Button)findViewById(R.id.temp);
		 
		 button.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
                 // Perform action on click
         		Intent i = new Intent(MainActivity.this, SearchResult.class);
        		startActivity(i);
             }
         });
		 
	}


}
