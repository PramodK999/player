package com.example.demo4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.mylibrary.MethodsActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MethodsActivity i = new MethodsActivity();
       Toast.makeText(this, i.Call(), Toast.LENGTH_SHORT).show();


    }
}