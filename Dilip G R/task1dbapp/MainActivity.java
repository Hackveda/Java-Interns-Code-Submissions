package com.example.task1dbapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    Button bt1,bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.editTextTextPersonName);

        et2 = (EditText) findViewById(R.id.editTextTextPersonName2);

        bt1 = (Button) findViewById(R.id.button);
        bt2 = (Button) findViewById(R.id.button2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Save data to database


                String name = et1.getText().toString();
                String task = et2.getText().toString();

                MyDatabase mdb = new MyDatabase(getApplicationContext());
                mdb.open();
                mdb.save(name, task);
                try {
                    mdb.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Toast.makeText(getApplicationContext(), "SAVED", Toast.LENGTH_LONG).show();
            }
        });

        Class<?> ReadActivity = null;
        bt2.setOnClickListener(new View.OnClickListener() {
            private Context Class;

            @Override
            public void onClick(View v) {
                // Read data from database
            }

            final Intent read = new Intent(getApplicationContext(),
                    ReadActivity, Class);







        });
    }

    }
