/**
 * 
 */
package com.example.samplelist;

import android.app.ActionBar.LayoutParams;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * @author muralikrishnadunna
 *
 */
public class EmployeeDetailsFragment extends Fragment {

	final static String ARG_POSITION = "position";
	 int mCurrentPosition = -1;
	
	
	/* (non-Javadoc)
	 * @see android.app.Fragment#onActivityCreated(android.os.Bundle)
	 */
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
	}

	/* (non-Javadoc)
	 * @see android.app.Fragment#onCreate(android.os.Bundle)
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	/* (non-Javadoc)
	 * @see android.app.Fragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		//return super.onCreateView(inflater, container, savedInstanceState);
		
		   if (savedInstanceState != null) {
	            mCurrentPosition = savedInstanceState.getInt(ARG_POSITION);
	        }
	   View v=inflater.inflate(R.layout.details, container,false);
	
	   Context context=getActivity().getApplicationContext();
	  
	    
	return v;
	}

	/* (non-Javadoc)
	 * @see android.app.Fragment#onStart()
	 */
	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
        Bundle args = getArguments();

		System.out.println("started "+mCurrentPosition);
		if(mCurrentPosition !=-1)
		{
			updateDetails(mCurrentPosition);
		}else if(args !=null)
		{
			updateDetails(args.getInt(ARG_POSITION));
		}
		
	}
	
	@Override
	public void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		super.onSaveInstanceState(outState);
		outState.putInt(ARG_POSITION, mCurrentPosition);
	}
	
	public void updateDetails(int position)
	{
		//TextView tv=(TextView)getActivity().findViewById(R.id.textView1);
		//tv.setText(EmployeeInfo.Articles[position]);
		mCurrentPosition=position;
	}

}
