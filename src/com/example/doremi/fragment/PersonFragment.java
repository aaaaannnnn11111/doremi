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
import com.example.doremi.person.CollectionActivity;
import com.example.doremi.person.DonateActivity;
import com.example.doremi.person.DownloadActivity;
import com.example.doremi.person.TeamActivity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class PersonFragment extends ListFragment {
	private ListView list;
	private Button login_button;
	private String[] values = new String[] { "我的信息","我的活动","我的团队","我的捐款" };  
	private int[] images = new int[] { R.drawable.person,  R.drawable.person, R.drawable.person,R.drawable.person }; 
    
    
    
	public View onCreateView(LayoutInflater inflater, ViewGroup container,  
            Bundle savedInstanceState) {  
        View  personLayout= inflater.inflate(R.layout.person_layout, container, false); 
        login_button = (Button) personLayout.findViewById(R.id.login_button);
        list = (ListView) personLayout.findViewById(android.R.id.list);
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

		 
		 public void onListItemClick(ListView l, View v, int position, long id) {
         	super.onListItemClick(l, v, position, id); 
                 switch(position){
                 case 0:
                         Intent intent0=new Intent(getActivity(),CollectionActivity.class);
                         startActivity(intent0);
                         break;
                         
                 case 1:
                     Intent intent1=new Intent(getActivity(),DownloadActivity.class);
                     startActivity(intent1);
                     break;
                 case 2:
                     Intent intent2=new Intent(getActivity(),TeamActivity.class);
                     startActivity(intent2);
                     break;
                     
             case 3:
                 Intent intent3=new Intent(getActivity(),DonateActivity.class);
                 startActivity(intent3);
                 break;
                 }
		      
     


}
		 
}
