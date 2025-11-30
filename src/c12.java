// import java.util.*;
// public class c12 {
//    public static void main(String[] args){
 //       HashMap<Integer,Integer>map=new HashMap<>();
// 1.        map.put(2, 20);
//        System.out.println(map.get(3));
//        System.out.println(map.getOrDefault(3,10));
//        System.out.println(map.get(3));
//        for (int x:map.keySet()){
//            System.out.println(map.get(x));
//        }


// 2.  HashMap<Integer,Integer> map=new HashMap<>();
//    int arr[]={1,1,3,4,5,5,6};
//        for (int x: arr){
//
//            map.put(x, map.getOrDefault(1,0) +1);
//        }
//        System.out.println(map);


// 3. HashMap<Character,Integer>map=new HashMap<>();
//       String str = "raanii";
// for(char ch: str.toCharArray()){
//    map.put(ch,map.getOrDefault(ch,0)+1);
//  }
//      System.out.println(map);


// 4.       int arr[]  ={2,7,11,15};
//       int target=9;
//       for( int i=0;i<arr.length; i++){
//           int diff=target-arr[i];
//           if(map.containsKey(diff)){
//               System.out.println(map.get(diff)+ " "+i);
//               break;
//           }
//           map.put(arr[i],1);
//       }
//        System.out.println(map);
//    }
//}
