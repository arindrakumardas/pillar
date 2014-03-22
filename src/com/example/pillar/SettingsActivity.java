package com.example.pillar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SettingsActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings_view);

			Button Confirm = (Button) findViewById(R.id.set_button);
			Confirm.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					//Simply kill this activity to go back to the game.
					Intent i = new Intent(SettingsActivity.this, ConnectionActivity.class);
					startActivity(i);				
					finish(); // finish current activity
				}
			});
	}

}
