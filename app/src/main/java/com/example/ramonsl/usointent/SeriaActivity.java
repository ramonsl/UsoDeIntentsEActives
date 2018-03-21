package com.example.ramonsl.usointent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SeriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seria);

        TextView txt = findViewById(R.id.textSerial);
        AnotherEmail a= (AnotherEmail) getIntent().getSerializableExtra("email");
        txt.setText(a.toString());

    }
}
