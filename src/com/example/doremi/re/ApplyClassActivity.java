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
						applyname.setError("��������Ϊ��");
					    return;
					    }
					Pattern p = Pattern.compile("[\u4e00-\u9fa5]");   
				     Matcher m= p.matcher(name);
				     if(!m.matches()){
					    	applyname.setError("��������");
					    return ;
					    }
					
					
					String pho=phone.getText().toString().trim(); 
					 if(TextUtils.isEmpty(pho)){
						    phone.setError("���벻��Ϊ��");
						    return;
					 }
					 p = Pattern.compile("[0-9]*");   
				      m = p.matcher(pho); 
				     if(!m.matches()){
						    	phone.setError("��������");
						    return ;
						    }
				    
				     
					String ag=age.getText().toString().trim();    
					if(TextUtils.isEmpty(ag)){
					    age.setError("���䲻��Ϊ��");
					    return;
					    }
					 p = Pattern.compile("[0-9]*");   
				      m = p.matcher(ag);
					if(!m.matches()){
					    	age.setError("��������");
					    return ;
					    }
					String eltime=elsetime.getText().toString().trim();
					if(TextUtils.isEmpty(eltime)){
					if(!sarMor.isChecked()&&!sarNoon.isChecked()&&!sunMor.isChecked()&&!sunNoon.isChecked()){
						Toast.makeText(ApplyClassActivity.this, "��ѡ���Ͽ�ʱ��", Toast.LENGTH_LONG).show();
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
					Toast.makeText(ApplyClassActivity.this, "���ѱ���ɹ��������ĵȺ򣬿ͷ���Ա���������������������ϵ����", Toast.LENGTH_LONG).show();
					
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
