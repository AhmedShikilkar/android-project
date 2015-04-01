package com.aniket.freedomfighter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class SardarPatel
  extends Activity
{
  
  
  public void onBackPressed()
  {
   
	  startActivity(new Intent(SardarPatel.this, Main.class));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.sardarpatel);
   
  }
}

