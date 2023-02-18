package com.example.roasted;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.roasted.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class cSignUp extends AppCompatActivity  {


    EditText firstName ;
    EditText mobile ;
    EditText email ;
    EditText password ;
    EditText address ;
    Button signUp;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAuth = FirebaseAuth.getInstance();
        setContentView(R.layout.activity_c_sign_up);
        signUp = (Button) findViewById(R.id.SignUpBtn);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstName = (EditText) findViewById(R.id.firstname);
                final String fName = firstName.getText().toString();
                password =(EditText) findViewById(R.id.password);
                final String Password = password.getText().toString();
                mobile =(EditText) findViewById(R.id.mobile);
                final String Mobile = mobile.getText().toString();
                email =(EditText) findViewById(R.id.Email);
                final String Email = email.getText().toString();
                address =(EditText) findViewById(R.id.address);
                final String Address = address.getText().toString();
                if(TextUtils.isEmpty(firstName.getText().toString())){
                    firstName.setError("First Name is required");
                    return;
                }

                mAuth.createUserWithEmailAndPassword(Email,Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Customer customer = new Customer();
                            customer.setEmail(Email);
                            customer.setFirstName(fName);
                            customer.setLocation(Address);
                            customer.setPassword(Password);
                            customer.setPhoneNumber(Mobile);
                            FirebaseDatabase.getInstance().getReference("Customers").child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                    .setValue(customer).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if(task.isSuccessful()){
                                        Toast.makeText(cSignUp.this,"Added",Toast.LENGTH_SHORT).show();
                                        startActivity(new Intent(getApplicationContext(),roastersMenu.class));
                                    }
                                    else{}


                                }
                            });
//
                        } else{

                            Toast.makeText(cSignUp.this,"failed"+task.getException().getMessage(),Toast.LENGTH_SHORT).show();


                        }

                    }
                });


//                        roaster.setCompanyName(companyName.getText().toString());
//                        roaster.setPhoneNum(mobile.getText().toString());
//                        roaster.setEmail(Email.getText().toString());
//                        roaster.setPassword(password.getText().toString());
//                        roaster.setComAddress(address.getText().toString());
//                        roaster.setRegNumber(reg.getText().toString());







            }







        });


    }

}