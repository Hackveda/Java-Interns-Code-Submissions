package com.example.myhybridapproch;

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

        //Refer XML controls in java
        tv = (TextView)findViewById(R.id.textView);
        bt = (Button) findViewById(R.id.button);

        //Event handling on controls in java
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // your code here
               tv.setText("Event performed on button click");
                Toast.makeText(getApplicationContext(),
                        "Button click performed",Toast.LENGTH_LONG).show();
            }
        });
    }

}