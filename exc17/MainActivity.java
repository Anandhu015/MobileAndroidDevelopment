package com.example.exc17;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bd,bp,bn,bm,bdiv,bq,bac;
    char op;
    String d1=null;
    EditText t1;
    double a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.n1);
        b2=(Button)findViewById(R.id.n2);
        b3=(Button)findViewById(R.id.n3);
        b4=(Button)findViewById(R.id.n4);
        b5=(Button)findViewById(R.id.n5);
        b6=(Button)findViewById(R.id.n6);
        b7=(Button)findViewById(R.id.n7);
        b8=(Button)findViewById(R.id.n8);
        b9=(Button)findViewById(R.id.n9);
        b0=(Button)findViewById(R.id.n0);
        bd=(Button)findViewById(R.id.nd);
        bp=(Button)findViewById(R.id.plus);
        bn=(Button)findViewById(R.id.minus);
        bm=(Button)findViewById(R.id.mul);
        bdiv=(Button)findViewById(R.id.div);
        bq=(Button)findViewById(R.id.total);
        b1=(Button)findViewById(R.id.n1);
        bac=(Button)findViewById(R.id.ac);
        t1=(EditText) findViewById(R.id.editTextNumber);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d1=t1.getText().toString();
                t1.setText(d1+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d1=t1.getText().toString();
                t1.setText(d1+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d1=t1.getText().toString();
                t1.setText(d1+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d1=t1.getText().toString();
                t1.setText(d1+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d1=t1.getText().toString();
                t1.setText(d1+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d1=t1.getText().toString();
                t1.setText(d1+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d1=t1.getText().toString();
                t1.setText(d1+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d1=t1.getText().toString();
                t1.setText(d1+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d1=t1.getText().toString();
                t1.setText(d1+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d1=t1.getText().toString();
                t1.setText(d1+"0");
            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d1=t1.getText().toString();
                t1.setText(d1+".");
            }
        });
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d1=t1.getText().toString();
                a=Double.parseDouble(d1);
                t1.setText(null);
                op='+';
            }
        });
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d1=t1.getText().toString();
                a=Double.parseDouble(d1);
                t1.setText(null);
                op='-';
            }
        });
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d1=t1.getText().toString();
                a=Double.parseDouble(d1);
                t1.setText(null);
                op='*';
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d1=t1.getText().toString();
                a=Double.parseDouble(d1);
                t1.setText(null);
                op='/';
            }
        });
        bq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d1=t1.getText().toString();
                b=Double.parseDouble(d1);
                switch (op)
                {
                    case '+':
                        c=a+b;
                        break;
                    case '-':
                        c=a-b;
                        break;
                    case '*':
                       c=a*b;
                       break;
                    case '/':
                        c=a/b;
                        break;
                    default:
                }
                t1.setText(String.valueOf(c));
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(null);
                a=0;
                b=0;
                c=0;
                d1=null;
            }
        });
    }
}