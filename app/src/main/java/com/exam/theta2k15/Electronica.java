package com.exam.theta2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import com.exam.theta2k15.R;

public class Electronica extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
		setContentView(R.layout.electronica);
		
		Button b1=(Button) findViewById(R.id.button2_1);
		Animation anim1=AnimationUtils.loadAnimation(Electronica.this, R.anim.animation1);
		b1.startAnimation(anim1);
		
		Button b2=(Button) findViewById(R.id.button2_2);
		Animation anim2=AnimationUtils.loadAnimation(Electronica.this, R.anim.animation2);
		b2.startAnimation(anim2);
		
		Button b3=(Button) findViewById(R.id.button2_3);
		Animation anim3=AnimationUtils.loadAnimation(Electronica.this, R.anim.animation3);
		b3.startAnimation(anim3);
		
		Button b4=(Button) findViewById(R.id.button2_4);
		Animation anim4=AnimationUtils.loadAnimation(Electronica.this, R.anim.animation4);
		b4.startAnimation(anim4);
		
		Button b5=(Button) findViewById(R.id.button2_5);
		Animation anim5=AnimationUtils.loadAnimation(Electronica.this, R.anim.animation5);
		b5.startAnimation(anim5);

        Button b6=(Button) findViewById(R.id.button2_6);
        Animation anim6=AnimationUtils.loadAnimation(Electronica.this, R.anim.animation6);
        b6.startAnimation(anim6);

        Button b7=(Button) findViewById(R.id.button2_7);
        Animation anim7=AnimationUtils.loadAnimation(Electronica.this, R.anim.animation7);
        b7.startAnimation(anim7);
		
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(Electronica.this,CandyTronics.class));
				
			}
		});
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(Electronica.this,CrazyTronics.class));
				
			}
		});
        b3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(Electronica.this,Eupxia.class));

            }
        });
        b4.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(Electronica.this,Chaele.class));

            }
        });
        b5.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(Electronica.this,Etl.class));

            }
        });
        b6.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(Electronica.this,Eletes.class));

            }
        });
        b7.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(Electronica.this,Tecfun.class));

            }
        });
	}
}
