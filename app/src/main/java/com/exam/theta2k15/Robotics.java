package com.exam.theta2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import com.exam.theta2k15.R;

public class Robotics extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
		setContentView(R.layout.robotics);
		
		Button b1=(Button) findViewById(R.id.button3_1);
		Animation anim1=AnimationUtils.loadAnimation(Robotics.this, R.anim.animation1);
		b1.startAnimation(anim1);
		
		Button b2=(Button) findViewById(R.id.button3_2);
		Animation anim2=AnimationUtils.loadAnimation(Robotics.this, R.anim.animation2);
		b2.startAnimation(anim2);
		
		Button b3=(Button) findViewById(R.id.button3_3);
		Animation anim3=AnimationUtils.loadAnimation(Robotics.this, R.anim.animation3);
		b3.startAnimation(anim3);
		
		Button b4=(Button) findViewById(R.id.button3_4);
		Animation anim4=AnimationUtils.loadAnimation(Robotics.this, R.anim.animation4);
		b4.startAnimation(anim4);
		
		Button b5=(Button) findViewById(R.id.button3_5);
		Animation anim5=AnimationUtils.loadAnimation(Robotics.this, R.anim.animation5);
		b5.startAnimation(anim5);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(Robotics.this,Robsoc.class));

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(Robotics.this,Roblym.class));

            }
        });
	}
}
