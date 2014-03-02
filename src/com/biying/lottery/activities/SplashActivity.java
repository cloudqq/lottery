package com.biying.lottery.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.biying.lottery.R;


public class SplashActivity extends Activity {
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			
			setContentView(R.layout.splash);

			Intent intent = new Intent(SplashActivity.this, MainActivity.class);
			startActivity(intent);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			finish();
		}
}
