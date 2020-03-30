package com.example.pizzaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText cal, fah;
    Button bOK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cal= (EditText) findViewById(R.id.editTxt1);
        fah= (EditText) findViewById(R.id.edittxt2);
        bOK = findViewById(R.id.bt1);

        bOK.setOnClickListener(this);
    }
    @Override
    public void Onclick(View view){
        double f,c ;
        if(cal.getText().toString().equals("")&& fah.getText().toString().equals(""))
            Toast.makeText(getApplicationContext(),"please enter the temperature",Toast.LENGTH_SHORT).show();
        else if (cal.getText().toString().equals("")) {
            //from fah to cel
            f = Double.parseDouble(fah.getText().toString());
            c = 5 * (f - 32) / 9;
            String ce = String.format("%.1f,c");
            cal.setText(ce);

        }else if (fah.getText().toString().equals("")) {
            //from cel to fah
            c = Double.parseDouble(cal.getText().toString());
            f = 9 * c / 5 + 32;
            String fa = String.format("%.1f, f");
            fah.setText(fa);
        }
    }
}
