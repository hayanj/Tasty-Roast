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

public class roastersMenu extends AppCompatActivity {

    ListView listView;
    String mTitle[] = {"Roaster 1"};
    String mDescription [] = {"Fat Cat Description"};
    int images [] ={R.drawable.tastyroast};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roasters_menu);
        listView = findViewById(R.id.ListView);
        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(roastersMenu.this, itemMenuCustomer.class);
                    startActivity(intent);

                }

            }
        });
    }
    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle [] ;
        String rDescription[];
        int rImage [];
        MyAdapter(Context c,String title[],
                  String description[], int imgs[]){
            super(c,R.layout.activity_row, R.id.textView1,title);
            this.context =c;
            this.rTitle = title;
            this.rDescription=description;
            this.rImage=imgs;


        }
        @NonNull
        public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent){
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.activity_row, parent,false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            images.setImageResource(rImage[position]);
            myTitle.setText(rTitle[position]);
            return row;
        }
    }
}
