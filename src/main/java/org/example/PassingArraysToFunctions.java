package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PassingArraysToFunctions {
    public static void doubleMoney(int money){
        money = 2*money;
    }
    public static void doubleMoney(int[] money){
        for (int i = 0; i <money.length ; i++) {
            money[i] = money[i]*2;
        }
    }

    public static void main(String[] args) {
        //passing arrays vs primatives to functions
        int money =100;

        int[] friendsMoney = {100, 300, 200};
        doubleMoney(money);
        System.out.println(money);

        doubleMoney(friendsMoney);
        System.out.println(Arrays.toString(friendsMoney));
    }

}
