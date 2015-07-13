package com.panwix.classtable.activitys;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.hpw.classtable.MainActivity;
import com.hpw.classtable.R;
import com.hpw.classtable.database.ClassDao;
import com.hpw.classtable.database.DBService;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class activity11 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity11);

		TextView tv0 = (TextView) findViewById(R.id.classtv01);
		TextView tv1 = (TextView) findViewById(R.id.classtv11);
		TextView tv2 = (TextView) findViewById(R.id.classtv21);
		TextView tv3 = (TextView) findViewById(R.id.classtv31);
		TextView tv4 = (TextView) findViewById(R.id.classtv42);
		TextView tv5 = (TextView) findViewById(R.id.classtv51);
		TextView tv6 = (TextView) findViewById(R.id.classtv61);
		TextView tv7 = (TextView) findViewById(R.id.classtv71);
		TextView tv8 = (TextView) findViewById(R.id.classtv81);

		Bundle bundle = getIntent().getExtras();
		String key = bundle.getString("11");


		DBService service = new ClassDao(getApplicationContext());
		Map<String, String> map = service.selectClass("classTime=?",
				new String[] { key });


		String[] name = new String[30];
		int k = 0;

		if (map.get("class") == null) {

			Toast.makeText(this, "û�п�Ŷ~", Toast.LENGTH_SHORT).show();
			finish();
		} else {

			Set<String> set = map.keySet();
			Iterator<String> it = set.iterator();
			for (int i = 0; i < 10; i++) {

				String str = it.next();

				name[i] = map.get(str);

			}

			tv7.setText(name[0]);
			tv1.setText(name[2]);
			tv5.setText(name[3]);
			tv2.setText(name[4]);
			tv6.setText(name[5]);
			tv4.setText(name[6]);
			tv0.setText(name[7]);
			tv3.setText(name[8]);
			tv8.setText(name[9]);
		}
	}

}
