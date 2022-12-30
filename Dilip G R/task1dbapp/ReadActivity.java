package com.example.task1dbapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ReadActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        tv = (TextView) findViewById(R.id.editTextTextPersonName3);

        MyDatabase mdb = new MyDatabase(getApplicationContext());
        mdb.open();
        String result = mdb.read();
        mdb.close();
        tv.setText(result);
    }
}