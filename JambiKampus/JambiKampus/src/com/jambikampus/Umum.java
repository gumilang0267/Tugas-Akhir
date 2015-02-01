package com.jambikampus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Umum extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_umum);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.umum, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	public void openunja(View v){
		Intent intensaya=new Intent(getApplicationContext(),
				Unja.class);
		startActivity(intensaya);
	}
	public void openiain(View v){
		Intent intensaya=new Intent(getApplicationContext(),
				Iain.class);
		startActivity(intensaya);
	}
	public void openut(View v){
		Intent intensaya=new Intent(getApplicationContext(),
				Ut.class);
		startActivity(intensaya);
	}
}
