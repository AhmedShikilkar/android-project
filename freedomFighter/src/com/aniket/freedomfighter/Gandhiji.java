package com.aniket.freedomfighter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class Gandhiji
  extends Activity
{
  
  
  public void onBackPressed()
  {
	  startActivity(new Intent(Gandhiji.this, Main.class));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.gandhiji);
  } 
}

