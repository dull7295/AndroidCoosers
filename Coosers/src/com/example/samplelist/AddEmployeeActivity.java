package com.example.samplelist;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddEmployeeActivity extends Activity {

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_employee);
		
		Button addEmp=(Button) findViewById(R.id.btnLogin);
		addEmp.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				EditText editName=(EditText) findViewById(R.id.editName);
				String name=editName.getText().toString();
				System.out.println("hey your name is "+name);
				
				EditText editEmail=(EditText) findViewById(R.id.editEmail);
				
				String email=editEmail.getText().toString();
				
				System.out.println("hey your email is "+ email);
				
				if(email.equals("") || name.equals("") )
				{
					System.out.println("please enter valid email and name");
				}
				else
				{
					 
					 Context context=getApplicationContext();
					 System.out.println("context in add employee activity"+context);
					 DatabaseHandler db = new DatabaseHandler(context);
					 
			         Log.d("Insert: ", "Inserting data ");
				     db.addContact(new Contact(email, name));
					 Intent childIntent=new Intent(context,HomeActivity.class);
					 startActivity(childIntent);
					 
					 
				}
				
				// TODO Auto-generated method stub
				    // Context context=getApplicationContext();
					// Perform action on click
	            	// Intent childIntent=new Intent(context,AddEmployeeActivity.class);
	            	//(childIntent);
			}
		});
	}
	
	

}
