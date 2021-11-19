package com.example.widgetapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity01 extends AppCompatActivity {
    private List<Animal> animalList =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activit_recyclerview);

//        initAnimal();
        RecyclerView recyclerView = findViewById(R.id.recycler_view);

//      RecyclerView通过LayoutManager来实现布局排列管理
//        LinearLayoutManager layoutManager = new LinearLayoutManager(RecyclerViewActivity01.this);

//      水平布局
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        //瀑布流
        StaggeredGridLayoutManager layoutManager= new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);

        AnimalAdapterX adapterX = new AnimalAdapterX(animalList);
        recyclerView.setAdapter(adapterX);

    }

//    private void initAnimal(){
//        Animal heimao = new Animal("黑猫","","",R.drawable.heimao);
//        animalList.add(heimao);
//        Animal baimao = new Animal("白猫","","",R.drawable.baimao);
//        animalList.add(baimao);
//        Animal zongsemao = new Animal("棕色小猫","","",R.drawable.zongsemao);
//        animalList.add(zongsemao);
//        Animal jumao = new Animal("橘猫","","",R.drawable.jumao);
//        animalList.add(jumao);
//        Animal lihuamao = new Animal("狸花猫","","",R.drawable.lihuamao);
//        animalList.add(lihuamao);
//        Animal bosimao = new Animal("波斯猫","","",R.drawable.bosimao);
//        animalList.add(bosimao);
//        Animal heigou = new Animal("黑色小狗","","",R.drawable.heigou);
//        animalList.add(heigou);
//        Animal baisegou = new Animal("白色小狗","","",R.drawable.baisexiaogou);
//        animalList.add(baisegou);
//        Animal zongsegou = new Animal("棕色小狗","","",R.drawable.zongsexiaogou);
//        animalList.add(zongsegou);
//        Animal keji = new Animal("柯基","","",R.drawable.keji);
//        animalList.add(keji);
//        Animal labuladuo = new Animal("拉布拉多","","",R.drawable.labuladuo);
//        animalList.add(labuladuo);
//        Animal jinmao = new Animal("金毛","","",R.drawable.jinmao);
//        animalList.add(jinmao);
//        Animal hashiqi = new Animal("哈士奇","","",R.drawable.hashiqi);
//        animalList.add(hashiqi);
//
//    }
}