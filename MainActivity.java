package com.rufflez.quiz;

import com.viewpagerindicator.PageIndicator;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity {
	
	FragmentAdapter mAdapter;
	ViewPager mPager;
	PageIndicator mPageIndicator;
	String share_name = "Q1_Answer";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mAdapter = new FragmentAdapter(getSupportFragmentManager());
		
		mPager = (ViewPager)findViewById(R.id.pager);
		mPager.setAdapter(mAdapter);
		
		mPageIndicator = (PageIndicator)findViewById(R.id.indicator);
		mPageIndicator.setViewPager(mPager);
	
	}

}
