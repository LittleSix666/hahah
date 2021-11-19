package com.example.widgetapplication;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public List<Animal>storeList = new ArrayList<>();

    public List<Animal> getStoreList() {
        initStoreList();
        return storeList;

    }

    private void initStoreList() {
        Animal heimao = new Animal("黑猫","100元","小猫血统纯粹，身体非常健康并且有专业机构检测过后的健康证书，购买后赠送猫粮",R.drawable.heimao);
        storeList.add(heimao);
        Animal baimao = new Animal("白猫","200元","血统纯正,纯白的猫咪最能博的主人的欢心，赶快拥有一只属于你自己的猫咪吧",R.drawable.baimao);
        storeList.add(baimao);
        Animal zongsemao = new Animal("棕色小猫","50元","价格便宜实惠，颜色棕灰，肥肥的样子十分可爱",R.drawable.zongsemao);
        storeList.add(zongsemao);
        Animal jumao = new Animal("橘猫","130元","乖巧可爱，圆圆的脑袋十分可爱",R.drawable.jumao);
        storeList.add(jumao);
        Animal lihuamao = new Animal("狸花猫","60元","家里捕鼠的能手，很好喂养",R.drawable.lihuamao);
        storeList.add(lihuamao);
        Animal bosimao = new Animal("波斯猫","1000元","猫界的可爱代表，毛茸茸的摸起来非常舒服，非常适合撸猫",R.drawable.bosimao);
        storeList.add(bosimao);
        Animal heigou = new Animal("黑色小狗","50元","看门护院的最好选择，价格便宜实惠",R.drawable.heigou);
        storeList.add(heigou);
        Animal baisegou = new Animal("白色小狗","200元","可爱的白色小狗，永远都是出门抱着的最佳选择",R.drawable.baisexiaogou);
        storeList.add(baisegou);
        Animal zongsegou = new Animal("棕色小狗","100元","看起来比较可爱，长大后也是一个看家的小能手",R.drawable.zongsexiaogou);
        storeList.add(zongsegou);
        Animal keji = new Animal("柯基","1500元","狗中可爱的代表，小爱心屁股，狠可爱",R.drawable.keji);
        storeList.add(keji);
        Animal labuladuo = new Animal("拉布拉多","3000元","擅长跑跳，可以训练成优秀导盲犬",R.drawable.labuladuo);
        storeList.add(labuladuo);
        Animal jinmao = new Animal("金毛","4000元","性格温和，体型较大很有安全感，能训练成优秀导盲犬",R.drawable.jinmao);
        storeList.add(jinmao);
        Animal hashiqi = new Animal("哈士奇","5000元","拆家小能手，不过二哈往往能给你带来不一样的体验",R.drawable.hashiqi);
        storeList.add(hashiqi);

    }
}
