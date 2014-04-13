/**
 * 
 */
package com.example.samplelist;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * @author muralikrishnadunna
 *
 */
public class EmployeeListFragment extends ListFragment {

	 OnEmployeesSelectedListener mcallback;
	 
		
	 public interface  OnEmployeesSelectedListener {
		  public void tweetToMainActivity(int position);
			
		}

	

	/* (non-Javadoc)
	 * @see android.app.ListFragment#onListItemClick(android.widget.ListView, android.view.View, int, long)
	 */
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		mcallback.tweetToMainActivity(position);
	}

	

	/* (non-Javadoc)
	 * @see android.app.Fragment#onAttach(android.app.Activity)
	 */
	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		//we have to check 
		try{
         mcallback=(OnEmployeesSelectedListener)activity;		
	       }
		catch(ClassCastException e)
		{
			throw new ClassCastException(activity.toString()+"must implement OnEmployeesSelectedListener");
		}
	}

	/* (non-Javadoc)
	 * @see android.app.Fragment#onStart()
	 */
	
	
	
	/* (non-Javadoc)
	 * @see android.app.Fragment#onCreate(android.os.Bundle)
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	  System.out.println("hello this is on create in employee list fragment");
		//Context context=getActivity();
		Context context=getActivity().getApplicationContext();
		
		 System.out.println("context in add employee list fragment"+context);

		DatabaseHandler db = new DatabaseHandler(context);
		 List<Contact> contacts = db.getAllContacts();       

		 ArrayList<String> limits = new ArrayList<String>();
	        for (Contact cn : contacts) {
	            String log = "Id: "+cn.getID()+" ,Name: " + cn.getName() + " ,Phone: " + cn.getPhoneNumber();
	                // Writing Contacts to log
	        Log.d("Name: ", log);
	        
	        limits.add(cn.getName());
	        
	        }
	        
	       
		setListAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,limits));
	}



	/* (non-Javadoc)
	 * @see android.app.Fragment#onSaveInstanceState(android.os.Bundle)
	 */
	
	

}
