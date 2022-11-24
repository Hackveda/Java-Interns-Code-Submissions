package com.example.introductiontodatabase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText et1,am;
    Button rs,bt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        et1 = (EditText) findViewById(R.id.editTextTextPersonName);
        am = (EditText) findViewById(R.id.editTextTextPersonName2);
        rs = (Button) findViewById(R.id.button);
        bt2 = (Button) findViewById(R.id.button2);



        rs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Save data to Database
                String name = et1.getText().toString();
                String task = am.getText().toString();
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