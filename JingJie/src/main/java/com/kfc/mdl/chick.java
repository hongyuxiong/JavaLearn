package com.kfc.mdl;

public class chick {
    public  int aa = 10;
    protected int bb =20;
    int cc = 30;
    private int dd = 40;

    public static void diaoyong3(){
        System.out.println("我是被导入的");
    }
    public void show(){
        chick a = new chick();
    }
}
