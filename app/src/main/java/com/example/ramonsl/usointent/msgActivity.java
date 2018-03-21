package com.example.ramonsl.usointent;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class msgActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msg);
        TextView txt= findViewById(R.id.mostra);

        Intent it= getIntent();
        String para= it.getStringExtra("send");
        String msg = it.getStringExtra("msg");
        String toastMsg= para.toUpperCase()+"  " +" "+ msg.toUpperCase();

        Toast.makeText(getApplicationContext(),toastMsg,Toast.LENGTH_LONG).show();
        txt.setText(toastMsg);
    }
}
