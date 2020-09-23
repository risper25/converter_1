package com.example.converter_firthowsa_abdikadir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final EditText editMillimeter=findViewById(R.id.editMillimeter);
       final EditText editInches=findViewById(R.id.editInches);
        Button buttonConvert=findViewById(R.id.buttonConvert);
        Button buttonExit=findViewById(R.id.buttonExit);

        buttonConvert.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                double millimeter=Double.valueOf( editMillimeter.getText().toString());
                double inches=millimeter/25.4;
                editInches.setText(String.valueOf(inches));
            }

        });

        buttonExit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                finish();
                System.exit(0);
            }

        });
    }
}
