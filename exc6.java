package com.example.exc5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button click_button=findViewById(R.id.button1);
        TextView mytext=findViewById(R.id.textview1);
        click_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mytext.setText("Hello all...");

            }
        });
    }
}
