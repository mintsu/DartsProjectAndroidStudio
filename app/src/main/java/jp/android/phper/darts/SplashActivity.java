package jp.android.phper.darts;

import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.app.Activity;
import android.content.Intent;



public class SplashActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_splash);
		Handler handler = new Handler();
		handler.postDelayed(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				startActivity(new Intent(SplashActivity.this, MainActivity.class));
				finish();
			}
		}, 1500);
	}
	
}
