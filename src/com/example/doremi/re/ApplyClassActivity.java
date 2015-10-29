package com.example.doremi.re;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.example.doremi.R;
import com.example.doremi.R.id;
import com.example.doremi.R.layout;
import com.example.doremi.R.menu;
import com.example.doremi.db.ApplyUser;
import com.example.doremi.db.UserService;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ApplyClassActivity extends Activity {
	EditText applyname, phone,age,elsetime;
	RadioGroup sex,select,clas;	
	CheckBox sarMor,sarNoon,sunMor,sunNoon;
	Button sure;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_apply_class);
		findView();
		 sure.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					String name=applyname.getText().toString().trim();
					   
					if(TextUtils.isEmpty(name)){
						applyname.setError("姓名不能为空");
					    return;
					    }
					Pattern p = Pattern.compile("[\u4e00-\u9fa5]");   
				     Matcher m= p.matcher(name);
				     if(!m.matches()){
					    	applyname.setError("输入有误");
					    return ;
					    }
					
					
					String pho=phone.getText().toString().trim(); 
					 if(TextUtils.isEmpty(pho)){
						    phone.setError("号码不能为空");
						    return;
					 }
					 p = Pattern.compile("[0-9]*");   
				      m = p.matcher(pho); 
				     if(!m.matches()){
						    	phone.setError("输入有误");
						    return ;
						    }
				    
				     
					String ag=age.getText().toString().trim();    
					if(TextUtils.isEmpty(ag)){
					    age.setError("年龄不能为空");
					    return;
					    }
					 p = Pattern.compile("[0-9]*");   
				      m = p.matcher(ag);
					if(!m.matches()){
					    	age.setError("输入有误");
					    return ;
					    }
					String eltime=elsetime.getText().toString().trim();
					if(TextUtils.isEmpty(eltime)){
					if(!sarMor.isChecked()&&!sarNoon.isChecked()&&!sunMor.isChecked()&&!sunNoon.isChecked()){
						Toast.makeText(ApplyClassActivity.this, "请选择上课时间", Toast.LENGTH_LONG).show();
						return;
					}
					}
					String sexstr=((RadioButton)ApplyClassActivity.this.findViewById(sex.getCheckedRadioButtonId())).getText().toString();
					String selstr=((RadioButton)ApplyClassActivity.this.findViewById(select.getCheckedRadioButtonId())).getText().toString();
					String clastr=((RadioButton)ApplyClassActivity.this.findViewById(clas.getCheckedRadioButtonId())).getText().toString();
					Log.i("TAG",name+"_"+pho+"_"+ag+"_"+sexstr);
					UserService uService=new UserService(ApplyClassActivity.this);
					ApplyUser user=new ApplyUser();
					user.setUsername(name);
					user.setPhone(pho);
					user.setAge(ag);
					uService.apply(user);
					Toast.makeText(ApplyClassActivity.this, "您已报班成功，请耐心等候，客服人员将会在三至五个工作日联系您！", Toast.LENGTH_LONG).show();
					
				}
			});
		
	}
	public void findView(){
		applyname=(EditText) findViewById(R.id.apply_name);
		phone=(EditText) findViewById(R.id.phone);
		age=(EditText) findViewById(R.id.age);
		elsetime=(EditText) findViewById(R.id.elsetime);
		sex=(RadioGroup) findViewById(R.id.sexApply1);
		select=(RadioGroup) findViewById(R.id.select);
		clas=(RadioGroup) findViewById(R.id.clas);
		sarMor=(CheckBox) findViewById(R.id.sarMor);
		sarNoon=(CheckBox) findViewById(R.id.sarNoon);
		sunMor=(CheckBox) findViewById(R.id.sunMor);
		sunNoon=(CheckBox) findViewById(R.id.sunNoon);
		sure=(Button) findViewById(R.id.sure);
		}

	
}
