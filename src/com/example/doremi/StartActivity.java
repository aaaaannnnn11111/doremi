package com.example.doremi;


import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import android.os.Bundle;
import android.os.Handler;

import android.view.Menu;
import android.view.MenuItem;

public class StartActivity extends Activity {
	private final int SPLASH_DISPLAY_LENGHT = 2000; //延迟两秒 
	
	private SharedPreferences preferences;

	 
    @Override
    public void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_start); 
        getActionBar().hide();
        
       preferences = getSharedPreferences("count",MODE_WORLD_READABLE); 
        int count = preferences.getInt("count", 0);  
        
        new Handler().postDelayed(new Runnable(){ 
        	 
            @Override
            public void run() { 
                Intent mainIntent = new Intent(StartActivity.this,MainActivity.class); 
                StartActivity.this.startActivity(mainIntent); 
                StartActivity.this.finish(); 
            } 
                
           }, SPLASH_DISPLAY_LENGHT); 
       
         
        //判断程序与第几次运行，如果是第一次运行则跳转到引导页面   
        	
        if (count == 0) {  
        	Intent intent = new Intent(); 
            intent.setClass(getApplicationContext(),StartActivity.class);  
            startActivity(intent);  
            this.finish();  

        }
        
        Editor editor = preferences.edit();  
        //存入数据    
        editor.putInt("count", ++count);  
        //提交修改    
        editor.commit();

    }
   

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.start, menu);
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
