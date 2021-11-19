package com.example.widgetapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;
/*
* 实现步骤建议：
* 1.继承ArrayAdaper类，并重写适配器构造函数；
* 2.定义适配器成员变量（子项分布资源id）；
* 3.重写getView（）方法，实现数据与子项布局资源对象的匹配；
* */
public class AnimalAdapter extends ArrayAdapter<Animal>{
    private  final  int resourceId;
    /*选择构造函数时多注意参数的正确选用*/
    public AnimalAdapter(@NonNull Context context, int resource, @NonNull List<Animal> objects) {
        super(context, resource, objects);
        this.resourceId = resource;
    }
    /*通过Generate生成Ovreride Methods*/
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Animal animal = getItem(position);
        /*为子项加载传入的布局*/
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);

        /*调用View的findViewByid()获取ImageView实例和TextView*/
        ImageView animalImage = view.findViewById(R.id.animal_image);
        TextView animalName = view.findViewById(R.id.animal_name);

        /*调用分别ImageView实例的setImageResource()方法和TextView实例的setText（）方法来设置显示的图片和文字*/
        animalImage.setImageResource(animal.getImageId());
        animalName.setText(animal.getName());

        return view;
    }
}
