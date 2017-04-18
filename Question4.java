package com.rufflez.quiz;

import android.support.v4.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;

public class Question4 extends Fragment{
	
	RadioButton q4a1,q4a2,q4a3;
	Button btn4;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		return inflater.inflate(R.layout.question4, null);
	}
	
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		q4a3 = (RadioButton)getView().findViewById(R.id.q4a3);
		q4a1 = (RadioButton)getView().findViewById(R.id.q4a1);
		q4a2 = (RadioButton)getView().findViewById(R.id.q4a2);
		
		q4a1.setOnClickListener(listener);
		q4a2.setOnClickListener(listener);
		q4a3.setOnClickListener(listener);
	}
	
	Button.OnClickListener listener = new Button.OnClickListener(){
		@Override
		public void onClick(View v){
			final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
			SharedPreferences.Editor editor = app_preferences.edit();
			
			if (q4a3.isChecked()){
				editor.putInt("answer_value4", 1);
			} else {
				editor.putInt("answer_value4", 0);
			}
			editor.commit();
		}
	};
}
