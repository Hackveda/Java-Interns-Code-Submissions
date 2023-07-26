package com.example.hybridapproach;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.textView);
       bt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               tv.setText("Event performed on button click");
               Toast.makeText(getApplicationContext(),"Message Sent", Toast.LENGTH_LONG).show();
           }
       });
    }
}