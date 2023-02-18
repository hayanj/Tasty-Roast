package com.example.roasted;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {
    private TextView textv1,textv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Realm.init(getApplicationContext());
        Realm realm= Realm.getDefaultInstance();
        setContentView(R.layout.activity_main);

        textv2 =(TextView) findViewById(R.id.customer);
        textv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,cLoogin.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"ياهلا",Toast.LENGTH_SHORT).show();
            }
        });

        textv1 =(TextView) findViewById(R.id.roaster);
        textv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,rLogin.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"ياهلا",Toast.LENGTH_SHORT).show();
            }
        });


    }



}



