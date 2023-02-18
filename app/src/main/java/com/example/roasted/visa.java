package com.example.roasted;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class visa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visa);
    }
    public void checkOut(View view){
        Intent intent=new Intent(visa.this,Order_completed.class);
        startActivity(intent);
    }
}