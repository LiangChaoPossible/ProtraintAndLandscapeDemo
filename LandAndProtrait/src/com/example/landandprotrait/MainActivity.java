package com.example.landandprotrait;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity extends FragmentActivity {
	private ListView listView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.w("LANDP", "onCreate()");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		listView = (ListView) this.findViewById(R.id.listview);

		/** listview µÄºáÊúÆÁ */
		String[] from = { "title", "subtitle" };
		int[] to = { R.id.title, R.id.subtitle };
		List<HashMap<String, String>> list = this.makeDefaultContents();
		SimpleAdapter adapter = new SimpleAdapter(this, list,
				R.layout.listview_item, from, to);
		listView.setAdapter(adapter);

		/** fragmentµÄºáÊúÆÁ  */
		FragmentManager fragmentManager = this.getSupportFragmentManager();
		FragmentTransaction fragmentTransaction = fragmentManager
				.beginTransaction();
		BottomFragment fragment = new BottomFragment();
		fragmentTransaction.add(R.id.bottomfragment, fragment);
		fragmentTransaction.commit();

	}

	private List<HashMap<String, String>> makeDefaultContents() {
		int defaultSize = 30;
		ArrayList<HashMap<String, String>> res = new ArrayList<HashMap<String, String>>();
		for (int ind = 0; ind < defaultSize; ind++) {
			HashMap<String, String> item = new HashMap<String, String>();
			item.put("title", "title" + ind);
			item.put("subtitle", "subtitle" + ind);

			res.add(item);
		}
		return res;
	}

	@Override
	protected void onPause() {
		Log.w("LANDP", "onPause()");
		super.onPause();
	}

	@Override
	protected void onRestart() {
		Log.w("LANDP", "onRestart()");
		super.onRestart();
	}

	@Override
	protected void onResume() {
		Log.w("LANDP", "onResume()");
		super.onResume();
	}

	@Override
	protected void onStart() {
		Log.w("LANDP", "onStart()");
		super.onStart();
	}

	@Override
	protected void onStop() {
		Log.w("LANDP", "onStop()");
		super.onStop();
	}

	
	@Override
	protected void onDestroy() {
		Log.w("LANDP", "onDestroy()");
		super.onDestroy();
	}


	public class Content {
		public String title;
		public String subtitle;
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		Log.w("LANDP", "onConfigurationChanged()");

	}

}
