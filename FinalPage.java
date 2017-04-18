package com.rufflez.quiz;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class FinalPage extends Fragment{
	
	Button get_score;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		return inflater.inflate(R.layout.final_page, null);
	}
	
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		
		get_score = (Button)getView().findViewById(R.id.get_score);
		get_score.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent i = new Intent(getActivity(), Score.class);
				startActivity(i);
			}
		});
	}

}
