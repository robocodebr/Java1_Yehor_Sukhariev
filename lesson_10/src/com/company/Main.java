package com.company;
import java.lang.reflect.Array;
import java.util.*;
public class Main {


    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr = new int[3][3];
        int arr2[][] = {{4, 7, 2}, {3, 9, 2}, {8, 3, 1}};
        method1();
        int[][] arr4 = {{3, 4, 2}, {6, 2, 9}};
        int[][] arr5 = {{6, 2, 9}, {2, 0, 8}};
        int[][] arr6 = Arrays.copyOf(arr4, arr4.length);
        System.out.println(Arrays.deepEquals(arr4, arr5));
        System.out.println(Arrays.deepToString(arr6));
//        for(int i = 0;i<arr.length;i++){
//            System.out.println(Arrays.toString(arr2[i]));
//        }

//        for(int i = 0;i<arr.length;i++){
//            for(int j = 0; j<arr.length;j++){
//                System.out.print(arr2[i][j] + "\t");
//            }
//        System.out.println();
//        }//Перебор массива


//        for(int i = 0;i<arr.length;i++){
//            for(int j = 0; j<arr.length;j++){
//                arr[i][j] = random.nextInt(50);
//            }
//
//        }
//        for(int i = 0;i<arr.length;i++){
//            System.out.println(Arrays.toString(arr[i]));
//        }

//        for(int i = 0;i<arr.length;i++){
//            System.out.println(arr[i][i]);
//        }
//
//        for(int i = 0;i<arr.length;i++){
//            System.out.println(arr[arr.length-1-i][i]);
//        }


    }

    public static void method1() {
        Random random = new Random();
        int[][] arr3 = new int[3][3];

        int sum = 0;

//        for(int i = 0;i<arr3.length;i++){
//            for(int j = 0; j<arr3.length;j++){
//                arr3[i][j] = random.nextInt(50);
//                System.out.print(arr3[i][j] +"\t");
//            }
//System.out.println();
//    }
//        for(int i = 0;i<arr3.length;i++){
//            for(int j = 0; j<arr3.length;j++) {
//                arr3[i][j] = random.nextInt(50);
//            }
//         //   System.out.println(Arrays.toString(arr3[i]));
//        }
//
//        for(int j = 0;j<arr3.length;j++){
//            sum += arr3[arr3.length-1-j][j];
////            System.out.print(arr3[arr3.length-1-j][j]+" ");
//
//        }
//        System.out.println("=" + " "+sum);
//System.out.println(Arrays.deepToString(arr3));//для двухмерный массивов
//}

    }
}