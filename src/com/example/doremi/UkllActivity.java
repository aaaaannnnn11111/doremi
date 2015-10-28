package com.example.doremi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class UkllActivity extends Activity {
	private Button button1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ukll);
		button1 = (Button)findViewById(R.id.button1);
		
		
		 button1.setOnClickListener(new OnClickListener() {
			 public void onClick(View arg0) {  
		            // TODO Auto-generated method stub 
		        	Uri uri = Uri.parse("http://shop.m.taobao.com/shop/shop_index.htm?spm=0.0.0.0&shop_id=113757468"); 
		        	Intent intent  = new Intent(Intent.ACTION_VIEW,uri); 
		        	startActivity(intent); 
		        }  
		 });
				
	}
	
}

	

