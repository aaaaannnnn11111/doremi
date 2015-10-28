package com.example.doremi.fragment;


import com.example.doremi.R;
import com.example.doremi.R.layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ScrollView;

public class MiFragment extends Fragment {
	private ScrollView scroll;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,  
            Bundle savedInstanceState) {  
        View miLayout = inflater.inflate(R.layout.mi_layout, container, false); 
        scroll  = (ScrollView) miLayout.findViewById(R.id.miScrollView);
        return miLayout;  
    }  
	

}
