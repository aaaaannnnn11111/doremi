package com.example.doremi;

import com.example.doremi.db.User;
import com.example.doremi.db.UserService;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RegisterActivity extends Activity {
	EditText username;
	EditText password;
	EditText repassword;
	RadioGroup sex;	
	Button register;
	
	
	 


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		findViews();
		
	    
	    register.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				String name=username.getText().toString().trim();
				if(TextUtils.isEmpty(name)){
					username.setError("账户不能为空");
				    return;
				    }
				String pass=password.getText().toString().trim();
				 if(TextUtils.isEmpty(pass)){
					    password.setError("密码不能为空");
					    return;
					    }
				String repass=repassword.getText().toString().trim();
				if(TextUtils.isEmpty(repass)){
				    repassword.setError("确认密码不能为空");
				    return;
				    }
				    if(!pass.equals(repass)){
				    Toast.makeText(RegisterActivity.this, "两次密码不一致", 2000).show();
				    return ;
				    }
				String sexstr=((RadioButton)RegisterActivity.this.findViewById(sex.getCheckedRadioButtonId())).getText().toString();
				Log.i("TAG",name+"_"+pass+"_"+repass+"_"+sexstr);
				UserService uService=new UserService(RegisterActivity.this);
				User user=new User();
				user.setUsername(name);
				user.setPassword(pass);
				uService.register(user);
				Toast.makeText(RegisterActivity.this, "注册成功", Toast.LENGTH_LONG).show();
				
				Intent intent=new Intent(RegisterActivity.this,MainActivity.class);
				startActivity(intent);
			}
		});
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
	
	 
}
