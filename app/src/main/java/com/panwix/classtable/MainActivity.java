package com.panwix.classtable;

import java.util.Map;

import com.hpw.classtable.activitys.activity11;
import com.hpw.classtable.database.ClassDao;
import com.hpw.classtable.database.DBService;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView tv11;
	private TextView tv12;
	private TextView tv13;
	private TextView tv14;
	private TextView tv15;
	private TextView tv21;
	private TextView tv22;
	private TextView tv23;
	private TextView tv24;
	private TextView tv25;
	private TextView tv31;
	private TextView tv32;
	private TextView tv33;
	private TextView tv34;
	private TextView tv35;
	private TextView tv41;
	private TextView tv42;
	private TextView tv43;
	private TextView tv44;
	private TextView tv45;
	private TextView tv51;
	private TextView tv52;
	private TextView tv53;
	private TextView tv54;
	private TextView tv55;
	private TextView tv61;
	private TextView tv62;
	private TextView tv63;
	private TextView tv64;
	private TextView tv65;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main);

		tv11 = (TextView) findViewById(R.id.tv11);
		tv12 = (TextView) findViewById(R.id.tv12);
		tv13 = (TextView) findViewById(R.id.tv13);
		tv14 = (TextView) findViewById(R.id.tv14);
		tv15 = (TextView) findViewById(R.id.tv15);
		tv21 = (TextView) findViewById(R.id.tv21);
		tv22 = (TextView) findViewById(R.id.tv22);
		tv23 = (TextView) findViewById(R.id.tv23);
		tv24 = (TextView) findViewById(R.id.tv24);
		tv25 = (TextView) findViewById(R.id.tv25);
		tv31 = (TextView) findViewById(R.id.tv31);
		tv32 = (TextView) findViewById(R.id.tv32);
		tv33 = (TextView) findViewById(R.id.tv33);
		tv34 = (TextView) findViewById(R.id.tv34);
		tv35 = (TextView) findViewById(R.id.tv35);
		tv41 = (TextView) findViewById(R.id.tv41);
		tv42 = (TextView) findViewById(R.id.tv42);
		tv43 = (TextView) findViewById(R.id.tv43);
		tv44 = (TextView) findViewById(R.id.tv44);
		tv45 = (TextView) findViewById(R.id.tv45);
		tv51 = (TextView) findViewById(R.id.tv51);
		tv52 = (TextView) findViewById(R.id.tv52);
		tv53 = (TextView) findViewById(R.id.tv53);
		tv54 = (TextView) findViewById(R.id.tv54);
		tv55 = (TextView) findViewById(R.id.tv55);
		tv61 = (TextView) findViewById(R.id.tv61);
		tv62 = (TextView) findViewById(R.id.tv62);
		tv63 = (TextView) findViewById(R.id.tv63);
		tv64 = (TextView) findViewById(R.id.tv64);
		tv65 = (TextView) findViewById(R.id.tv65);

		tv11.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "11");
				startActivity(intent);
			}
		});
		tv12.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "12");
				startActivity(intent);
			}
		});
		tv12.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "12");
				startActivity(intent);
			}
		});
		tv13.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "13");
				startActivity(intent);
			}
		});
		tv14.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "14");
				startActivity(intent);
			}
		});
		tv15.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "15");
				startActivity(intent);
			}
		});
		tv21.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "21");
				startActivity(intent);
			}
		});
		tv22.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "22");
				startActivity(intent);
			}
		});
		tv23.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "23");
				startActivity(intent);
			}
		});
		tv24.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "24");
				startActivity(intent);
			}
		});
		tv25.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "25");
				startActivity(intent);
			}
		});
		tv31.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "31");
				startActivity(intent);
			}
		});
		tv32.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "32");
				startActivity(intent);
			}
		});
		tv33.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "33");
				startActivity(intent);
			}
		});
		tv34.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "34");
				startActivity(intent);
			}
		});
		tv35.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "35");
				startActivity(intent);
			}
		});
		tv41.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "41");
				startActivity(intent);
			}
		});
		tv42.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "42");
				startActivity(intent);
			}
		});
		tv43.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "43");
				startActivity(intent);
			}
		});
		tv44.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "44");
				startActivity(intent);
			}
		});
		tv45.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "45");
				startActivity(intent);
			}
		});
		tv51.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "51");
				startActivity(intent);
			}
		});
		tv52.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "52");
				startActivity(intent);
			}
		});
		tv53.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "53");
				startActivity(intent);
			}
		});
		tv54.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "54");
				startActivity(intent);
			}
		});
		tv55.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "55");
				startActivity(intent);
			}
		});
		tv61.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "61");
				startActivity(intent);
			}
		});
		tv62.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "62");
				startActivity(intent);
			}
		});
		tv63.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "63");
				startActivity(intent);
			}
		});
		tv64.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "64");
				startActivity(intent);
			}
		});
		tv65.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, activity11.class);
				intent.putExtra("11", "65");
				startActivity(intent);
			}
		});

		String[] name = new String[30];

		int k = 0;
		DBService service = new ClassDao(getApplicationContext());

		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < 6; j++) {
				String s = Integer.toString(i);
				String m = Integer.toString(j);
				String sm = s + m;

				Map<String, String> map = service.selectClass("classTime=?",
						new String[] { sm });


				name[k] = map.get("class");

				k++;

			}
		}

		System.out.println("123456" + name[0]);
		tv11.setText(name[0]);
		tv12.setText(name[1]);
		tv13.setText(name[2]);
		tv14.setText(name[3]);
		tv15.setText(name[4]);
		tv21.setText(name[5]);
		tv22.setText(name[6]);
		tv23.setText(name[7]);
		tv24.setText(name[8]);
		tv25.setText(name[9]);
		tv31.setText(name[10]);
		tv32.setText(name[11]);
		tv33.setText(name[12]);
		tv34.setText(name[13]);
		tv35.setText(name[14]);
		tv41.setText(name[15]);
		tv42.setText(name[16]);
		tv43.setText(name[17]);
		tv44.setText(name[18]);
		tv45.setText(name[19]);
		tv51.setText(name[20]);
		tv52.setText(name[21]);
		tv53.setText(name[22]);
		tv54.setText(name[23]);
		tv55.setText(name[24]);
		tv61.setText(name[25]);
		tv62.setText(name[26]);
		tv63.setText(name[27]);
		tv64.setText(name[28]);
		tv65.setText(name[29]);

	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(0, 0, 0, "��ӿγ�");
		menu.add(0, 1, 1, "ɾ��γ�");

		return super.onCreateOptionsMenu(menu);
	}


	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		super.onOptionsItemSelected(item);
		switch (item.getItemId()) {
		case 0:
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, addActivity.class);
			startActivity(intent);
			finish();
			break;
		case 1:
			Intent intent2 = new Intent();
			intent2.setClass(MainActivity.this, deleteActivity.class);
			startActivity(intent2);
			finish();
			break;

		}
		return super.onMenuItemSelected(featureId, item);
	}

}
