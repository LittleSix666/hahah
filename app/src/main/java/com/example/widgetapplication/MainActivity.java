package com.example.widgetapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public List<Animal> storeList0 = new ArrayList<>();
    private  Store store = new Store();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent intent2 = getIntent();
        int storeId = intent2.getIntExtra("storeId",0);


        storeList0 = store.getStoreList();
        Animal choosestore = storeList0.get(storeId);
        ImageView storeImg = findViewById(R.id.store_image);
        TextView storeName = findViewById(R.id.store_name);
        TextView storePrice = findViewById(R.id.store_price);
        TextView storeIntroduce = findViewById(R.id.store_introduce);
        storeImg.setImageResource(choosestore.getImageId());
        storeName.setText(choosestore.getName());
        storePrice.setText(choosestore.getPrice());
        storeIntroduce.setText(choosestore.getIntroduce());
    }
}