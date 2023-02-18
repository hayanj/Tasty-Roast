package com.example.roasted;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.RadioAccessSpecifier;
import android.view.View;
import android.widget.RadioButton;

public class Payment extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_payment);
        }
        public void checkOut(View view){
            RadioButton visa=(RadioButton) findViewById(R.id.visaPay);
            RadioButton cash=(RadioButton) findViewById(R.id.cashPay);
            if(visa.isChecked()){
                Intent intent=new Intent(Payment.this,visa.class);
                startActivity(intent);
            }
            if(cash.isChecked()){
                Intent intent=new Intent(Payment.this,Order_completed.class);
                startActivity(intent);
            }
        }
    }