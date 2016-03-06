
package com.example.hachem.extras;


        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class Conversion extends Activity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.convertion);
        Button retour=(Button)findViewById(R.id.RetourConv);
        Button conv=(Button)findViewById(R.id.IDconvertion);
        retour.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v)
            {
                startActivity(new Intent(Conversion.this,MainActivity.class));
                System.exit(0);
            }
        });
        conv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                TextView oct=(TextView)findViewById(R.id.IDoctale);
                TextView hex=(TextView)findViewById(R.id.IDhexadecimal);
                TextView bin=(TextView)findViewById(R.id.IDbinaire);
                EditText dec=(EditText)findViewById(R.id.IDdecimal);
                if(!dec.getText().toString().equals(""))
                {
                    oct.setText(toOctal(Integer.parseInt(dec.getText().toString())));
                    hex.setText(toHexa(Integer.parseInt(dec.getText().toString())));
                    bin.setText(toBinary(Integer.parseInt(dec.getText().toString())));
                }

            }
        });



    }

    public static String toBinary(int d)
    {
        return Integer.toBinaryString(d);
    }
    public static String toOctal(int d)
    {
        return Integer.toOctalString(d);
    }
    public static String toHexa(int d)
    {
        return Integer.toHexString(d);
    }

}