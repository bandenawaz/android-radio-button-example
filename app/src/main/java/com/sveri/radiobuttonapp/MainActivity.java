package com.sveri.radiobuttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton rbApple,rbMango,rbOrange;
    TextView tvRes;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializers();
        eventHandler();


    }

    public void initializers(){
        rbApple = findViewById(R.id.radioButtonApple);
        rbMango = findViewById(R.id.radioButtonMango);
        rbOrange = findViewById(R.id.radioButtonOrange);
        tvRes = findViewById(R.id.textViewRes);
        btnSubmit = findViewById(R.id.buttonSubmit);

    }

    public void eventHandler(){
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (rbApple.isChecked()){
                    tvRes.setText("You like Apple");
                }
                if (rbMango.isChecked()) {
                    tvRes.setText("You like Mango");
                }else{
                    tvRes.setText("You like Orange");
                }
            }
        });
    }
}