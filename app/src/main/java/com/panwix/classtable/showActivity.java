package com.panwix.classtable;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;

import com.panwix.classtable.database.DBhelper;

public class showActivity extends Activity {
	String weekNo;
	String week;
	String time;

	String className;
	String classRoom;
	String teacher;
	String teacherRoom;
	String weekStart;
	String weekEnd;
	String mail;
	String tel;
	String phone;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.yanshi);

		Bundle bundle = getIntent().getExtras();
		weekNo = bundle.getString("weekNo");
		week = bundle.getString("week");
		time = bundle.getString("time");

		DBhelper helper = new DBhelper(getBaseContext());
		String sql = "select * from Class where week = ? and classTime =?";
		SQLiteDatabase database = helper.getWritableDatabase();
		Cursor cursor = database.rawQuery(sql, new String[]{week, time});
		int i = cursor.getCount();
		if (i > 0) {
			cursor.moveToFirst();
			weekStart = cursor.getString(cursor.getColumnIndex("classStart"));
			weekEnd = cursor.getString(cursor.getColumnIndex("classEnd"));
			weekStart = cursor.getString(cursor.getColumnIndex("classStart"));
			weekEnd = cursor.getString(cursor.getColumnIndex("classEnd"));
			className = cursor.getString(cursor.getColumnIndex("class"));
			classRoom = cursor.getString(cursor.getColumnIndex("classroom"));
			teacher = cursor.getString(cursor.getColumnIndex("teacher"));
			teacherRoom = cursor.getString(cursor.getColumnIndex("office"));
			mail = cursor.getString(cursor.getColumnIndex("email"));
			tel = cursor.getString(cursor.getColumnIndex("tel"));
			phone = cursor.getString(cursor.getColumnIndex("phone"));
			Log.d("------------", className);
		}


	}
}
