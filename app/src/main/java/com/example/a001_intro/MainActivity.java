package com.example.a001_intro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText etUN, etPass;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUN=findViewById(R.id.main_etUserName);
        etPass=findViewById(R.id.main_etPassword);
        btn=findViewById(R.id.main_btnSetText);
        etUN.setText("Test UserName");
        etPass.setText("Test Password");
        etUN.setText("hhhhhhh");
    }
}