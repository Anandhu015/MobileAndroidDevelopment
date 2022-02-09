package com.example.excercise_10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;


import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((RadioButton)view).isChecked();
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.rb1:
                if (checked) {
                    displaymessage("selected Male");
                }
                break;
            case R.id.rb2:
                if (checked) {
                    displaymessage("selected Female");
                }

                break;

        }



    }
    public void displaymessage (String s)
    {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }


}



