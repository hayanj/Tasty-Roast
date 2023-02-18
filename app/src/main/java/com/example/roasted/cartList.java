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

public class cartList extends AppCompatActivity {

    ListView listView;
    Button b;
    String Names [] = {"Columbian","Indian"};
    String descs [] ={"it is just behind brazilian coffee in terms of taste with its Arabica coffee bean", "The much renowned coffee beans grown in the south region of the country, they're known for their soft taste and high levels of acidity"};
    int productImages[] = {R.drawable.bag};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_cart_list);

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
            super(c,R.layout.activity_row4, R.id.name,Names);
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
            View row4 = layoutInflater.inflate(R.layout.activity_row4, parent,false);
            TextView Names1 = row4.findViewById(R.id.name);
            TextView desc1 = row4.findViewById(R.id.des);
            //ImageView imageP = row3.findViewById(R.id.itemImage);


            Names1.setText(rNames[position]);
            desc1.setText(rDescs[position]);
//            imageP.setImageResource(rImages[position]);
            b =(Button) row4.findViewById(R.id.button3);
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(cartList.this, Payment.class);
                    startActivity(intent);
                }
            });

            return row4;
        }
    }
}
