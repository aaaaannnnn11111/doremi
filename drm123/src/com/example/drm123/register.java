package com.example.drm123;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;



public class register extends Activity {
	Button button;
	EditText useremail;
	EditText password;
	EditText age;
	EditText name;
	EditText telephone;
	RadioGroup sex;	
	
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        button=(Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				//数据库
				String email=useremail.getText().toString().trim();
				String pass=password.getText().toString().trim();
				String agestr=age.getText().toString().trim();
				String namestr=name.getText().toString().trim();
				String telephonestr=telephone.getText().toString().trim();
				String sexstr=((RadioButton)register.this.findViewById(sex.getCheckedRadioButtonId())).getText().toString();
				findViews();
				Log.i("TAG",email+"_"+pass+"_"+namestr+" "+agestr+"_"+sexstr+" "+telephonestr);
				new useUser(register.this);
				User user=new User();
				user.setPassword(pass);
				user.setAge(Integer.parseInt(agestr));
				user.setSex(sexstr);
				user.setName(namestr);
				user.setTelephone(telephonestr);
				useUser.register(user);
				
			}
        });  
        button.setOnClickListener(new View.OnClickListener() {
				
			
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
						//跳回主界面
				Toast.makeText(register.this, "注册成功", Toast.LENGTH_LONG).show();

				Intent intent=new Intent(register.this,MainActivity.class);
				startActivity(intent);	
				}
		});
    }
        private void findViews() {
    		useremail=(EditText) findViewById(R.id.useremail);
    		password=(EditText) findViewById(R.id.password);
    		age=(EditText) findViewById(R.id.age);
    		name=(EditText) findViewById(R.id.name);
    		telephone=(EditText) findViewById(R.id.telephone);
    		sex=(RadioGroup) findViewById(R.id.gender);
    		button=(Button) findViewById(R.id.button1);
    	
    }
	
}
