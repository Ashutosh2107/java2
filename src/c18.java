//1.
//Exception Handling
//public class c18 {
//    public static void main(String[] args) {
//       System.out.println("Hello World");
//        //Integer.
//        try {
//            int a = 10;
//            int b = 0;
//            int c = a / b;
//            System.out.println(c);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        System.out.println("Bye!");
//        int a = 5;
//        int b = 2;
//        int c = a / b; //get error.
//        System.out.println(c);
//        System.out.println("Bye!");
//    }
//}
   //Array.
//        try {
//            int arr[] = {1, 2, 3, 4};
//            System.out.println(arr[4]);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        System.out.println("Bye World");
//    }
//}
   //String.
//        try{
//            String str=null;
//            System.out.println(str.length());
//        }catch(Exception e){
//            System.out.println(e);
//        }
//        System.out.println("Bye! World");
//    }
//}


//2.

//import java.util.Scanner;
    //1.
//public class c18 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("=== Exception Handling with User Input ===");
//        // 1. Arithmetic Exception (Division)
//        try {
//            System.out.print("Enter number a: ");
//            int a = sc.nextInt();
//
//            System.out.print("Enter number b: ");
//            int b = sc.nextInt();
//
//            int c = a / b;   // may cause divide by zero
//            System.out.println("Result = " + c);
//
//        } catch (Exception e) {
//            System.out.println("Arithmetic Error: " + e);
//        }
//    }
//}


        // 2. Array Index Exception
//        try {
//            int arr[] = {10, 20, 30, 40};
//
//            System.out.print("Enter array index (0-3): ");
//            int index = sc.nextInt();
//
//            System.out.println("Value = " + arr[index]);
//
//        } catch (Exception e) {
//            System.out.println("Array Error: " + e);
//        }
//    }
//}


//        // 3. Null Pointer Exception
//        try {
//            String str = null;
//
//            System.out.print("Enter 1 to use null string: ");
//            int ch = sc.nextInt();
//
//            if (ch == 1) {
//                System.out.println(str.length()); // NullPointerException
//            } else {
//                str = "Harsh";
//                System.out.println("String length: " + str.length());
//            }
//
//        } catch (Exception e) {
//            System.out.println("String Error: " + e);
//        }
//
//        System.out.println("=== Program Finished ===");
//    }
//}


//3.
//Voter code.
//import java.util.*;
//
//public class c18 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        try {
//            System.out.print("Enter your age: ");
//            int age = sc.nextInt();
//
//            if (age >= 18)
//                System.out.println("Eligible to vote.");
//            else
//                System.out.println("Not eligible to vote.");
//
//        } catch (Exception e) {
//            System.out.println("Please enter a valid age!");
//        }
//    }
//}

//4.
//cal sum of 3 number in pairs.
//import java.util.Scanner;
//
//public class c18 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter size of array: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        System.out.println("Enter " + n + " elements:"); // fixed this line
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        boolean flag = false;
//        System.out.println("Triplets with sum = 3:");
//        for (int i = 0; i < n - 2; i++) {
//            for (int j = i + 1; j < n - 1; j++) {
//                for (int k = j + 1; k < n; k++) {
//                    if (arr[i] + arr[j] + arr[k] == 3) {
//                        System.out.println("(" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")");
//                        flag = true;
//                    }
//                }
//            }
//        }
//        if (!flag) {
//            System.out.println("No triplets found with sum = 3");
//        }
//    }
//}

//5.
// thrown exception
//public class c18{
//    public static void main(String[] args) {
//     System.out.println("program start");
//        try {
//            throw new Exception("Manually thrown exception!");
//        } catch (Exception e) {
//            System.out.println("Caught: " + e);
//        }
//
//        System.out.println("Program continues...");
//    }
//}
