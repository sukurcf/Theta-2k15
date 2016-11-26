package com.exam.theta2k15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.exam.theta2k15.R;

public class Workshops extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
	setContentView(R.layout.workshops);
	
	Button b1=(Button) findViewById(R.id.button11_1);
	b1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			startActivity(new Intent(Workshops.this,Uiux.class));
			
		}
	});
	
	Button b2=(Button) findViewById(R.id.button11_2);
	b2.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			startActivity(new Intent(Workshops.this,Spvs.class));
			
		}
	});
	}

}
