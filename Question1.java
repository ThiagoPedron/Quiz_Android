package com.rufflez.quiz;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
public class Question1 extends Fragment{
	
	RadioButton q1a1,q1a2,q1a3;
	Button btn1;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View v = inflater.inflate(R.layout.question1, null);
		return v;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		q1a2 = (RadioButton)getView().findViewById(R.id.q1a2);
		q1a1 = (RadioButton)getView().findViewById(R.id.q1a1);
		q1a3 = (RadioButton)getView().findViewById(R.id.q1a3);
		
		q1a2.setOnClickListener(listener);
		q1a1.setOnClickListener(listener);
		q1a3.setOnClickListener(listener);
		
	}
	
	Button.OnClickListener listener = new Button.OnClickListener(){
		@Override
		public void onClick(View v){
			final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
			SharedPreferences.Editor editor = app_preferences.edit();
			
			if (q1a2.isChecked()){
				editor.putInt("answer_value", 1);
			} else {
				editor.putInt("answer_value", 0);
			}
			editor.commit();
		}
	};
	
}
