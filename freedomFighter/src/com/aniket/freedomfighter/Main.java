package com.aniket.freedomfighter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Main extends Activity {

	
	
	  Button btnBhagatSingh;
	  Button btnGandhiji;
	  Button btnLalbahadurSastri;
	  Button btnNaheruji;
	  Button btnSardarPatel;
	  Button btnSubhasChandraBoz;
	
	  
	  public void onBackPressed()
	  {
	    startActivity(new Intent(this, ExitPage.class));
	    super.onBackPressed();
	  }
	  
	  @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		

		try
	    {
	     
	      this.btnGandhiji = ((Button)findViewById(R.id.gandhiji));
	      this.btnLalbahadurSastri = ((Button)findViewById(R.id.lalbahadur));
	      this.btnSardarPatel = ((Button)findViewById(R.id.Sardar));
	      this.btnNaheruji = ((Button)findViewById(R.id.nehru));
	      this.btnBhagatSingh = ((Button)findViewById(R.id.bhagat));
	      this.btnSubhasChandraBoz = ((Button)findViewById(R.layout.subhaschandra));
	      
	      
	      this.btnGandhiji.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, Gandhiji.class));
	        }
	      });
	      
	      
	      this.btnSardarPatel.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, SardarPatel.class));
	        }
	      });
	      this.btnLalbahadurSastri.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, LalBahadurSastri.class));
	        }
	      });
	      
	      
	      this.btnNaheruji.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, Naheru.class));
	        }
	      });
	      
	      
	      
	      this.btnSubhasChandraBoz.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, SubhasChandraBoz.class));
	        }
	      });
	      this.btnBhagatSingh.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, BhagatSingh.class));
	        }
	      });
	     
	    }
	    catch (Exception localException)
	    {
	     
	    }
		try
	    {
	     
	      this.btnGandhiji = ((Button)findViewById(R.id.gandhiji));
	      this.btnLalbahadurSastri = ((Button)findViewById(R.id.lalbahadur));
	      this.btnSardarPatel = ((Button)findViewById(R.id.Sardar));
	      this.btnNaheruji = ((Button)findViewById(R.id.nehru));
	      this.btnBhagatSingh = ((Button)findViewById(R.id.bhagat));
	      this.btnSubhasChandraBoz = ((Button)findViewById(R.layout.subhaschandra));
	      
	      
	      this.btnGandhiji.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, Gandhiji.class));
	        }
	      });
	      
	      
	      this.btnSardarPatel.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, SardarPatel.class));
	        }
	      });
	      this.btnLalbahadurSastri.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, LalBahadurSastri.class));
	        }
	      });
	      
	      
	      this.btnNaheruji.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, Naheru.class));
	        }
	      });
	      
	      
	      
	      this.btnSubhasChandraBoz.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, SubhasChandraBoz.class));
	        }
	      });
	      this.btnBhagatSingh.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, BhagatSingh.class));
	        }
	      });
	     
	    }
	    catch (Exception localException)
	    {
	     
	    }
		try
	    {
	     
	      this.btnGandhiji = ((Button)findViewById(R.id.gandhiji));
	      this.btnLalbahadurSastri = ((Button)findViewById(R.id.lalbahadur));
	      this.btnSardarPatel = ((Button)findViewById(R.id.Sardar));
	      this.btnNaheruji = ((Button)findViewById(R.id.nehru));
	      this.btnBhagatSingh = ((Button)findViewById(R.id.bhagat));
	      this.btnSubhasChandraBoz = ((Button)findViewById(R.layout.subhaschandra));
	      
	      
	      this.btnGandhiji.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, Gandhiji.class));
	        }
	      });
	      
	      
	      this.btnSardarPatel.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, SardarPatel.class));
	        }
	      });
	      this.btnLalbahadurSastri.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, LalBahadurSastri.class));
	        }
	      });
	      
	      
	      this.btnNaheruji.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, Naheru.class));
	        }
	      });
	      
	      
	      
	      this.btnSubhasChandraBoz.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, SubhasChandraBoz.class));
	        }
	      });
	      this.btnBhagatSingh.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, BhagatSingh.class));
	        }
	      });
	     
	    }
	    catch (Exception localException)
	    {
	     
	    }
		try
	    {
	     
	      this.btnGandhiji = ((Button)findViewById(R.id.gandhiji));
	      this.btnLalbahadurSastri = ((Button)findViewById(R.id.lalbahadur));
	      this.btnSardarPatel = ((Button)findViewById(R.id.Sardar));
	      this.btnNaheruji = ((Button)findViewById(R.id.nehru));
	      this.btnBhagatSingh = ((Button)findViewById(R.id.bhagat));
	      this.btnSubhasChandraBoz = ((Button)findViewById(R.layout.subhaschandra));
	      
	      
	      this.btnGandhiji.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, Gandhiji.class));
	        }
	      });
	      
	      
	      this.btnSardarPatel.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, SardarPatel.class));
	        }
	      });
	      this.btnLalbahadurSastri.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, LalBahadurSastri.class));
	        }
	      });
	      
	      
	      this.btnNaheruji.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, Naheru.class));
	        }
	      });
	      
	      
	      
	      this.btnSubhasChandraBoz.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, SubhasChandraBoz.class));
	        }
	      });
	      this.btnBhagatSingh.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, BhagatSingh.class));
	        }
	      });
	     
	    }
	    catch (Exception localException)
	    {
	     
	    }
		try
	    {
	     
	      this.btnGandhiji = ((Button)findViewById(R.id.gandhiji));
	      this.btnLalbahadurSastri = ((Button)findViewById(R.id.lalbahadur));
	      this.btnSardarPatel = ((Button)findViewById(R.id.Sardar));
	      this.btnNaheruji = ((Button)findViewById(R.id.nehru));
	      this.btnBhagatSingh = ((Button)findViewById(R.id.bhagat));
	      this.btnSubhasChandraBoz = ((Button)findViewById(R.layout.subhaschandra));
	      
	      
	      this.btnGandhiji.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, Gandhiji.class));
	        }
	      });
	      
	      
	      this.btnSardarPatel.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, SardarPatel.class));
	        }
	      });
	      this.btnLalbahadurSastri.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, LalBahadurSastri.class));
	        }
	      });
	      
	      
	      this.btnNaheruji.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, Naheru.class));
	        }
	      });
	      
	      
	      
	      this.btnSubhasChandraBoz.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, SubhasChandraBoz.class));
	        }
	      });
	      this.btnBhagatSingh.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, BhagatSingh.class));
	        }
	      });
	     
	    }
	    catch (Exception localException)
	    {
	     
	    }
		try
	    {
	     
	      this.btnGandhiji = ((Button)findViewById(R.id.gandhiji));
	      this.btnLalbahadurSastri = ((Button)findViewById(R.id.lalbahadur));
	      this.btnSardarPatel = ((Button)findViewById(R.id.Sardar));
	      this.btnNaheruji = ((Button)findViewById(R.id.nehru));
	      this.btnBhagatSingh = ((Button)findViewById(R.id.bhagat));
	      this.btnSubhasChandraBoz = ((Button)findViewById(R.layout.subhaschandra));
	      
	      
	      this.btnGandhiji.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, Gandhiji.class));
	        }
	      });
	      
	      
	      this.btnSardarPatel.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, SardarPatel.class));
	        }
	      });
	      this.btnLalbahadurSastri.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, LalBahadurSastri.class));
	        }
	      });
	      
	      
	      this.btnNaheruji.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, Naheru.class));
	        }
	      });
	      
	      
	      
	      this.btnSubhasChandraBoz.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, SubhasChandraBoz.class));
	        }
	      });
	      this.btnBhagatSingh.setOnClickListener(new View.OnClickListener()
	      {
	        public void onClick(View v)
	        {
	          Main.this.startActivity(new Intent(Main.this, BhagatSingh.class));
	        }
	      });
	     
	    }
	    catch (Exception localException)
	    {
	     
	    }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
		
		

	
	
  }

