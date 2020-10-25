package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        int [] arr = new int[] {1,5,15,10,11,30,31,33};
//        int temp = arr[2];
//        arr[2] = arr[3];
//        arr[3] = temp;
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);

            //    int [] arr = new int[] {1,5,15,10,11,30,31,33};
                //int temp = arr[2];
//        for(int i = 1;i<arr.length;i++){
//            for(int j = 0;j<arr.length-i;j++){
//             if(arr[j]>arr[j+1]){
//                 int  t = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = t;
//             }
//
//            }
//
//        }
 //       Arrays.sort(arr );
  //      System.out.println(Arrays.toString(arr));

//        Random random = new Random();
//        int [] arr2 = new int[10];
//        for(int i = 0;i<10;i++){
//           arr2[i]= random.nextInt(10);
//        }
//        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr2));

//        int []arr1  ={1,2,3,4};
//        int [] arr2 = Arrays.copyOf(arr1,3);
//        System.out.println(Arrays.toString(arr2));

//        Scanner scanner = new Scanner(System.in);
//String [] arr = new String[5];
//for(int i = 0;i<5;i++){
//   arr[i] =  scanner.nextLine();
//}
//String [] arr2 = Arrays.copyOf(arr,5);
//
//System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr2);
//System.out.println(Arrays.toString(arr2));


//   int [] arr = {1,5,25,18,12,75,50,86,9,10};
//   Scanner scanner = new Scanner(System.in);
//       int j = scanner.nextInt();
//   for (int i = 0;i<arr.length;i++) {
//      if(arr[i]== j){
//          arr[i] = 0;
//
//      }
//   }
//   Arrays.sort(arr);
//   System.out.println(Arrays.toString(arr));

//int min = -100;
//int max = 100;
//int step = 5;
//
//for(int i = min;i<=max;i+=step){
//  System.out.println(i);
//}

int [] arr = {1,-5,10,15,30,-8,-67,-10,11,12};
int sum = 0;
for(int i = 0;i< arr.length;i++){
    if(arr[i] %2 == 0){
        sum= sum+arr[i];
    }

}

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(sum);



    }
}
