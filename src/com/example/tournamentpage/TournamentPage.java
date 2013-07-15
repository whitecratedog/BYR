package com.example.tournamentpage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TournamentPage extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
       Button b =(Button) findViewById(R.id.btnLogin);
      //  TextView registerScreen = (TextView) findViewById(R.id.link_to_register);
        
        // Listening to register new account link
      b.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// Switching to Register screen
				Intent i = new Intent(getApplicationContext(), ReadJson.class);
				startActivity(i);
			}
		});
    }
}