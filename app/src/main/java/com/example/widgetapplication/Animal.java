package com.example.widgetapplication;

public class Animal {
    private String name,price,introduce;
    private  int imageId;


    public Animal(String name,String price,String introduce,int imageId){
        this.name = name;
        this.imageId = imageId;
        this.price = price;
        this.introduce = introduce;

    }

    public String getName(){
        return name;
    }
    public String getPrice(){return price;}
    public String getIntroduce(){return introduce;}
    public int getImageId(){
        return imageId;
    }

}
