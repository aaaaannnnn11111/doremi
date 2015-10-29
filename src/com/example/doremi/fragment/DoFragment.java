package com.example.doremi.fragment;


import com.example.doremi.R;
import com.example.doremi.dooo.VideoActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class DoFragment extends Fragment {
	private Button video_button, music_button,activity_button;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,  
            Bundle savedInstanceState) {  
        View doLayout = inflater.inflate(R.layout.do_layout, container, false); 
        video_button = (Button) doLayout.findViewById(R.id.video_button);
        music_button = (Button) doLayout.findViewById(R.id.music_button);
        activity_button = (Button) doLayout.findViewById(R.id.activity_button);
        
        video_button.setOnClickListener(new NewButtonListener1());
        music_button.setOnClickListener(new NewButtonListener2());
        activity_button.setOnClickListener(new NewButtonListener3());
        
        return doLayout;  
    }  
	 class NewButtonListener1 implements OnClickListener{  
		   
	        @Override  
	        public void onClick(View arg0) {  
	            // TODO Auto-generated method stub  
	        	Intent intent = new Intent();  
	            intent.setClass(getActivity(), VideoActivity.class);  
	            getActivity().startActivity(intent); 
	        }  
	          
	    } 
	 class NewButtonListener2 implements OnClickListener{  
		   
	        @Override  
	        public void onClick(View arg0) {  
	            // TODO Auto-generated method stub  
	        	Toast.makeText(getActivity(),"该功能还在完善中哦",Toast.LENGTH_LONG).show();
	        }  
	          
	    }  class NewButtonListener3 implements OnClickListener{  
		   
	        @Override  
	        public void onClick(View arg0) {  
	            // TODO Auto-generated method stub  
	        	Toast.makeText(getActivity(),"该功能还在完善中哦",Toast.LENGTH_LONG).show();
	        }  
	          
	    } 

}
