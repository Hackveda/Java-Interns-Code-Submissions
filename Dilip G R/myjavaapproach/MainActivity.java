package com.example.myjavaapproach;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity<implementsonclicke, implementsonclickeListener> extends AppCompatActivity {
    implementsonclickeListener

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    layout.setOrientation(LinearLayout.vert);
    TextView tv = new TextView(this);
    tv.setText("welcome to java Approach");
    layout.addview(tv);

    //create a Button
    Button bt = new Button(this);
    bt.setText("show message");
    bt.setOnClickListener(this);

    //set the layout
    <layout> setcontentview (layout);

    @Override
    public void onclicke(view v){
        //your code
        Toast.makeText(this,"Welcome to java approach",Toast.LENGTH.LONG).show();

    }



}