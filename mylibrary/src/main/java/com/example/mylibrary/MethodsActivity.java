package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class MethodsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_methods);

    }


    public String Call(){
        return "calling";
    }

    public String Build3(){
        return "build 3 successfully";
    }

    public String player(){
        return "build 3 successfully";
    }
}