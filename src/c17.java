
import java.util.*;
//1.
//Iteractor.
// class Java17 {
//    public static void main(String[] args) {
//     ArrayList<Integer>list=new ArrayList<>();
//      list.add(10);
//      list.add(1);
//      list.add(2);
//      list.add(3);
//      list.add(4);
//      Iterator<Integer> it=list.iterator();
//      while(it.hasNext()) {
//          Integer i=it.next();
//          System.out.println(i);
//          if(i==3){
//              it.remove();
//          }
//      }
//        System.out.print("After Removal:"+list);
//    }
//}


//2.
//List iteractor
// class Java17 {
//    public static void main(String[] args) {
//        ArrayList<Integer>list=new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        ListIterator<Integer>it=list.listIterator();
//        while(it.hasNext()) {
//            Integer i = it.next();
//            System.out.println( "HasNext:"+i);
//            if(i==6) {
//                it.remove();
//            }
//            if(i==7) {
//                it.add(8);
//            }
//            if(i==5) {
//                it.set(10);
//            }
//        }
//        System.out.println("After remove 6:"+list);
//        System.out.println("After add 7:"+list);
//        System.out.println("After set 5:"+list);
//
//
//        while(it.hasPrevious()) {
//            Integer i = it.previous();
//            System.out.println("HasPrevious:"+i);
//            if(i==4) {
//                it.remove();
//            }
//            if(i==2) {
//                it.add(8);
//            }
//            if(i==3) {
//                it.set(10);
//            }
//        }
//        System.out.println("After remove 4:"+list);
//        System.out.println("After add 2:"+list);
//        System.out.println("After set 3:"+list);
//    }
//}


//3.
//All odd number is replace by -1.
//import java.util.ArrayList;
//
// class Java17 {
//    public static void main(String[] args) {
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(10);
//        list.add(21);
//        list.add(30);
//        list.add(45);
//        list.add(50);
//        list.add(63);
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) % 2 != 0) {
//                list.set(i, -1);
//            }
//        }
//        System.out.println(list);
//    }
//}

//4.
//Reverse print.
// class Java17 {
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        list.add(9);
//        list.add(10);
//        int a = list.size();
//        int m = a / 2;
//        ListIterator<Integer> it = list.listIterator();
//        while (it.hasNext() && it.nextIndex() <= m) {
//            Integer i = it.next();
//                System.out.println(i);
//            }
//        while (it.hasPrevious()) {
//            Integer j = it.previous();
//            System.out.println(j);
//        }
//        }
//    }

//5.
//All negative replace to absolute vale
//class Java17 {
//    public static void main(String[] args) {
//
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(-1);
//        list.add(4);
//        list.add(-7);
//        list.add(-6);
//        list.add(2);
//
//        ListIterator<Integer> it = list.listIterator();
//
//        while (it.hasNext()) {
//            int val = it.next();
//            if (val < 0) {
//                it.set(Math.abs(val));   // replace negative with absolute value
//            }
//        }
//        System.out.println(list);
//    }
//}

//6.
import java.util.Scanner;
//if t=14 then remove small list in t and print list.
// class Java17 {
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(20);
//        list.add(10);
//        list.add(5);
//        list.add(14);
//        list.add(3);
//        list.add(16);
//        ListIterator<Integer>it = list.listIterator();
//
//        int target;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter Target Number");
//        target = sc.nextInt();
//
//        if (!list.contains(target)) {
//            System.out.println("Target value NOT found in list!");
//            System.out.println("List remains same: " + list);
//            return;   // Stop program
//        }
//        while(it.hasNext()){
//            if(it.next()<target){
//                it.remove();
//            }
//        }
//        System.out.println(list);
//    }
//}