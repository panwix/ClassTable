package com.panwix.classtable;

import java.security.PublicKey;
import java.util.Iterator;
import java.util.Map;

import com.hpw.classtable.database.ClassDao;
import com.hpw.classtable.database.DBService;
import com.hpw.classtable.database.DBhelper;

import android.R.anim;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class addActivity extends Activity {

	private Button sure;
	private Button cancel;
	private EditText mclass;
	private EditText mclassroom;
	private EditText mteacher;
	private EditText mtel;
	private EditText moffice;
	private EditText mphone;
	private EditText mEmail;
	private EditText mweek;
	private  EditText mweeknumber;
	private  EditText mtime;
	//String weeknumberstr;
	//String timestr;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add);

		sure = (Button) findViewById(R.id.btn10);
		cancel = (Button) findViewById(R.id.btn9);
		mclass = (EditText) findViewById(R.id.et0);
		mclassroom = (EditText) findViewById(R.id.et1);
		mteacher = (EditText) findViewById(R.id.et2);
		mtel = (EditText) findViewById(R.id.et3);
		moffice = (EditText) findViewById(R.id.et5);
		mphone = (EditText) findViewById(R.id.et4);
		mEmail = (EditText) findViewById(R.id.et6);
		mweek = (EditText) findViewById(R.id.et7);
		mweeknumber = (EditText) findViewById(R.id.spinner2);
		mtime = (EditText) findViewById(R.id.spinner1);

		sure.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				DBhelper helper = new DBhelper(getBaseContext());
				helper.getWritableDatabase();
				DBService service = new ClassDao(getBaseContext());
				ContentValues values = new ContentValues();
				
				String classstr = mclass.getText().toString();
				String classroomstr = mclassroom.getText().toString();
				String teacherstr = mteacher.getText().toString();
				String telstr = mtel.getText().toString();
				String phonestr = mphone.getText().toString();
				String officestr = moffice.getText().toString();
				String emailstr = mEmail.getText().toString();
				String weekstr = mweek.getText().toString();
				String timestr = mtime.getText().toString();
				//classTimeΪ�ڼ���������ڼ��ϿεĽ�ϣ����Ժ���ҿγ̵Ĺؼ�
				String weeknumberstr = mweeknumber.getText().toString();
				//String classTime = timestr+weeknumberstr;
				
				/*String[] classNum = new String[]{
					"1","2","3","4","5","6","7"	
				};
				ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(null, android.R.layout.simple_spinner_dropdown_item, classNum);
				mtime.setAdapter(adapter1);
				mtime.setOnItemSelectedListener(new OnItemSelectedListener(){

					@Override
					public void onItemSelected(AdapterView<?> arg0, View arg1,
							int arg2, long arg3) {
						timestr = mtime.getSelectedItem().toString();
						
					}

					@Override
					public void onNothingSelected(AdapterView<?> arg0) {
						
						
					}
					
				});
				String[] weekNum = new String[]{

				};
				ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(null, android.R.layout.simple_spinner_item, weekNum);
				mweeknumber.setAdapter(adapter2);
				mweeknumber.setOnItemSelectedListener(new OnItemSelectedListener(){

					@Override
					public void onItemSelected(AdapterView<?> arg0, View arg1,
							int arg2, long arg3) {
						weeknumberstr = mtime.getSelectedItem().toString();
						
					}

					@Override
					public void onNothingSelected(AdapterView<?> arg0) {
						
						
					}
					
				});*/
				String classTime = timestr+weeknumberstr;
				values.put("class", classstr);
				values.put("classroom", classroomstr);
				values.put("teacher", teacherstr);
				values.put("tel", telstr);
				values.put("phone", phonestr);
				values.put("office", officestr);
				values.put("email", emailstr);
				values.put("week", weekstr);
				values.put("classTime", classTime);
				

				boolean flag = service.addClass(values);
				//Log.i("addActivity", "---->" + flag);
				
				/*Map<String, String> map = service.selectClass("class=?", new String[]{classstr});
				 Iterator iterator=map.keySet().iterator();
			        while(iterator.hasNext())
			        {
			            Object o=iterator.next() ;

			           String key=(String)o;

			           String value=(String)map.get(key);

			           System.out.println( key+":"+"="+value);
			        }*/

				Intent intent = new Intent();
				intent.setClass(addActivity.this, MainActivity.class);
				startActivity(intent);
				finish();

			}
		});

		cancel.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent();
				intent.setClass(addActivity.this, MainActivity.class);
				startActivity(intent);
				finish();
			}
		});
	}
}
