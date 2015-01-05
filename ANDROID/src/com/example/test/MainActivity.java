package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

	int counter;
	Button kick;
	Button hit_hat;
	Button snare;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
			kick = (Button) findViewById(R.id.kick);
			hit_hat = (Button) findViewById(R.id.hit_hat);
			
	
			
			
			}
	}

