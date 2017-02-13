package com.lzf.activity;

import com.lzf.lp.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;

public class HdLoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hd_login_activity);
	}

	public void login(View view) {
		startActivity(new Intent(HdLoginActivity.this, HdMainActivity.class));
	}

}
