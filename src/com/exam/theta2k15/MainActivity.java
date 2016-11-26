package com.exam.theta2k15;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;
import com.exam.theta2k15.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      
        TextView tv= (TextView) findViewById(R.id.textView1);
    
        Animation anim=AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation1);
		tv.startAnimation(anim);
        tv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				Toast.makeText(getApplicationContext(), "Welcome to Theta 2K15", Toast.LENGTH_LONG).show();
				startActivity(new Intent(MainActivity.this, Second.class));
			}
		});
    }
    }
