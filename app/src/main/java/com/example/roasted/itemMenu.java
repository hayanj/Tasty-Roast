package com.example.roasted;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.roasted.R;
import com.google.firebase.auth.FirebaseAuth;

public class itemMenu extends AppCompatActivity {

    ListView listView;
    Button b;
    String Names [] = {"Columbian"};
    String descs [] ={"it is just behind brazilian coffee in terms of taste with its Arabica coffee bean"};
    int productImages[] = {R.drawable.bag};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_item_menu);

        listView = findViewById(R.id.ListView);




        MyAdapter adapter = new MyAdapter(this, Names, descs, productImages);
        listView.setAdapter(adapter);

//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if (position==0){
//
//                    Intent intent=new Intent(itemMenu.this, Orders.class);
//                    startActivity(intent);
//                }
//
//            }
//
//
//        });


    }
    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rNames [] ;
        String rDescs[];
        int rImages [];
        MyAdapter(Context c,String rNames[],
                  String rDescs[], int rImages[]){
            super(c,R.layout.activity_row3, R.id.name,Names);
            this.context =c;
            this.rNames = Names;
            this.rDescs=descs;
            this.rImages=productImages;


        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent){
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row3 = layoutInflater.inflate(R.layout.activity_row3, parent,false);
            TextView Names1 = row3.findViewById(R.id.name);
            TextView desc1 = row3.findViewById(R.id.des);
            //ImageView imageP = row3.findViewById(R.id.itemImage);


            Names1.setText(rNames[position]);
            desc1.setText(rDescs[position]);
            b =(Button) row3.findViewById(R.id.addProduct);
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(itemMenu.this, addItem.class);
                    startActivity(intent);
                }
            });
//            imageP.setImageResource(rImages[position]);

            return row3;
        }
    }
}
