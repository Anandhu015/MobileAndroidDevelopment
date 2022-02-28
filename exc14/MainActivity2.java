package com.example.exc14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Bundle extras;
    String s1;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=(TextView) findViewById(R.id.textView);
        extras=getIntent().getExtras();
        s1=extras.getString("value1");
        t1.setText(t1.getText()+" "+s1);
    }
}