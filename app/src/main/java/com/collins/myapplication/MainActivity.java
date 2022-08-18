package com.collins.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText firstnumber;
    private EditText secondnumber;
    private Button btnadd;
    private Button btnsubtract;
    private Button btndivide;
    private Button btnmultiply;
    private Button nextpage;
    private TextView displayanswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstnumber = (EditText) findViewById(R.id.firstnumber);
        secondnumber = (EditText) findViewById(R.id.secondnumber);
        btnadd = (Button) findViewById(R.id.btnadd);
        btnsubtract = (Button) findViewById(R.id.btnsubtract);
        btndivide = (Button) findViewById(R.id.btndivide);
        btnmultiply = (Button) findViewById(R.id.btnmultiply);
        displayanswer = (TextView) findViewById(R.id.displayanswer);
        nextpage = (Button) findViewById(R.id.nextpage) ;
        //addition
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((firstnumber.getText().length() >0) && (secondnumber.getText().length() > 0)){

                    double firstnumberr = Double.parseDouble(firstnumber.getText().toString());
                    double secondnumberr = Double.parseDouble(secondnumber.getText().toString());
                    double result = firstnumberr + secondnumberr;
                    displayanswer.setText(Double.toString(result));

                }else{
                    Toast toast = Toast.makeText(MainActivity.this,"Enter required Numbers", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        //subtract
        btnsubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((firstnumber.getText().length() >0) && (secondnumber.getText().length() > 0)){

                    double firstnumberr = Double.parseDouble(firstnumber.getText().toString());
                    double secondnumberr = Double.parseDouble(secondnumber.getText().toString());
                    double result = firstnumberr - secondnumberr;
                    displayanswer.setText(Double.toString(result));

                }else{
                    Toast toast = Toast.makeText(MainActivity.this,"Enter required Numbers", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        //multiplication
        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((firstnumber.getText().length() >0) && (secondnumber.getText().length() > 0)){

                    double firstnumberr = Double.parseDouble(firstnumber.getText().toString());
                    double secondnumberr = Double.parseDouble(secondnumber.getText().toString());
                    double result = firstnumberr * secondnumberr;
                    displayanswer.setText(Double.toString(result));

                }else{
                    Toast toast = Toast.makeText(MainActivity.this,"Enter required Numbers", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        //division
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((firstnumber.getText().length() >0) && (secondnumber.getText().length() > 0)){

                    double firstnumberr = Double.parseDouble(firstnumber.getText().toString());
                    double secondnumberr = Double.parseDouble(secondnumber.getText().toString());
                    double result = firstnumberr / secondnumberr;
                    displayanswer.setText(Double.toString(result));

                }else{
                    Toast toast = Toast.makeText(MainActivity.this,"Enter required Numbers", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        nextpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextpage = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(nextpage);
            }
        });

    }
}