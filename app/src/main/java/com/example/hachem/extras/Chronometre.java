package com.example.hachem.extras;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class Chronometre extends Activity {

    Chronometer focus;
    Button start, stop, restart;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chronometre);
        Button retour=(Button)findViewById(R.id.RetourChron);
        start = (Button) findViewById(R.id.button1);
        stop = (Button) findViewById(R.id.button2);
        restart = (Button) findViewById(R.id.button3);

        focus = (Chronometer) findViewById(R.id.chronometer1);

        start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                focus.start();
            }
        });


        stop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                focus.stop();
            }
        });


        restart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                focus.setBase(SystemClock.elapsedRealtime());
            }
        });


        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chronometre.this, MainActivity.class));
                System.exit(0);
            }
        });
    }


}
