package com.example.exc16;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Intent i;
    Button b1;
    Bundle extras;
    String s1;
    TextView tx1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.bt1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);
            }
        });

        Bundle extras=getIntent().getExtras();
        tx1=(TextView) findViewById(R.id.textView);
        s1= extras.getString("pd_value");
        if(s1!=null)
        {
            tx1.setText(s1);
        }
    }
}