package com.example.roasted;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class roasterItem extends AppCompatActivity {
Button ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roaster_item);
        ad= (Button) findViewById(R.id.button);
        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(roasterItem.this, cartList.class);
                startActivity(intent);
            }
        });
    }
}
