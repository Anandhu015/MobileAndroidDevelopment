package com.example.myapplication8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bt1,bt2;
    TextView reset,count;
    int mycount=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=(Button)findViewById(R.id.minus);
        bt2=(Button)findViewById(R.id.plus);
        reset=(TextView)findViewById(R.id.reset);
        count=(TextView)findViewById(R.id.zero);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mycount++;
                count.setText(mycount+" ");

            }
    });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mycount--;
                count.setText(mycount+" ");

            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mycount=0;
                count.setText(mycount+" ");

            }
        });


    }
}
