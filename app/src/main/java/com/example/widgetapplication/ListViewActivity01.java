package com.example.widgetapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity01 extends AppCompatActivity {
    private String[] data={"黑色小猫","白色小猫","棕色小猫","橘色小猫","狸花猫","波斯猫",
            "黑色小狗", "白色小狗","棕色小狗","柯基", "拉布拉多","金毛","哈士奇"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(ListViewActivity01.this,
                android.R.layout.simple_list_item_1,data);

        ListView listView = findViewById(R.id.list_view01);
        listView.setAdapter(adapter);
    }
}