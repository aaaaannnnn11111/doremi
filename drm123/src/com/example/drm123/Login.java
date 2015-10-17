package com.example.drm123;



import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends Activity{
	private Button button,button1;
	EditText useremail,password;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		button=(Button)findViewById(R.id.button1);
		button1=(Button)findViewById(R.id.Button01);
		useremail=(EditText) findViewById(R.id.editText1);
		password=(EditText) findViewById(R.id.editText2);
		
		
		button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SharedPreferences sp = getSharedPreferences("config", MODE_PRIVATE); 
				 String email = useremail.getText().toString();
				 String pass = password.getText().toString();
				
				 if (useremail.equals(email)){
					 if(password.equals(pass)) {
				 }
					 Log.i("TAG","登录");
					 Toast.makeText(Login.this, "登录成功", Toast.LENGTH_LONG).show();
					
					}else{
						
						Toast.makeText(Login.this, "失败", Toast.LENGTH_LONG).show();
					}

				
			}
		});
		
		
		
		
		button1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent intent =new Intent(Login.this,register.class);
			     startActivity(intent);
			}
		});
		}

}
