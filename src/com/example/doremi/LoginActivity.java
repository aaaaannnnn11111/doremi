package com.example.doremi;


import com.example.doremi.db.UserService;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class LoginActivity extends Activity {
	public static SQLiteDatabase db; 
	EditText username;
	EditText password;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		Button login_button=(Button) findViewById(R.id.login_submit);
		Button register_button = (Button) findViewById(R.id.button1);
		Button forget_button = (Button) findViewById(R.id.button2);
		username=(EditText) findViewById(R.id.username);
		password=(EditText) findViewById(R.id.password);
		
		register_button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {		
				Intent intent=new Intent(LoginActivity.this,RegisterActivity.class);
				startActivity(intent);
			}
		});
		
		login_button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				String name=username.getText().toString();
				String pass=password.getText().toString();
				Log.i("TAG",name+"_"+pass);
				UserService uService=new UserService(LoginActivity.this);
				boolean flag=uService.login(name, pass);
				if(flag){
					Log.i("TAG","µÇÂ¼³É¹¦");
					Toast.makeText(LoginActivity.this, "µÇÂ¼³É¹¦", Toast.LENGTH_LONG).show();
					
					Intent intent=new Intent(LoginActivity.this,MainActivity.class);
					startActivity(intent);
				}else{
					Log.i("TAG","µÇÂ¼Ê§°Ü");
					Toast.makeText(LoginActivity.this, "µÇÂ¼Ê§°Ü", Toast.LENGTH_LONG).show();
				}
			}
		});
		
		ActionBar actionBar = getActionBar();  
	    actionBar.setDisplayHomeAsUpEnabled(true);  
	}
	
	

	
	
		
		
	
	
	 
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
