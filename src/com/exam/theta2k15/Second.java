package com.exam.theta2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import com.exam.theta2k15.R;

public class Second extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		
		Button b1=(Button) findViewById(R.id.button1);
		Animation anim1=AnimationUtils.loadAnimation(Second.this, R.anim.animation1);
		b1.startAnimation(anim1);
		
		Button b2=(Button) findViewById(R.id.button2);
		Animation anim2=AnimationUtils.loadAnimation(Second.this, R.anim.animation2);
		b2.startAnimation(anim2);
		
		Button b3=(Button) findViewById(R.id.button3);
		Animation anim3=AnimationUtils.loadAnimation(Second.this, R.anim.animation3);
		b3.startAnimation(anim3);
		
		Button b4=(Button) findViewById(R.id.button4);
		Animation anim4=AnimationUtils.loadAnimation(Second.this, R.anim.animation4);
		b4.startAnimation(anim4);
		
		Button b5=(Button) findViewById(R.id.button5);
		Animation anim5=AnimationUtils.loadAnimation(Second.this, R.anim.animation5);
		b5.startAnimation(anim5);
		
		Button b6=(Button) findViewById(R.id.button6);
		Animation anim6=AnimationUtils.loadAnimation(Second.this, R.anim.animation6);
		b6.startAnimation(anim6);
		
		Button b7=(Button) findViewById(R.id.button7);
		Animation anim7=AnimationUtils.loadAnimation(Second.this, R.anim.animation7);
		b7.startAnimation(anim7);
		
		Button b8=(Button) findViewById(R.id.button8);
		Animation anim8=AnimationUtils.loadAnimation(Second.this, R.anim.animation8);
		b8.startAnimation(anim8);
		
		Button b9=(Button) findViewById(R.id.button9);
		Animation anim9=AnimationUtils.loadAnimation(Second.this, R.anim.animation9);
		b9.startAnimation(anim9);
		
		Button b10=(Button) findViewById(R.id.button10);
		Animation anim10=AnimationUtils.loadAnimation(Second.this, R.anim.animation10);
		b10.startAnimation(anim10);
		
		Button b11=(Button) findViewById(R.id.button11);
		b11.startAnimation(anim10);
		
		Button b12=(Button) findViewById(R.id.button12);
		b12.startAnimation(anim10);
		
		Button b13=(Button) findViewById(R.id.button13);
		b13.startAnimation(anim10);
	
	ImageButton ib1=(ImageButton) findViewById(R.id.imageButton1);
	Animation anim11=AnimationUtils.loadAnimation(Second.this, R.anim.animation11);
	ib1.startAnimation(anim11);
	ib1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			Intent homeIntent = new Intent(Intent.ACTION_MAIN);
			homeIntent.addCategory( Intent.CATEGORY_HOME );
			homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);  
			startActivity(homeIntent);
			int pid = android.os.Process.myPid();
			android.os.Process.killProcess(pid);
		   }
	    });
	
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			startActivity(new Intent(Second.this,Informatica.class));
				
			}
		});
		
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(Second.this,Electronica.class));
				
			}
		});
		
		b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(Second.this,Robotics.class));
				
			}
		});

		b4.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(Second.this,Optica.class));
		
	        }
		});
		
		b5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(Second.this,Emulsion.class));
		
	        }
		});
		
		b6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(Second.this,Biogenesis.class));
		
	        }
		});
		
		b7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(Second.this,Equilibria.class));
		
	        }
		});
		
		b8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(Second.this,Strategia.class));
		
	        }
		});
		
		b9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(Second.this,Mathematica.class));
		
	        }
		});
		
		b10.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(Second.this,Pabbajja.class));
		
	        }
		});
		
		b11.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(Second.this,Workshops.class));
		
	        }
		});

		b12.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(Second.this,Pabbajja.class));

			}
		});
		
		b13.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(Second.this,Contactus.class));
				
			}
		});
	}
}