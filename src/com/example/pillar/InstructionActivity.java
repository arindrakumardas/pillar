package com.example.pillar;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.app.Activity;
import android.content.Intent;

public class InstructionActivity extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.instruction_view);


		// Play (Resume) Button
		Button playBtn = (Button) findViewById(R.id.info);
		playBtn.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(InstructionActivity.this, SettingsActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("finishstatus", true);
                startActivity(intent);
                finish();
			}
		});


	}
}
