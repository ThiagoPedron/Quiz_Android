package com.rufflez.quiz;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;

public class Score extends Activity{
	
	TextView q1_score, q2_score, q3_score, q4_score, q5_score, final_score;
	int finalscore;
	int q2answer, q3answer, q4answer, q5answer;
	String q1;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.score);
		initControls();
	}
	
	public void onStart(){
		super.onStart();
	}
	
	public void initControls(){
		
		q1_score = (TextView)findViewById(R.id.q1_score);
		q2_score = (TextView)findViewById(R.id.q2_score);
		q3_score = (TextView)findViewById(R.id.q3_score);
		q4_score = (TextView)findViewById(R.id.q4_score);
		q5_score = (TextView)findViewById(R.id.q5_score);
		final_score = (TextView)findViewById(R.id.final_score);
		
		final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(this);
		
		int q1answer = app_preferences.getInt("answer_value", 0);
		int q2answer = app_preferences.getInt("answer_value2", 0);
		int q3answer = app_preferences.getInt("answer_value3", 0);
		int q4answer = app_preferences.getInt("answer_value4", 0);
		int q5answer = app_preferences.getInt("answer_value5", 0);
		
		if ( q1answer == 1 ){
			q1_score.setText("Certo");
		} else {
			q1_score.setText("Errado");
		}
		
		if ( q2answer == 1){
			q2_score.setText("Certo");
		} else {
			q2_score.setText("Errado");
		}
		
		if ( q3answer == 1){
			q3_score.setText("Certo");
		} else {
			q3_score.setText("Errado");
		}
		
		if ( q4answer == 1){
			q4_score.setText("Certo");
		} else {
			q4_score.setText("Errados");
		}
		
		if ( q5answer == 1){
			q5_score.setText("Certo");
		} else {
			q5_score.setText("Errado");
		}
		finalscore =  q1answer + q2answer + q3answer + q4answer + q5answer;
		final_score.setText(finalscore + "/5");
	}
	
	
	
	
	
}
