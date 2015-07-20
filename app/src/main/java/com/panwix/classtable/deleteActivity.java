package com.panwix.classtable;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.panwix.classtable.database.DBhelper;

public class deleteActivity extends Activity {

	private EditText edtWeekStart;
	private EditText edtWeekEnd;
	private Button sureBtn;
	private Button cancelBtn;
	private EditText edtWeek;
	private EditText edtTime;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.delete);

		edtWeekStart = (EditText)findViewById(R.id.edtWeedStart);
		edtWeekEnd = (EditText)findViewById(R.id.edtWeedEnd);
		edtWeek = (EditText)findViewById(R.id.edtWeek);
		edtTime = (EditText)findViewById(R.id.edtTime);
		sureBtn=(Button)findViewById(R.id.sureBtn);
		cancelBtn = (Button)findViewById(R.id.cancelBtn);

		sureBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				DBhelper helper = new DBhelper(getBaseContext());
				SQLiteDatabase database = helper.getWritableDatabase();
				String edtWeekStartStr = edtWeekStart.getText().toString();
				String edtWeekEndStr = edtWeekEnd.getText().toString();
				String edtWeekStr = edtWeek.getText().toString();
				String edtTimeStr = edtTime.getText().toString();
				if (!edtWeekStartStr.equals("")
						&& !edtWeekEndStr.equals("")
						&& !edtWeekStr.equals("")
						&& !edtTimeStr.equals("")) {
					String sql = ("delete from Class where  week= " +edtWeekStr+"classTime = "
							+ edtTimeStr + "classStart = "
							+ edtWeekStartStr +"classEnd = "
							+ edtWeekEndStr );
					database.execSQL(sql);
				}
				Intent intent = new Intent();
				intent.setClass(deleteActivity.this, MainActivity.class);
				startActivity(intent);
				finish();

			}
		});

		cancelBtn.setOnClickListener(new View.OnClickListener() {

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
