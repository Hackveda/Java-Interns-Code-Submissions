package com.example.javaapproach;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        TextView tv = new TextView(this);
        tv.setText("welcome to java approach");
        layout.addView(tv);

        Button bt=new Button(this);
        bt.setText("press here");
        bt.setOnClickListener(this);
        layout.addView(bt);

        setContentView(layout);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "welcome to java approach", Toast.LENGTH_LONG).show();
    }
}