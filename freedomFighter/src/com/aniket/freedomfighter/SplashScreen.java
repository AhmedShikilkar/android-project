package com.aniket.freedomfighter;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;

public class SplashScreen
  extends Activity
{
  Thread thread;
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.splash);
   
    this.thread = new Thread(new Runnable()
    {
      public void run()
      {
        try
        {
          Thread.sleep(5000L);
          SplashScreen.this.startActivity(new Intent(SplashScreen.this, Main.class));
          SplashScreen.this.finish();
          return;
        }
        catch (Exception localException) {}
      }
    });
    this.thread.start();
  }
}

