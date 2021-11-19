package com.example.widgetapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity02 extends AppCompatActivity {
    private List<Animal> animalList =new ArrayList<>();
    private Store store = new Store();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

//        initAnimal();/*初始化动物数据*/
//        AnimalAdapter animalAdapter = new AnimalAdapter(ListViewActivity02.this,
//                R.layout.animal_item,animalList);
//
//        ListView listView =findViewById(R.id.list_view01);
//        listView.setAdapter(animalAdapter);

        animalList = store.getStoreList();

        /*数据加载效率优化*/
        AnimalAdapterR animalAdapterR = new AnimalAdapterR(ListViewActivity02.this,R.layout.animal_item,animalList);

        ListView listView = findViewById(R.id.list_view01);
        listView.setAdapter(animalAdapterR);

        /*listView的点击事件*/
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
/*                Animal animal = animalList.get(i);
                Toast.makeText(ListViewActivity02.this,animal.getName(),Toast.LENGTH_SHORT).show();*/

                Intent intent = new Intent(ListViewActivity02.this,MainActivity.class);
                intent.putExtra("storeId",i);
                startActivity(intent);
            }
        });

    }
//    private void initAnimal(){
//        Animal heimao = new Animal("黑猫",R.drawable.heimao);
//        animalList.add(heimao);
//        Animal baimao = new Animal("白猫",R.drawable.baimao);
//        animalList.add(baimao);
//        Animal zongsemao = new Animal("棕色小猫",R.drawable.zongsemao);
//        animalList.add(zongsemao);
//        Animal jumao = new Animal("橘猫",R.drawable.jumao);
//        animalList.add(jumao);
//        Animal lihuamao = new Animal("狸花猫",R.drawable.lihuamao);
//        animalList.add(lihuamao);
//        Animal bosimao = new Animal("波斯猫",R.drawable.bosimao);
//        animalList.add(bosimao);
//        Animal heigou = new Animal("黑色小狗",R.drawable.heigou);
//        animalList.add(heigou);
//        Animal baisegou = new Animal("白色小狗",R.drawable.baisexiaogou);
//        animalList.add(baisegou);
//        Animal zongsegou = new Animal("棕色小狗",R.drawable.zongsexiaogou);
//        animalList.add(zongsegou);
//        Animal keji = new Animal("柯基",R.drawable.keji);
//        animalList.add(keji);
//        Animal labuladuo = new Animal("拉布拉多",R.drawable.labuladuo);
//        animalList.add(labuladuo);
//        Animal jinmao = new Animal("金毛",R.drawable.jinmao);
//        animalList.add(jinmao);
//        Animal hashiqi = new Animal("哈士奇",R.drawable.hashiqi);
//        animalList.add(hashiqi);
//
//    }
}