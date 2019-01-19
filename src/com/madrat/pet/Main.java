package com.madrat.pet;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static int sum = 0;

    static List<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args) {
        fibonaci();
    }

    public static void fibonaci() {
        list.add(1);
        list.add(2);
        for(int index = 3; index < 33 ; index++) {
            list.add(list.get(index - 2) + list.get(index - 3));
            System.out.print(list);
        }
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                sum += list.get(i);
            }
            //sum += i;
        }
        System.out.print(sum);
    }
}
