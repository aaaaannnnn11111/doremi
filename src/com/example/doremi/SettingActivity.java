package com.example.doremi;


import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;


public class SettingActivity extends PreferenceActivity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.setting_preference);
		
		
		 //soundPreference.setOnPreferenceChangeListener(this);  
		 //servicePreference.setOnPreferenceClickListener(this);  
		 //cleanPreference.setOnPreferenceClickListener(this);  
		 //newVersionPreference.setOnPreferenceChangeListener(this);  
		 //aboutPreference.setOnPreferenceClickListener(this);  
		 
	}
	


}
