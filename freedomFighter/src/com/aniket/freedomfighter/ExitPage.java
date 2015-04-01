package com.aniket.freedomfighter;

import android.app.Activity;

import android.os.Bundle;

public class ExitPage
  extends Activity
{
  private Thread thread;

public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.exit);
    this.thread = new Thread(new Runnable()
    {
      public void run()
      {
        try
        {
          Thread.sleep(3000L);
          
          
          ExitPage.this.finish();
          return;
        }
        catch (Exception localException) {}
      }
    });
    this.thread.start();
  }
}
