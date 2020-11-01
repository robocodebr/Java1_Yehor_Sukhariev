package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//String s = scanner.nextLine();
//if(s.equals("+")){
//    plus(58,12);
//}else if(s.equals("-")){
//    minus(17,9);
//}else if(s.equals("*")){
//    multuplication(5,20);
//}else if(s.equals("/")){
//    division(18,9);


// int arr[];
// arr = new int [10];
//for(int i = 0;i< arr.length;i++){
//arr[i] = scanner.nextInt();
//
//}
//        System.out.println(Arrays.toString(arr));


// int arr[];
// arr = new int[10];
// for(int i = 0;i<arr.length;i++){
//     arr[i] = scanner.nextInt();
// }
// for(int j = 0;j<arr.length;j++){
//     if(arr[j]%2 == 0 ){
//   System.out.println(arr[j]);
//     }
//
// }


//        String arr[];
//        arr = new String[10];
//        for(int i = 0;i< arr.length;i++){
//            arr[i] = scanner.nextLine();
//        }
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        Random random = new Random();
//        int arr[];
//        arr = new int[10];
//        for(int i = 0; i< arr.length;i++){
//            arr[i] = random.nextInt(100)-50;
//
//        }
//        System.out.println(Arrays.toString(arr));

//        int arr[];
//       arr = new int[10];
//       for(int i = 0; i< arr.length;i++){
//            arr[i] = random.nextInt(40)-20;
//
//       }
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));



//        int arr[];
//        arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(40) - 20;
//
//        }
//
//        int temp = arr[2];
//        for (int i = 1; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - i; j++) {
//                if (arr[j] < arr[j + 1]) {
//                    int t = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = t;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));


//                int [] arr = new int[] {1,5,2,6,7,10,3,8,9};
//                int [] arr2 = new int [] {6,2,7,9,2,10,5,2,1,3};
//  for(int i = 0; i<(int)arr.length/2;i++){
//      int temp = arr[i];
//      arr[i] = arr[arr.length-1-i];
//      arr[arr.length-1-i] =temp;
//
//        }
//        for(int i = 0; i<arr.length;i++) {
//            int temp = arr2[i];
//            arr2 [i] = arr[i];
//            arr [i] = temp;
//        }
//
//  System.out.println(Arrays.toString(arr));
//System.out.println(Arrays.toString(arr2));


int arr[] ;
arr= new int[scanner.nextInt()];
for(int i = 0; i<arr.length;i++){
    arr[i] = random.nextInt(30);
}
 // System.out.println(Arrays.toString(arr));

        int key = scanner.nextInt();
        int count  = 0;
for(int j = 0; j<arr.length;j++){
if(arr[j] == key){
    count++;
}

}
        int[] arr2 = new int[arr.length-count];
int j = 0;
for(int i =0; i<arr.length;i++){
    if(arr[j] != key){
        arr2[j] = arr[i];
        j++;
    }
}
System.out.println(Arrays.toString(arr));
System.out.println(Arrays.toString(arr2));













    }
}








//
//    }
//    public static void plus(int a,int b){
//    System.out.println(a + b);
//    }
//
//    public static void minus(int a,int b){
//        System.out.println(a - b);
//    }
//    public static void multuplication(int a,int b){
//        System.out.println(a * b);
//    }
//    public static void division(int a,int b){
//        System.out.println(a / b);
//    }



