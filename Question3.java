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

public class Question3 extends Fragment {

	RadioButton q3a1,q3a2,q3a3;
	Button btn3;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		return inflater.inflate(R.layout.question3, null);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		q3a3 = (RadioButton)getView().findViewById(R.id.q3a3);
		q3a1 = (RadioButton)getView().findViewById(R.id.q3a1);
		q3a2 = (RadioButton)getView().findViewById(R.id.q3a2);
		
		q3a1.setOnClickListener(listener);
		q3a2.setOnClickListener(listener);
		q3a3.setOnClickListener(listener);
		
	}
	
	Button.OnClickListener listener = new Button.OnClickListener(){
		@Override
		public void onClick(View v){
			final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
			SharedPreferences.Editor editor = app_preferences.edit();
			
			if (q3a3.isChecked()){
				editor.putInt("answer_value3", 1);
			} else {
				editor.putInt("answer_value3", 0);
			}
			editor.commit();
		}
	};
}
