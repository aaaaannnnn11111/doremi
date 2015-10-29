package com.example.doremi.dooo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.doremi.R;
import com.example.doremi.R.id;
import com.example.doremi.R.layout;
import com.example.doremi.R.menu;
import com.example.doremi.person.CollectionActivity;
import com.example.doremi.person.DonateActivity;
import com.example.doremi.person.DownloadActivity;
import com.example.doremi.person.TeamActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class VideoActivity extends Activity {
	
	 private ListView mylist;
	 private ArrayList<String> list = new ArrayList<String>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_video);
		 mylist = (ListView)findViewById(R.id.mylistView);

	        list.add("DOREMI宣传片");

	        list.add("DOREMI支教宣传片");

	        list.add("更多精彩敬請期待");


	        ArrayAdapter<String> myArrayAdapter = new ArrayAdapter<String>

	                            (this,android.R.layout.simple_list_item_1,list);

	        mylist.setAdapter(myArrayAdapter);

	        mylist.setOnItemClickListener(new OnItemClickListener(){

	        	 

	            @Override

	            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,

	                    long arg3) {

	                // TODO Auto-generated method stub

	                if(list.get(arg2).equals("DOREMI宣传片"))

	                {

	                	Uri uri0 = Uri.parse("http://v.youku.com/v_show/id_XMTM3MjA5MTEzMg==.html?from=y1.7-1.2");
	                	Intent it0   = new Intent(Intent.ACTION_VIEW,uri0);
	                	startActivity(it0);

	                }

	                if(list.get(arg2).equals("DOREMI支教宣传片"))

	                {

	                	Uri uri1 = Uri.parse("http://v.youku.com/v_show/id_XMTM3MjA3NDk5Mg==.html?from=y1.7-1.2");
	                	Intent it1   = new Intent(Intent.ACTION_VIEW,uri1);
	                	startActivity(it1);

	                }
	             

	        }
	     });

	    }
}
