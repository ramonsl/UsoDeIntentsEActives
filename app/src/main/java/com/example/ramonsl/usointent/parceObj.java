package com.example.ramonsl.usointent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class parceObj extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parce_obj);
        TextView txt= findViewById(R.id.txtParse);
        Intent it = getIntent();

        Email mail= it.getParcelableExtra("email");
        if(mail!=null){
            String msg= mail.toString();
            txt.setText(msg);
        }else{
            txt.setText("Deu Treta");
        }


    }
}
