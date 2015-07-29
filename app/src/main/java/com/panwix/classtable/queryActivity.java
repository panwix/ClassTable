package com.panwix.classtable;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Panwix on 15/7/27.
 */
public class queryActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.query);

//        tClassname = (TextView)findViewById(R.id.classname);
//        tClassroom = (TextView)findViewById(R.id.classroom);
//        tWeek = (TextView)findViewById(R.id.week);
//        tTime = (TextView)findViewById(R.id.time);
//        tWeekStart = (TextView)findViewById(R.id.classstart);
//        tTeacher = (TextView)findViewById(R.id.teacher);
//        tTeaRoom = (TextView)findViewById(R.id.tearoom);
//        tTel = (TextView)findViewById(R.id.tel);
//        tPhone = (TextView)findViewById(R.id.phone);
//        tMail = (TextView)findViewById(R.id.mail);
//        Bundle bundle = getIntent().getExtras();
//        weekNo = bundle.getString("weekNo");
//        week = bundle.getString("week");
//        time = bundle.getString("time");
//
//        DBhelper helper = new DBhelper(getBaseContext());
//        String sql = "select * from Class where week = ? and classTime =?";
//        SQLiteDatabase database = helper.getWritableDatabase();
//        Cursor cursor = database.rawQuery(sql, new String[]{tClassname});
//        int i = cursor.getCount();
//        if (i > 0) {
//            cursor.moveToFirst();
//            weekStart = cursor.getString(cursor.getColumnIndex("classStart"));
//            weekEnd = cursor.getString(cursor.getColumnIndex("classEnd"));
//            weekStart = cursor.getString(cursor.getColumnIndex("classStart"));
//            weekEnd = cursor.getString(cursor.getColumnIndex("classEnd"));
//            className = cursor.getString(cursor.getColumnIndex("class"));
//            classRoom = cursor.getString(cursor.getColumnIndex("classroom"));
//            teacher = cursor.getString(cursor.getColumnIndex("teacher"));
//            teacherRoom = cursor.getString(cursor.getColumnIndex("office"));
//            mail = cursor.getString(cursor.getColumnIndex("email"));
//            tel = cursor.getString(cursor.getColumnIndex("tel"));
//            phone = cursor.getString(cursor.getColumnIndex("phone"));
//            while(cursor.moveToNext()){
//                weekStart = cursor.getString(cursor.getColumnIndex("classStart"));
//                weekEnd = cursor.getString(cursor.getColumnIndex("classEnd"));
//                weekStart = cursor.getString(cursor.getColumnIndex("classStart"));
//                weekEnd = cursor.getString(cursor.getColumnIndex("classEnd"));
//                className = cursor.getString(cursor.getColumnIndex("class"));
//                classRoom = cursor.getString(cursor.getColumnIndex("classroom"));
//                teacher = cursor.getString(cursor.getColumnIndex("teacher"));
//                teacherRoom = cursor.getString(cursor.getColumnIndex("office"));
//                mail = cursor.getString(cursor.getColumnIndex("email"));
//                tel = cursor.getString(cursor.getColumnIndex("tel"));
//                phone = cursor.getString(cursor.getColumnIndex("phone"));
//            }
//        }
//        tClassname.setText(className);
//        tClassroom.setText(classRoom);
//        tWeek.setText("周" + week + "第" + time +"节");
//        tWeekStart.setText("从第" +weekStart+"周到第"+weekEnd+"周");
//        tTeacher.setText(teacher);
//        tTeaRoom.setText(teacherRoom);
//        tTel.setText(tel);
//        tPhone.setText(phone);
//        tMail.setText(mail);
    }
}
