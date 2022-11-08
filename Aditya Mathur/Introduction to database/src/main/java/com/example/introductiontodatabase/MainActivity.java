package com.example.introductiontodatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
                //Save data to Database
                String name = et1.getText().toString();
                String task = et2.getText().toString();
                Mydatabase mdb = new Mydatabase(getApplicationContext());
                mdb.open();
                mdb.save(name,task);
                mdb.close();

                Toast.makeText(getApplicationContext(), "Database Saved!", Toast.LENGTH_SHORT).show();

            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Read Data from Database
                Intent read = new Intent(getApplicationContext(),ReadActivity.class);
                startActivity(read);
                finish();

            }
        });


    }
}