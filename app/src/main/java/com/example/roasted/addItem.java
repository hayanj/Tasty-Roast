package com.example.roasted;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.concurrent.atomic.AtomicMarkableReference;

public class addItem extends AppCompatActivity {
    Item item;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAuth = FirebaseAuth.getInstance();
       // ImageView Check1;



       /* Check1= (ImageView) findViewById(R.id.Check);
        Check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(addItem.this, OrderMain.class);
                startActivity(intent);
                Toast.makeText(addItem.this,"Item Added",Toast.LENGTH_SHORT).show();
            }
        });*/
        setContentView(R.layout.activity_add_item);
    }
    public void add_item(View view) {
        /*EditText name, des, price, code;
        code = (EditText) findViewById(R.id.itemCode);
        name = (EditText) findViewById(R.id.productName);
        des = (EditText) findViewById(R.id.productDescription);
        price = (EditText) findViewById(R.id.productPer);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.stock);
        RadioButton inStock = (RadioButton) findViewById(R.id.inStockRadio);
        RadioButton outStock = (RadioButton) findViewById(R.id.OutOfStockRadio);*/
        Intent intent=new Intent(addItem.this, OrderMain.class);
        startActivity(intent);
        Toast.makeText(addItem.this,"Item Added",Toast.LENGTH_SHORT).show();
       /* boolean stock = inStock.isChecked();
        String pName = name.getText().toString();
        String pDes = des.getText().toString();
        String price1 = price.getText().toString();
        String code1 = code.getText().toString();
        double pPrice = Double.parseDouble(price1);
        int pCode = Integer.parseInt(code1);

        item = new Item();
        item.setProductCode(pCode);
        item.setProductPricePer4(pPrice);
        item.setProductDes(pDes);
        item.setProductName(pName);
        item.setInStock(stock);






        FirebaseDatabase.getInstance().getReference("Items").child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                .setValue(item).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful()){
                    Toast.makeText(addItem.this,"Item Added",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(),OrderMain.class));
                }
                else{
                    Toast.makeText(addItem.this,"Item Not Added",Toast.LENGTH_SHORT).show();

                }









            }



    });*/
    }
}
