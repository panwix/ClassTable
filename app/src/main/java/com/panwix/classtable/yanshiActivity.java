package com.panwix.classtable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class yanshiActivity extends Activity {
	  private final int SPLASH_DISPLAY_LENGHT = 3000;

	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.yanshi);
	        new Handler().postDelayed(new Runnable(){

	         @Override
	         public void run() {
	             Intent mainIntent = new Intent(yanshiActivity.this,MainActivity.class);
	             yanshiActivity.this.startActivity(mainIntent);
	                 yanshiActivity.this.finish();
	         }
	           
	        }, SPLASH_DISPLAY_LENGHT);
	    }
	}

