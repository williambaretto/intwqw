package com.demo;

import com.newdemo.NewDemos;

public class Demohelper {
    public static void main(String[] args) {
        Demomodel demomodel = new Demomodel();
        System.out.println(demomodel.getData());
        NewDemos newDemos = new NewDemos("sam");

        System.out.println(newDemos.getA());
    }
}
