package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;


public class Splash extends Activity{

	MediaPlayer ourSong;
	
	protected void onCreate(Bundle Vaeriable) {
		super.onCreate(Vaeriable);
		setContentView(R.layout.splash);
		ourSong =  MediaPlayer.create(Splash.this, R.raw.begin);
		ourSong.start();
		Thread timer = new Thread() {
			public void run() {
				try {
					sleep(11000);
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
		ourSong.release();
		finish();
	
	};	
	}

