package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;


public class Splash extends Activity{

	MediaPlayer Song;
	
	protected void onCreate(Bundle Variable) {
		super.onCreate(Variable);
		setContentView(R.layout.splash);
		Song =  MediaPlayer.create(Splash.this, R.raw.sweet);
		Song.start();
		Song.seekTo(22000);
		Thread timer = new Thread() {
			public void run() {
				try {
					sleep(6000);
				} catch(InterruptedException e){
					e.printStackTrace();
				} finally {
					Intent openStartingPoint = new Intent("com.example.test.MainAcitivty");
					startActivity(openStartingPoint);
				}
			}
			};
			timer.start();
			
		}

	protected void onPause() {
		super.onPause();
		Song.release();
		finish();
	
	};	
	}

