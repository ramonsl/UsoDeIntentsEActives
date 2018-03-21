package com.example.ramonsl.usointent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private CheckBox chkcopy;
    private Button btn;
    private Button btnA;
    private Button btnO;
    private Button btnO2;
    private EditText txtSub;
    private EditText txtMsg;
    private EditText txtPara;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkcopy = findViewById(R.id.chkCopia);
        btn = findViewById(R.id.btnSend);
        btnA = findViewById(R.id.btnActv);
        btnO = findViewById(R.id.btnObj);
        txtSub = findViewById(R.id.txtSub);
        txtMsg = findViewById(R.id.txtMsg);
        txtPara = findViewById(R.id.txtPara);
        btnO2 =  findViewById(R.id.btnObj2);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO); // criar uma intenção
                intent.setType("*/*");
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, txtPara.getText().toString());
                intent.putExtra(Intent.EXTRA_SUBJECT, txtSub.getText().toString());
                intent.putExtra(Intent.EXTRA_STREAM, txtMsg.getText().toString());
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Voce esta no emulador?", Toast.LENGTH_LONG).show();
                }
            }
        });



        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getBaseContext(), msgActivity.class);
                it.putExtra("send",txtPara.getText().toString());
                it.putExtra("msg",txtMsg.getText().toString());
                startActivity(it);

            }
        });

        btnO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Email e = new Email(txtPara.getText().toString(),txtMsg.getText().toString(), txtSub.getText().toString());
                Intent in = new Intent(getApplicationContext(), parceObj.class);
                in.putExtra("email", e);
                startActivity(in);

            }
        });

        btnO2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(), SeriaActivity.class);
                AnotherEmail e = new AnotherEmail(txtPara.getText().toString(),txtMsg.getText().toString(), txtSub.getText().toString());
                in.putExtra("email", e);
                startActivity(in);
            }
        });
    }
}
