package com.example.doremi.re;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.example.doremi.LoginActivity;
import com.example.doremi.MainActivity;
import com.example.doremi.R;
import com.example.doremi.RegisterActivity;
import com.example.doremi.db.ApplyUser;
import com.example.doremi.db.User;
import com.example.doremi.db.UserService;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;



public class ApplyActivity extends Activity {
	EditText applyname, phone,age;
	RadioGroup sex;	
	CheckBox preform,teach,logistics,weekend,workday;
	Button submit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_apply);
	    findView();
	    submit.setOnClickListener(new OnClickListener() {
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
					if(!preform.isChecked()&&!teach.isChecked()&&!logistics.isChecked()){
						Toast.makeText(ApplyActivity.this, "��ѡ���幤����", Toast.LENGTH_LONG).show();
					}
					if(!weekend.isChecked()&&!workday.isChecked()){
						Toast.makeText(ApplyActivity.this, "��ѡ����ʱ��", Toast.LENGTH_LONG).show();
					}
					
					String sexstr=((RadioButton)ApplyActivity.this.findViewById(sex.getCheckedRadioButtonId())).getText().toString();
					Log.i("TAG",name+"_"+pho+"_"+ag+"_"+sexstr);
					UserService uService=new UserService(ApplyActivity.this);
					ApplyUser user=new ApplyUser();
					user.setUsername(name);
					user.setPhone(pho);
					user.setAge(ag);
					uService.apply(user);
					Toast.makeText(ApplyActivity.this, "�ύ�ɹ��������ĵȺ򣬿ͷ���Ա���������������������ϵ����лл���ı�����", Toast.LENGTH_LONG).show();
					
				}
			});
	}
	
	public void findView(){
	applyname=(EditText) findViewById(R.id.apply_name);
	phone=(EditText) findViewById(R.id.phone);
	age=(EditText) findViewById(R.id.age);
	sex=(RadioGroup) findViewById(R.id.sexApply);
	preform=(CheckBox) findViewById(R.id.preform);
	teach=(CheckBox) findViewById(R.id.teach);
	logistics=(CheckBox) findViewById(R.id.logistics);
	weekend=(CheckBox) findViewById(R.id.weekend);
	workday=(CheckBox) findViewById(R.id.workday);
	submit=(Button) findViewById(R.id.submit);
	}
}
