package com.aniket.freedomfighter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class LalBahadurSastri
  extends Activity
{
  
  public void onBackPressed()
  {
   
	  startActivity(new Intent(LalBahadurSastri.this, Main.class));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.lalbadursastri);
    
  }  
}


