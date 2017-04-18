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

public class Question5 extends Fragment{
	
	RadioButton q5a1,q5a2,q5a3;
	Button btn5;

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		return inflater.inflate(R.layout.question5, null);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		q5a1 = (RadioButton)getView().findViewById(R.id.q5a1);
		q5a2 = (RadioButton)getView().findViewById(R.id.q5a2);
		q5a3 = (RadioButton)getView().findViewById(R.id.q5a3);
		
		q5a1.setOnClickListener(listener);
		q5a2.setOnClickListener(listener);
		q5a3.setOnClickListener(listener);
		
	}
	
	Button.OnClickListener listener = new Button.OnClickListener(){
		@Override
		public void onClick(View v){
			final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
			SharedPreferences.Editor editor = app_preferences.edit();
			
			if (q5a1.isChecked()){
				editor.putInt("answer_value5", 1);
			} else {
				editor.putInt("answer_value5", 0);
			}
			editor.commit();
		}
	};
	
}
