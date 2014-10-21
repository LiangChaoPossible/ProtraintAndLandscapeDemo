package com.example.landandprotrait;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BottomFragment extends Fragment{

	@Override
	public void onAttach(Activity activity) {
		Log.w("LANDP","Fragment onAttach()");
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.w("LANDP","Fragment onCreate()");
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.w("LANDP","Fragment onCreateView()");
		View view = inflater.inflate(R.layout.bottomfragment, null , false);
		return view;
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		Log.w("LANDP","Fragment onViewCreated()");
		super.onViewCreated(view, savedInstanceState);
	}
	

	@Override
	public void onDestroy() {
		Log.w("LANDP","Fragment onDestroy()");

		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	public void onDestroyView() {
		Log.w("LANDP","Fragment onDestroyView()");

		// TODO Auto-generated method stub
		super.onDestroyView();
	}

	@Override
	public void onDetach() {
		Log.w("LANDP","Fragment onDetach()");

		// TODO Auto-generated method stub
		super.onDetach();
	}

	@Override
	public void onPause() {
		Log.w("LANDP","Fragment onPause()");

		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	public void onResume() {
		Log.w("LANDP","Fragment onResume()");

		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	public void onStart() {
		Log.w("LANDP","Fragment onStart()");

		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	public void onStop() {
		Log.w("LANDP","Fragment onStop()");

		// TODO Auto-generated method stub
		super.onStop();
	}
	
	


}
