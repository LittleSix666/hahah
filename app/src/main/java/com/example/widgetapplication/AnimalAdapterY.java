package com.example.widgetapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class AnimalAdapterY extends ArrayAdapter<Animal> {
    private final int resourceId;

    public AnimalAdapterY(@NonNull Context context, int resource, @NonNull List<Animal> objects) {
        super(context, resource, objects);
        this.resourceId = resource;
    }

    public View getView(int position,@NonNull View convertView,@NonNull ViewGroup parent) {
        Animal animal = getItem(position);
        View view;

        if (convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);

        }else{
            view = convertView;
        }
        /*调用View的findView实例*/
        ImageView animalImage = view.findViewById(R.id.animal_image);
        TextView animalName = view.findViewById(R.id.animal_name);
        /*调用分别ImageView实例的setImageResource()方法和TextView实例的setText（）方法来设置显示的图片和文字*/
        animalImage.setImageResource(animal.getImageId());
        animalName.setText(animal.getName());

        return view;
    }
}
