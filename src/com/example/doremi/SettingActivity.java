package com.example.doremi;


import com.example.doremi.R;
import com.example.doremi.R.xml;

import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;


public class SettingActivity extends PreferenceActivity {
	CheckBoxPreference sound;
	Preference clean;
	Preference newVersion;
	Preference exit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.setting_preference);
		clean = findPreference("clean");
		

				       
		 
		
		
		 //soundPreference.setOnPreferenceChangeListener(this);  
		 //servicePreference.setOnPreferenceClickListener(this);  
		 //cleanPreference.setOnPreferenceClickListener(this);  
		 //newVersionPreference.setOnPreferenceChangeListener(this);  
		 //aboutPreference.setOnPreferenceClickListener(this);  
		 
	}
	


}
