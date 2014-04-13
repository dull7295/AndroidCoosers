package com.example.samplelist;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends Activity {

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_zero);
		
		Button employeeInfoButton=(Button) findViewById(R.id.EmployeeInfo);
		employeeInfoButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				     Context context=getApplicationContext();
					// Perform action on click
	            	 Intent childIntent=new Intent(context,MainActivity.class);
	            	 startActivity(childIntent);
			}
		});
		
		
		
		Button addEmployeeButton=(Button) findViewById(R.id.button2);
		addEmployeeButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				     Context context=getApplicationContext();
					// Perform action on click
	            	 Intent childIntent=new Intent(context,AddEmployeeActivity.class);
	            	 startActivity(childIntent);
			}
		});
		
		
	}
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		super.onSaveInstanceState(outState);
		
		System.out.println("calling onSaveInstanceState");
		
	}

	
	
}
