
//package lect21;

import java.util.ArrayList;
import java.util.List;

class hello {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        List<Integer> res=list.stream().filter(num->num%20==0).toList();
        List<Integer>mapdata=list.stream().map(num->num*2).toList();
        int data=list.stream().reduce(0,(a,b)->a+b);
        List<Integer> skip =list.stream().skip(2).toList();
        List<Integer> limit =list.stream().limit(3).toList();
        // System.out.println(mapdata);
        // System.out.println(res);
        System.out.println(data);
    }

}