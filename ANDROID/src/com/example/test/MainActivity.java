package com.example.test;

import java.io.File;
import java.io.IOException;

//import com.example.audiocapture.R;

//import com.example.audiocapture.R;

import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity implements OnClickListener {

	
		
		private MediaRecorder myAudioRecorder;
	    private String outputFile = null;
		private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,start,stop,play;
	    private SoundPool sp;
	    private int kick; int kick1; int hithat; int clap; int synthb; int synthb1; int guit3;int synthlayz;
	    int bassloop;int owl;int guit2;int low; int high; int dj; int darksynth;int dull;
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);

	        sp = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
	        	        
	        
	        kick = sp.load(this, R.raw.kick, 1);
	        kick1 = sp.load(this, R.raw.kick1, 1);
	        hithat = sp.load(this, R.raw.hithat, 1);
	        clap = sp.load(this, R.raw.clap, 1);
	        synthb = sp.load(this, R.raw.synthb, 1);
	        synthb1 = sp.load(this, R.raw.synthb1, 1);
	        guit3 = sp.load(this, R.raw.guit3, 1);
	        synthlayz = sp.load(this, R.raw.synthlayz, 1);
	        bassloop = sp.load(this, R.raw.bassloop, 1);
	        owl = sp.load(this, R.raw.owl, 1);
	        guit2 = sp.load(this, R.raw.guit2, 1);
	        low = sp.load(this, R.raw.low, 1);
	        high = sp.load(this, R.raw.high, 1);
	        dj = sp.load(this, R.raw.dj, 1);
	        darksynth = sp.load(this, R.raw.darksynth, 1);
	        dull = sp.load(this, R.raw.dull, 1);
	        
	        
	        b1 = (Button)findViewById(R.id.b1);
	        b2 = (Button)findViewById(R.id.b2);
	        b3 = (Button)findViewById(R.id.b3);
	        b4 = (Button)findViewById(R.id.b4);
	        b5 = (Button)findViewById(R.id.b5);
	        b6 = (Button)findViewById(R.id.b6);
	        b7 = (Button)findViewById(R.id.b7);
	        b8 = (Button)findViewById(R.id.b8);
	        b9 = (Button)findViewById(R.id.b9);
	        b10 = (Button)findViewById(R.id.b10);
	        b11 = (Button)findViewById(R.id.b11);
	        b12 = (Button)findViewById(R.id.b12);
	        b13 = (Button)findViewById(R.id.b13);
	        b14 = (Button)findViewById(R.id.b14);
	        b15 = (Button)findViewById(R.id.b15);
	        start = (Button)findViewById(R.id.start);
	        stop = (Button)findViewById(R.id.stop); 
	        play = (Button)findViewById(R.id.play);
	        

	        stop.setEnabled(false);
	        play.setEnabled(false);
	        outputFile = Environment.getExternalStorageDirectory().
	        getAbsolutePath() + "/myrecording.3gp";;

	        myAudioRecorder = new MediaRecorder();
	        myAudioRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
	        myAudioRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
	        myAudioRecorder.setAudioEncoder(MediaRecorder.OutputFormat.AMR_NB);
	        myAudioRecorder.setOutputFile(outputFile);
	        
	        

	        
	        
	        
	        
	        
	        b1.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	                b1();
	            }
	        });
	    
		    
		    b2.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	                b2();
	            }
	        });
	
		    b3.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	                b3();
	            } 
	        });
	        b4.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	                b4();
	            }
	        });
	    
		    
		    b5.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	                b5();
	            }
	        });
	
		    b6.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	                b6();
	            } 
	        });	    
	    
		    b7.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	                b7();
	            }
	        });
	    
		    
		    b8.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	                b8();
	            }
	        });
	
		    b9.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	                b9();
	            } 
	        });
	        b10.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	                b10();
	            }
	        });
	    
		    
		    b11.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	                b11();
	            }
	        });
	
		    b12.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	                b12();
	            } 
	        });	   
		    
		    b13.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	                b13();
	            }
	        });
	    
		    
		    b14.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	                b14();
	            }
	        });
	
		    b15.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	                b15();
	            } 
	        });;	
	    
		    
		}
	    


	    

	   
	  

	    
	    public void b1(){
	    		sp.play(kick, 1, 1, 0, 0, 1);
    	
	    }
	    public void b2() {
	    		sp.play(hithat, 1, 1, 0, 0, 1);
	    }
	    public void b3() {
    			sp.play(clap, 1, 1, 0, 0, 1);
	    }
	    public void b4(){
    		sp.play(dj, 1, 1, 0, 0, 1);
	    }
	    public void b5() {
	    		sp.play(dull, 1, 1, 0, 0, 1);
	    }
	    public void b6() {
				sp.play(owl, 1, 1, 0, 0, 1);
	    }	    
	    public void b7(){
    		sp.play(synthlayz, 1, 1, 0, 0, 1);
	    }
	    public void b8() {
	    		sp.play(bassloop, 1, 1, 0, 0, 1);
	    }
	    public void b9() {
				sp.play(darksynth, (float) 0.4, (float) 0.4, 0, 0, 1);
	    }
	    public void b10(){
			sp.play(guit3, (float) 0.2, (float) 0.2, 0, 0, 1);
	    }
	    public void b11() {
	    		sp.play(low, (float) 0.2, (float) 0.2, 0, 0, 1);
	    }
	    public void b12() {
				sp.play(high, 1, 1, 0, 0, 1);
	    }
	    public void b13(){
			sp.play(guit2,(float) 0.2, (float) 0.2, 0, 0, 1);
	    }
	    public void b14() {
	    		sp.play(synthb, 1, 1, 0, 0, 1);
	    }
	    public void b15() {
				sp.play(synthb1, 1, 1, 0, 0, 1);
	    } 

	    public void start(View view){
	        try {
	           myAudioRecorder.prepare();
	           myAudioRecorder.start();
	        } catch (IllegalStateException e) {
	           e.printStackTrace();
	        } catch (IOException e) {
	           e.printStackTrace();
	        }
	        start.setEnabled(false);
	        stop.setEnabled(true);
	        Toast.makeText(getApplicationContext(), "Recording started", Toast.LENGTH_LONG).show();

	     }

	     public void stop(View view){
	        myAudioRecorder.stop();
	        myAudioRecorder.release();
	        myAudioRecorder  = null;
	        stop.setEnabled(false);
	        play.setEnabled(true);
	        Toast.makeText(getApplicationContext(), "Audio recorded successfully",
	        Toast.LENGTH_LONG).show();
	     }
	     
	     public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getMenuInflater().inflate(R.menu.main, menu);
	        return true;
	     }
	     public void play(View view) throws IllegalArgumentException,   
	     SecurityException, IllegalStateException, IOException{
	     
	     MediaPlayer m = new MediaPlayer();
	     m.setDataSource(outputFile);
	     m.prepare();
	     m.start();
	     Toast.makeText(getApplicationContext(), "Playing audio", Toast.LENGTH_LONG).show();

	     }








		public void onClick(View v) {

			
		}
}
