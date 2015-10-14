package com.example.doremi;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
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
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RegisterActivity extends Activity {
	EditText username;
	EditText password;
	EditText repassword;
	RadioGroup sex;	
	Button register;
	SQLiteDatabase db;
	
	 


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		findViews();
		ActionBar actionBar = getActionBar();  
	    actionBar.setDisplayHomeAsUpEnabled(true);
	 
	}
	
	private void findViews() {
		username=(EditText) findViewById(R.id.user);
		password=(EditText) findViewById(R.id.password);
		repassword=(EditText) findViewById(R.id.rePassword);
		sex=(RadioGroup) findViewById(R.id.sexRegister);
		register=(Button) findViewById(R.id.register_submit);
		
		
	}
	
	 

    
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.register, menu);
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
