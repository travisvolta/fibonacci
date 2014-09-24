package com.example.fibonacchi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}
	
		
	public void getValueOfEdittextToTextview (View v) {
		TextView tv = (TextView)findViewById(R.id.textview);
		EditText et = (EditText)findViewById(R.id.edittext);
		double n1=0, n2=1, s=0;
		int k, i;
		String result;
		k = Integer.valueOf(et.getText().toString());
		
	if (k>0&& k<=200 && k%1==0){
		
		for (i=2;i<=k;i++){
			s=n1+n2;
			n1=n2;
			n2=s;
		}
		result = String.valueOf(n1);
		
		tv.setText(result);
		
	}
	else tv.setText(":-(");
	}
}
