package com.panwix.classtable;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends Activity implements Runnable{

	// 日期
	public TextView date;
	// 第几周
	public TextView week;
	// 时间
	public TextView time;
	// 学期开始日期
	public Date startDate;
	// 周一的课；
	public TextView c11;
	public TextView c12;
	public TextView c13;
	public TextView c14;
	public TextView c15;
	public TextView c16;
	public TextView c17;
	public TextView c18;
	public TextView c19;
	public TextView c110;
	public TextView c111;

	// 周二的课
	public TextView c21;
	public TextView c22;
	public TextView c23;
	public TextView c24;
	public TextView c25;
	public TextView c26;
	public TextView c27;
	public TextView c28;
	public TextView c29;
	public TextView c210;
	public TextView c211;

	// 周三的课
	public TextView c31;
	public TextView c32;
	public TextView c33;
	public TextView c34;
	public TextView c35;
	public TextView c36;
	public TextView c37;
	public TextView c38;
	public TextView c39;
	public TextView c310;
	public TextView c311;

	// 周四的课
	public TextView c41;
	public TextView c42;
	public TextView c43;
	public TextView c44;
	public TextView c45;
	public TextView c46;
	public TextView c47;
	public TextView c48;
	public TextView c49;
	public TextView c410;
	public TextView c411;

	// 周五的课
	public TextView c51;
	public TextView c52;
	public TextView c53;
	public TextView c54;
	public TextView c55;
	public TextView c56;
	public TextView c57;
	public TextView c58;
	public TextView c59;
	public TextView c510;
	public TextView c511;

	Handler handler = new Handler();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_layout);
		startDate = new Date(2015-7-1);
		// 日期
		date = (TextView)findViewById(R.id.date);
		// 第几周
		week = (TextView)findViewById(R.id.weekNo);
		// 时间
		time = (TextView)findViewById(R.id.time);
		// 绑定周一的课的TextView
		c11 = (TextView)findViewById(R.id.c11);
		c12 = (TextView)findViewById(R.id.c12);
		c13 = (TextView)findViewById(R.id.c13);
		c14 = (TextView)findViewById(R.id.c14);
		c15 = (TextView)findViewById(R.id.c15);
		c16 = (TextView)findViewById(R.id.c16);
		c17 = (TextView)findViewById(R.id.c17);
		c18 = (TextView)findViewById(R.id.c18);
		c19 = (TextView)findViewById(R.id.c19);
		c110 = (TextView)findViewById(R.id.c110);
		c111 = (TextView)findViewById(R.id.c111);
		// 绑定周二的课的TextView
		c21 = (TextView)findViewById(R.id.c21);
		c22 = (TextView)findViewById(R.id.c22);
		c23 = (TextView)findViewById(R.id.c23);
		c24 = (TextView)findViewById(R.id.c24);
		c25 = (TextView)findViewById(R.id.c25);
		c26 = (TextView)findViewById(R.id.c26);
		c27 = (TextView)findViewById(R.id.c27);
		c28 = (TextView)findViewById(R.id.c28);
		c29 = (TextView)findViewById(R.id.c29);
		c210 = (TextView)findViewById(R.id.c210);
		c211 = (TextView)findViewById(R.id.c211);
		// 绑定周三的课的TextView
		c31 = (TextView)findViewById(R.id.c31);
		c32 = (TextView)findViewById(R.id.c32);
		c33 = (TextView)findViewById(R.id.c33);
		c34 = (TextView)findViewById(R.id.c34);
		c35 = (TextView)findViewById(R.id.c35);
		c36 = (TextView)findViewById(R.id.c36);
		c37 = (TextView)findViewById(R.id.c37);
		c38 = (TextView)findViewById(R.id.c38);
		c39 = (TextView)findViewById(R.id.c39);
		c310 = (TextView)findViewById(R.id.c310);
		c311 = (TextView)findViewById(R.id.c311);
		// 绑定周四的课的TextView
		c41 = (TextView)findViewById(R.id.c41);
		c42 = (TextView)findViewById(R.id.c42);
		c43 = (TextView)findViewById(R.id.c43);
		c44 = (TextView)findViewById(R.id.c44);
		c45 = (TextView)findViewById(R.id.c45);
		c46 = (TextView)findViewById(R.id.c46);
		c47 = (TextView)findViewById(R.id.c47);
		c48 = (TextView)findViewById(R.id.c48);
		c49 = (TextView)findViewById(R.id.c49);
		c410 = (TextView)findViewById(R.id.c410);
		c411 = (TextView)findViewById(R.id.c411);
		// 绑定周五的课的TextView
		c51 = (TextView)findViewById(R.id.c51);
		c52 = (TextView)findViewById(R.id.c52);
		c53 = (TextView)findViewById(R.id.c53);
		c54 = (TextView)findViewById(R.id.c54);
		c55 = (TextView)findViewById(R.id.c55);
		c56 = (TextView)findViewById(R.id.c56);
		c57 = (TextView)findViewById(R.id.c57);
		c58 = (TextView)findViewById(R.id.c58);
		c59 = (TextView)findViewById(R.id.c59);
		c510 = (TextView)findViewById(R.id.c510);
		c511 = (TextView)findViewById(R.id.c511);

		// 设置第几周
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date d1=sdf.parse("2015-07-06");
			Date d2=new Date();
			int num = getWeedNo(d1,d2);
			String numStr = "第" + num + "周";
			week.setText(numStr);
		} catch (ParseException e){
			e.printStackTrace();
		}

		// 动态设置时间日期
		handler = new Handler() {
			public void handleMessage(Message msg) {
				switch (msg.what){
					case 100:
						time.setText((String)msg.obj);
						break;
					case 101:
						date.setText((String)msg.obj);
						break;
				}

			}
		};
		new Thread(this).start();
	}

	// 获取当前日期
	public String getDate(){
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int date = c.get(Calendar.DATE);
		return year + "-" + (month+1) + "-" + date;
	}
	// 获取当前时间
	public String getTime(){
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		String hourS;
		String minuteS;
		if(hour<10)
			hourS = "0" + hour;
		else
			hourS = "" + hour;
		if(minute<10)
			minuteS = "0" + minute;
		else
			minuteS = "" + minute;
		return hourS + ":" + minuteS;
	}

	// 取得现在的周数
	public int getWeedNo(Date dateS, Date dateD) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		dateS=sdf.parse(sdf.format(dateS));
		dateD=sdf.parse(sdf.format(dateD));
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateS);
		long time1 = cal.getTimeInMillis();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		cal.setTime(dateD);
		long time2 = cal.getTimeInMillis();
		long between_days=(time2-time1)/(1000*3600*24);
		if(week == 1)
			week = 8;
		int weekNo = (Integer.parseInt(String.valueOf(between_days)) + week - 1)/7;
		int weekNo2 = (Integer.parseInt(String.valueOf(between_days)) + week - 1)%7;
		if(weekNo2 != 0)
			weekNo++;
		return weekNo;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true){
				String time = getTime();
				String date = getDate();
				handler.sendMessage(handler.obtainMessage(100,time));
				handler.sendMessage(handler.obtainMessage(101,date));
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
