package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=(Spinner)findViewById(R.id.sp);
        spinner.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this,R.array.planets, android.R.layout.simple_dropdown_item_1line);
        adapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this,"selected item is" +adapterView.getItemAtPosition(i),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}