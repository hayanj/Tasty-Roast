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
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.roasted.R;

public class OrdersList extends AppCompatActivity {
    private ImageView back;

    ListView listView;
    String rOrder[] = {"Order #1" , "Order #2"};
    String rStatus [] = {"status","status"};
    String rCurrentStatus [] ={"RECIVED", "CANCELED"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_orders_list);

        listView = findViewById(R.id.ListView);




        MyAdapter adapter = new MyAdapter(this, rOrder, rStatus, rCurrentStatus);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){

                            Intent intent=new Intent(OrdersList.this, Orders.class);
                            startActivity(intent);
                        }

                }


        });


    }
    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rOrder [] ;
        String rStatus[];
        String rCurrentStatus [];
        MyAdapter(Context c,String ORDER[],
                  String STATUS[], String CURRENTSTATUS[]){
            super(c,R.layout.activity_row2, R.id.OrderRow2,ORDER);
            this.context =c;
            this.rOrder = ORDER;
            this.rStatus=STATUS;
            this.rCurrentStatus=CURRENTSTATUS;


        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent){
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row2 = layoutInflater.inflate(R.layout.activity_row2, parent,false);
            TextView Order1 = row2.findViewById(R.id.OrderRow2);
            TextView status1 = row2.findViewById(R.id.status);
            TextView currentStatus1 = row2.findViewById(R.id.currentStatus);


            Order1.setText(rOrder[position]);
            status1.setText(rStatus[position]);
            currentStatus1.setText(rCurrentStatus[position]);

            return row2;
        }
    }
}
