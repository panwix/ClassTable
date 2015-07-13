package com.panwix.classtable;

import com.hpw.classtable.database.ClassDao;
import com.hpw.classtable.database.DBService;
import com.hpw.classtable.database.DBhelper;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class deleteActivity extends Activity {

	private EditText edt;
	private Button btn1;
	private Button btn2;
	private EditText edtweek;
	private EditText edttime;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.delete);

		edt = (EditText)findViewById(R.id.edt1);
		btn1 = (Button)findViewById(R.id.btn1);
		btn2 = (Button)findViewById(R.id.btn2);
		edtweek=(EditText)findViewById(R.id.edtweek);
		edttime = (EditText)findViewById(R.id.edttime);

		btn2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				DBhelper helper = new DBhelper(getBaseContext());
				SQLiteDatabase database = helper.getWritableDatabase();
				//DBService service = new ClassDao(getBaseContext());
				String deleteclass = edt.getText().toString();
				String timestr = edttime.getText().toString();
				String weeknumberstr = edtweek.getText().toString();
				String classTime = timestr+weeknumberstr;
				if(classTime!=""){
					
				//boolean flag = service.deleteClass("class=?,classTime=?", new String[]{deleteclass,classTime});
				String sql = ("delete from Class where classTime = "+classTime);
				database.execSQL(sql);
				}
				//System.out.println("delete------>"+flag);

				Intent intent = new Intent();
				intent.setClass(deleteActivity.this, MainActivity.class);
				startActivity(intent);
				finish();

			}
		});

		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				Intent intent = new Intent();
				intent.setClass(deleteActivity.this, MainActivity.class);
				startActivity(intent);
				finish();
			}
		});
	}
}
