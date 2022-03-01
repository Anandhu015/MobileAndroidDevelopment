package com.example.exc16;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    Button b2;
    Intent i1;
    EditText t2;
    String s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b2=(Button) findViewById(R.id.bt2);
        t2=(EditText) findViewById(R.id.e2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i1=new Intent(MainActivity2.this,MainActivity.class);
                 s2=t2.getText().toString();
                i1.putExtra("pd_value",s2);
                startActivity(i1);
            }
        });

    }
}