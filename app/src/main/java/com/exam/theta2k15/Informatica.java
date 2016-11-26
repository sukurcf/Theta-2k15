package com.exam.theta2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import com.exam.theta2k15.R;

public class Informatica extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
		setContentView(R.layout.informatica);
		
		Button b1=(Button) findViewById(R.id.button1_1);
		Animation anim1=AnimationUtils.loadAnimation(Informatica.this, R.anim.animation1);
		b1.startAnimation(anim1);
		
		Button b2=(Button) findViewById(R.id.button1_2);
		Animation anim2=AnimationUtils.loadAnimation(Informatica.this, R.anim.animation2);
		b2.startAnimation(anim2);
		
		Button b3=(Button) findViewById(R.id.button1_3);
		Animation anim3=AnimationUtils.loadAnimation(Informatica.this, R.anim.animation3);
		b3.startAnimation(anim3);
		
		Button b4=(Button) findViewById(R.id.button1_4);
		Animation anim4=AnimationUtils.loadAnimation(Informatica.this, R.anim.animation4);
		b4.startAnimation(anim4);
		
		Button b5=(Button) findViewById(R.id.button1_5);
		Animation anim5=AnimationUtils.loadAnimation(Informatica.this, R.anim.animation5);
		b5.startAnimation(anim5);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
               startActivity(new Intent(Informatica.this,Tectre.class));

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(Informatica.this,Revcod.class));

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(Informatica.this,Informaticaconus.class));

            }
        });
	}
}
