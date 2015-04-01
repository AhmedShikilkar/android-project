package com.aniket.freedomfighter;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class BhagatSingh
  extends Activity
{
 
  
  
  
  public void onBackPressed()
  {
    
	  startActivity(new Intent(BhagatSingh.this, Main.class));
  }
  
  public void onCreate(Bundle paramBundle)
{
	  
	  
		setContentView(R.layout.bhagatsingh);
}   
}


