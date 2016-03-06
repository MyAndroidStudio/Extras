package com.example.hachem.extras;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         Button calculatrice=(Button)findViewById(R.id.MainCalculatrice);
         Button conversion=(Button)findViewById(R.id.MainConversion);
         Button propos=(Button)findViewById(R.id.MainPropos);
        Button fermer=(Button)findViewById(R.id.MainFermer);
        Button chrono=(Button)findViewById(R.id.MainChrono);
        calculatrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Calculatrice1.class));
                System.exit(0);
            }
        });
        conversion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Conversion.class));
                System.exit(0);
            }
        });
        propos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Information.class));
                System.exit(0);
            }
        });
        chrono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Chronometre.class));
                System.exit(0);
            }
        });
        fermer.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                System.exit(0);
                finish();
            }
        });
    }

    @Override
    protected void onDestroy()  {super.onDestroy();}

}
