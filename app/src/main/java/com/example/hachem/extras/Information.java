package com.example.hachem.extras;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Information extends Activity
{ public Intent i;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information);
        Button retour=(Button)findViewById(R.id.RetourPropos);

        retour.setOnClickListener(new View.OnClickListener()
        {

            @Override

            public void onClick(View v)
            {
                startActivity(new Intent(Information.this,MainActivity.class));
                System.exit(0);
            }
        });




    }



}