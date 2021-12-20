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
    }
    public void ClickMethod(View view){
        Toast.makeText(this,"You have submitted the message",Toast.LENGTH_LONG).show();
    }
}
