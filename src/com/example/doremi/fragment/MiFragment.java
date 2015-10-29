package com.example.doremi.fragment;


import com.example.doremi.MoreActivity;
import com.example.doremi.R;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ScrollView;

public class MiFragment extends Fragment {
	private ScrollView scroll;
	private Button mimore;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,  
            Bundle savedInstanceState) {  
        View miLayout = inflater.inflate(R.layout.mi_layout, container, false); 
        scroll  = (ScrollView) miLayout.findViewById(R.id.miScrollView);
        mimore  = (Button) miLayout.findViewById(R.id.mimore);
        mimore.setOnClickListener(new NewButtonListener());
        return miLayout;  
    }  
	
	 class NewButtonListener implements OnClickListener{  
		   
	        @Override  
	        public void onClick(View arg0) {  
	            // TODO Auto-generated method stub  
	        	Intent intent = new Intent();  
	            intent.setClass(getActivity(), MoreActivity.class);  
	            getActivity().startActivity(intent); 
	        }  
	          
	    } 
	

}
