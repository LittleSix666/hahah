package com.example.widgetapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import  androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/*实现步骤建议：
* 1、首先定义内部内ViewHolderR，注意类名与RecyclerView.ViewHolder类名的区别，免除后续混淆烦恼；
* 2、然后实现AnimalAdapterX类的继承设置RecyclerView.Adapter<AnimalAdapter.ViewHolderX>;
* 3、随后定义内部数据列表和AnimalAdapterX构造方法；
* 4、最后实现所需的@overider方法；
*  */

public class AnimalAdapterX extends RecyclerView.Adapter<AnimalAdapterX.ViewHolderX> {
    private List<Animal> mAnimalList;

    public AnimalAdapterX(List<Animal> mAnimalList) {
        this.mAnimalList = mAnimalList;
    }

//  onCreateViewHolder方法用于引入子项布局创建ViewHolde实例，并将加载的布局传入构造函数中，最后返回该实例
    @NonNull
    @Override
    public ViewHolderX onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.animal_item,parent,false);
        final ViewHolderX holderX = new ViewHolderX(view);

        holderX.animalView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = holderX.getAdapterPosition();
                Animal animal =mAnimalList.get(position);
                Toast.makeText(view.getContext(),"You Click view" + animal.getName(),Toast.LENGTH_SHORT).show();
            }
        });

        return holderX;
    }
//   onBindViewHolder 方法用于对RecyclerView子项的数据进行赋值，即将Animal实例取出的图片和文本信息设置ViewHolderX中对应变量
    @Override
    public void onBindViewHolder(@NonNull ViewHolderX holder, int position) {
        Animal animal = mAnimalList.get(position);
        holder.animalImage.setImageResource(animal.getImageId());
        holder.animalName.setText(animal.getName());
    }

//  getItemCount方法用于告诉RecyclerView一共有多少个子项
    @Override
    public int getItemCount() {
        return mAnimalList.size();
    }

//ViewHolder的主要作用就是将XML中的控件以变量的形式保存起来，方便我们后面数据绑定。
    static class ViewHolderX extends RecyclerView.ViewHolder{
        View animalView;    /*为点击事件做准备*/
        ImageView animalImage;
        TextView animalName;

        public ViewHolderX(@NonNull View itemView) {
            super(itemView);
            animalView = itemView;
            animalImage = itemView.findViewById(R.id.animal_image);
            animalName = itemView.findViewById(R.id.animal_name);
        }
    }

    }

