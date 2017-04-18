package com.rufflez.quiz;

import android.support.v4.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
public class Question2 extends Fragment{
	
	RadioButton q2a1,q2a2,q2a3;
	Button btn2;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View v = inflater.inflate(R.layout.question2, null);
		return v;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		q2a1 = (RadioButton)getView().findViewById(R.id.q2a1);
		q2a2 = (RadioButton)getView().findViewById(R.id.q2a2);
		q2a3 = (RadioButton)getView().findViewById(R.id.q2a3);
		
		q2a1.setOnClickListener(listener);
		q2a2.setOnClickListener(listener);
		q2a3.setOnClickListener(listener);
		
	}
	
	Button.OnClickListener listener = new Button.OnClickListener(){
		@Override
		public void onClick(View v){
			final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
			SharedPreferences.Editor editor = app_preferences.edit();
			
			if (q2a1.isChecked()){
				editor.putInt("answer_value2", 1);
			} else {
				editor.putInt("answer_value2", 0);
			}
			editor.commit();
		}
	};
}
