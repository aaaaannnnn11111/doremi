package com.example.doremi.fragment;


import com.example.doremi.LoginActivity;
import com.example.doremi.R;
import com.example.doremi.re.ApplyActivity;
import com.example.doremi.re.ApplyClassActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ReFragment extends Fragment {
	private Button apply_button,applyClass_button,chain_button,join_button,music_button;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,  
            Bundle savedInstanceState) {  
        View reLayout = inflater.inflate(R.layout.re_layout, container, false);
        apply_button = (Button) reLayout.findViewById(R.id.apply_button);
        applyClass_button = (Button) reLayout.findViewById(R.id.applyClass_button);
        chain_button = (Button) reLayout.findViewById(R.id.chain_button);
        join_button = (Button) reLayout.findViewById(R.id.join_button);
        music_button = (Button) reLayout.findViewById(R.id.music_button);
        
        apply_button.setOnClickListener(new NewButtonListener1());
        applyClass_button.setOnClickListener(new NewButtonListener2());
        chain_button.setOnClickListener(new NewButtonListener3());
        join_button.setOnClickListener(new NewButtonListener4());
        music_button.setOnClickListener(new NewButtonListener5());
        return reLayout;  
    } 
	
	 class NewButtonListener1 implements OnClickListener{  
		   
	        @Override  
	        public void onClick(View arg0) {  
	            // TODO Auto-generated method stub  
	        	Intent intent = new Intent();  
	            intent.setClass(getActivity(), ApplyActivity.class);  
	            getActivity().startActivity(intent); 
	        }  
	          
	    } 
	 class NewButtonListener2 implements OnClickListener{  
		   
	        @Override  
	        public void onClick(View arg0) {  
	            // TODO Auto-generated method stub  
	        	Intent intent = new Intent();  
	            intent.setClass(getActivity(), ApplyClassActivity.class);  
	            getActivity().startActivity(intent); 
	        }  
	          
	    } 
	 class NewButtonListener3 implements OnClickListener{  
		   
	        @Override  
	        public void onClick(View arg0) {  
	            // TODO Auto-generated method stub  
	        	Intent intent = new Intent();  
	            intent.setClass(getActivity(), LoginActivity.class);  
	            getActivity().startActivity(intent); 
	        }  
	          
	    } 
	 class NewButtonListener4 implements OnClickListener{  
		   
	        @Override  
	        public void onClick(View arg0) {  
	            // TODO Auto-generated method stub  
	        	Intent intent = new Intent();  
	            intent.setClass(getActivity(), LoginActivity.class);  
	            getActivity().startActivity(intent); 
	        }  
	          
	    } 
	 class NewButtonListener5 implements OnClickListener{  
		   
	        @Override  
	        public void onClick(View arg0) {  
	            // TODO Auto-generated method stub  
	        	Intent intent = new Intent();  
	            intent.setClass(getActivity(), LoginActivity.class);  
	            getActivity().startActivity(intent); 
	        }  
	          
	    } 
			
}
