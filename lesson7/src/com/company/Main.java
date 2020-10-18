package com.company;
import java.util.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//int [] arr;
//arr = new int [10];
  //String [] cars = {"name of car","name of car","NOC"}
  //int [] myNum = {10,20,30,40};
  //for(int i = 0;i<10;i++){
  //arr[i] = 1;
  //}

     String [] cars = {"Volvo","BMW","Ford","Mazda"};
//     for(int i = 0;i<4;i++){
//         System.out.println(cars[i]);
//
//     }
        int [] myNum = {10,20,30,40};
//        for(int i = 0;i<4;i++){
//            System.out.println(myNum[i]);
//        }
//       System.out.println(cars[0]);
//        System.out.println(myNum.length);
//
//        myNum[0] = 20;
//        System.out.println(myNum.length);

//        int[]arr = new int[10];
//        for(int i = 0;i<arr.length;i++){
//            arr[i] = 1;
//        }
//        System.out.println(Arrays.toString(arr));


//        Random random = new Random();
//        int []arr = new int[10];
//        int sum = 0;
//        for(int i = 0;i<arr.length;i++){
//            arr[i] =random.nextInt(10);
//            System.out.println(arr[i]);
//            sum += arr[i];
//        }
//
//        System.out.println(sum);

//        Scanner s =  new Scanner(System.in);
//        int []arr = new int[s.nextInt()];
//        for(int i =0;i<arr.length;i++){
//            arr[i] = s.nextInt();
//
//        }
//        System.out.println(Arrays.toString(arr));

//        Random random = new Random();
//      int []arr = new int[10];
//      for(int i = 0;i<arr.length;i++){
//          arr[i] = random.nextInt(20)-10;
//          System.out.println("arr["+i+"]="+arr[i]);
//      }

//        int [][] arr2 = new int[5][4];
//        arr2[0][0]= 5;
//
//
//        for(int i = 0;i<5;i++){
//            for(int j = 0;j<4;j++){
//                arr2[i][j]=i*j;
//            }
//            System.out.println(Arrays.toString(arr2[i]));
//        }


//        Scanner s =new Scanner(System.in);
//        Random random = new Random();
//
//        int n = s.nextInt();
//        int m = s.nextInt();
//        int [][] arr2 = new int[m][n];
//int x = 7;
//
//        boolean bool = false;
//        for(int i = 0;i<m;i++){
//            for(int j = 0;j<n;j++){
//                arr2[i][j]= random.nextInt(10);
//                if(arr2[i][j]==x){
//                    System.out.println(i+" "+j);
//                    bool = true;
//                }
//            }
//            System.out.println(Arrays.toString(arr2[i]));
//        }
//
//        if(!bool) {
//            System.out.println("Not Found");
//
//
//        }

        float [] arr ={1,5,30,7,5,20,12,96};
        float x = arr[0];
        for(int i = 2;i<arr.length;i+=2){
            if(arr[i]>x){
                x=arr[i];
            }

        }
        System.out.println(x);
    }
}
