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

public class AnimalAdapterR extends ArrayAdapter<Animal> {
private  final int resourceId;
    public AnimalAdapterR(@NonNull Context context, int resource, @NonNull List<Animal> objects) {
        super(context, resource, objects);
        this.resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Animal animal = getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder = new ViewHolder();

            viewHolder.animalImage=view.findViewById(R.id.animal_image);
            viewHolder.animalName=view.findViewById(R.id.animal_name);
            view.setTag(viewHolder);

        }else{
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.animalImage.setImageResource(animal.getImageId());
        viewHolder.animalName.setText(animal.getName());

        return view;
    }
    /*ViewHolder是一个静态类，用于保存每行的视图以避免每次调用getview时都调用findviewbyid`*/
    class ViewHolder{
        ImageView animalImage;
        TextView animalName;

    }
}



