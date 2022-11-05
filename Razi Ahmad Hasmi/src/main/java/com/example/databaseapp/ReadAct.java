package com.example.databaseapp;

import static com.example.databaseapp.R.id.textView2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ReadAct extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

            tv = (TextView) findViewById(textView2);

            MyDatabase mdb = new MyDatabase(getApplicationContext());
            mdb.open();
            String result = mdb.read();
            mdb.close();

            tv.setText(result);
    }
}