package review;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample {
    public static void main(String[] args){

      //  --------------------------------Method 1-----------------------------------
        //    System.out.println("How many Students want to add: ");
//        Scanner sc = new Scanner(System.in);        //taking input from the user
//        int n = sc.nextInt();
//        sc.nextLine();
//
//        Map<Integer,String> map = new HashMap<>();
//
//        for(Map.Entry<Integer,String> entry : map.entrySet())
//
//        for(int i = 0 ; i< n;i++){
//            System.out.println("Enter the Roll: ");
//            int roll = sc.nextInt();
//            sc.nextLine();
//
//
//            System.out.println("Enter the Name: ");
//
//            String name = sc.nextLine();
//
//            map.put(roll,name);
//        }
//        System.out.println("Students Details");
//        System.out.println(map);
//        }


        //     ---------------------------Method 2--------------------------------------

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Saket");
        map.put(2,"Abhishek");
        map.put(3,"Aditya");
        map.put(4,"Piyush");

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("SNo. "+ entry.getKey() + " Name: "+ entry.getValue());
        }
    }
}
