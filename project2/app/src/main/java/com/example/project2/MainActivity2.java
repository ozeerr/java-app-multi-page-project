package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView isimhook,soyisimhook,tchook,cinsiyethook,dillerhook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        isimhook=findViewById(R.id.txt_1);
        soyisimhook=findViewById(R.id.txt_2);
        tchook=findViewById(R.id.txt_3);
        cinsiyethook=findViewById(R.id.txt_4);
        dillerhook=findViewById(R.id.txt_5);



        Intent page2=getIntent();
        String isimdata=page2.getStringExtra("isim");
        String soyisimdata=page2.getStringExtra("soyisim");
        String tcnodata=page2.getStringExtra("tcno");
        String cinsiyetdata=page2.getStringExtra("cinsiyet");
        String dillerdata=page2.getStringExtra("diller");

        isimhook.setText(isimdata);
        soyisimhook.setText(soyisimdata);
        tchook.setText(tcnodata);
        cinsiyethook.setText(cinsiyetdata);
        dillerhook.setText(dillerdata);


    }
}