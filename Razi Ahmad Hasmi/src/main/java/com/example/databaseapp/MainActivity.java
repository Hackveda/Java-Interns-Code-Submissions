package com.example.databaseapp;

import static com.example.databaseapp.R.id.button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1 = (EditText) findViewById(R.id.editText), et2 = (EditText) findViewById(R.id.editText2);
    Button bt1 = (Button) findViewById(button), bt2 = (Button) findViewById(R.id.button2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = et1.getText().toString();
                String task = et2.getText().toString();

                MyDatabase mdb = new MyDatabase(getApplicationContext());
                mdb.open();
                mdb.save(name, task);
                mdb.close();

                Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_LONG).show();

            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Read data from database
                Intent read = new Intent(getApplicationContext(), ReadActivity.class);
                startActivity(read);
                finish();

            }
        });
    }
}