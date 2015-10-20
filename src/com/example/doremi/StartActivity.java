package com.example.doremi;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.os.Handler;

import android.view.Menu;
import android.view.MenuItem;

public class StartActivity extends Activity {
	private final int SPLASH_DISPLAY_LENGHT = 2000; //延迟三秒 
	 
    @Override
    public void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_start); 
        getActionBar().hide();
        new Handler().postDelayed(new Runnable(){ 
 
         @Override
         public void run() { 
             Intent mainIntent = new Intent(StartActivity.this,MainActivity.class); 
             StartActivity.this.startActivity(mainIntent); 
             StartActivity.this.finish(); 
         } 
             
        }, SPLASH_DISPLAY_LENGHT); 
    } 


  /* @Override   
    public void onCreate(Bundle savedInstanceState) {    
        super.onCreate(savedInstanceState);    
        setContentView(R.layout.activity_start);   
        getActionBar().hide();
        final Intent it = new Intent(this, MainActivity.class); //你要转向的Activity   

		Timer timer = new Timer(); 

		TimerTask task = new TimerTask() {  

		    @Override  

		    public void run() {   

		    startActivity(it); //执行  
           
		     } 

		 };

		timer.schedule(task, 1000 * 2); //10秒后
		
      
    }*/
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
