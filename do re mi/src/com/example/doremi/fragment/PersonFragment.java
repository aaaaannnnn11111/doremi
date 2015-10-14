package com.example.doremi.fragment;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.doremi.LoginActivity;
import com.example.doremi.R;
import com.example.doremi.R.drawable;
import com.example.doremi.R.id;
import com.example.doremi.R.layout;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.SimpleAdapter;

public class PersonFragment extends ListFragment {
	
	private String[] values = new String[] { "我的收藏","我的下载","我的团队","我的捐款" };  
	private int[] images = new int[] { R.drawable.dooo,  R.drawable.re, R.drawable.mi,R.drawable.person }; 
    
    
    
	public View onCreateView(LayoutInflater inflater, ViewGroup container,  
            Bundle savedInstanceState) {  
        View  personLayout= inflater.inflate(R.layout.person_layout, container, false); 
        Button login_button = (Button) personLayout.findViewById(R.id.login_button);
        login_button.setOnClickListener(new NewButtonListener()); 
        return personLayout;  
    }  
	
	  class NewButtonListener implements OnClickListener{  
		   
	        @Override  
	        public void onClick(View arg0) {  
	            // TODO Auto-generated method stub  
	        	Intent intent = new Intent();  
	            intent.setClass(getActivity(), LoginActivity.class);  
	            getActivity().startActivity(intent); 
	        }  
	          
	    } 
	
	 public void onActivityCreated(Bundle savedInstanceState) {  
	        super.onActivityCreated(savedInstanceState);  
	  
	        List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();  
	        for (int i = 0; i < values.length; i++) {  
	            Map<String, Object> listItem = new HashMap<String, Object>();  
	            listItem.put("values", values[i]);  
	            listItem.put("images", images[i]);  
	            listItems.add(listItem);  
	        }  
	        SimpleAdapter adapter = new SimpleAdapter(getActivity(), listItems,  
	                R.layout.list_item, new String[] { "values", "images" },  
	                new int[] { R.id.item_text, R.id.item_icon });  
	        setListAdapter(adapter);  
	  
	    } 
	 

}
