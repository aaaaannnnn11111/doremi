package com.example.doremi.fragment;


import com.example.doremi.R;
import com.example.doremi.R.layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ReFragment extends Fragment {
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,  
            Bundle savedInstanceState) {  
        View reLayout = inflater.inflate(R.layout.re_layout, container, false);  
        return reLayout;  
    }  
	

}
