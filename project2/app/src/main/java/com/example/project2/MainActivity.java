package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText name_hook,surname_hook,tcno_hook;
    RadioButton male_hook,female_hook;
    TextView sonuc;
    CheckBox java_hook,kotlin_hook,python_hook,cs_hook,cplus_hook;
    String cinsiyet,diller;
    Button button_hook;

    ArrayList<String> languages = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name_hook=findViewById(R.id.name_input);
        surname_hook=findViewById(R.id.surname_input);
        tcno_hook=findViewById(R.id.tcno);
        male_hook=findViewById(R.id.male);
        female_hook=findViewById(R.id.female);
        java_hook=findViewById(R.id.java);
        kotlin_hook=findViewById(R.id.kotlin);
        python_hook=findViewById(R.id.python);
        cs_hook=findViewById(R.id.cs);
        cplus_hook=findViewById(R.id.cplus);
        sonuc=findViewById(R.id.result);
        button_hook=findViewById(R.id.button);




        male_hook.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked){
                cinsiyet="erkek";
            }
            }
        });
        female_hook.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    cinsiyet="kız";
                }
            }
        });

        java_hook.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                   languages.add("java");
                }
                else{
                    languages.remove("java");
                }
            }
        });

        kotlin_hook.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    languages.add("kotlin");
                }
                else{
                    languages.remove("kotlin");
                }
            }
        });

        python_hook.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    languages.add("python");
                }
                else{
                    languages.remove("python");
                }
            }
        });
        cs_hook.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    languages.add("C#");
                }
                else{
                    languages.remove("C#");
                }
            }
        });
        cplus_hook.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    languages.add("C++");
                }
                else{
                    languages.remove("C++");
                }
            }
        });



        button_hook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                languages.forEach(fruit ->diller= String.valueOf(languages));
                String isim=name_hook.getText().toString();
                String soyisim=surname_hook.getText().toString();
                String tcno=tcno_hook.getText().toString();

                Intent page2=new Intent(getApplicationContext(),MainActivity2.class);
                page2.putExtra("isim",isim);
                page2.putExtra("soyisim",soyisim);
                page2.putExtra("tcno",tcno);
                page2.putExtra("cinsiyet",cinsiyet);
                page2.putExtra("diller",diller);


                startActivity(page2);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        finish();

                        Intent intent = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                }, 10000);
            }
        });


    }



}