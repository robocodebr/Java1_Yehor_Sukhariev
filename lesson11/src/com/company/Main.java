package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {



//        int max = 0;
//        int min = 9;
//       int arr[][] = new int[10][10];
       Random random = new Random();
//        for(int i = 0; i<arr.length;i++){
//            for(int j = 0;j<arr.length;j++) {
//                arr[i][j] = random.nextInt(10);
//            }
//        }
//        method(arr);
//        for(int i = 0;i<arr.length;i++){
//            for(int j = 0; j<arr.length;j++) {
//               arr[i][j] = random.nextInt(10);
//               if(arr[i][j] < min){
//                   min = arr[i][j];
//               }
//               if(arr[i][j]>max){
//                   max=arr[i][j];
//               }
//            }
//               System.out.println(Arrays.toString(arr[i]));
//
//        }
//
//        System.out.println("min = " + min);
//        System.out.println("max = " + max);

     //   Scanner scanner = new Scanner(System.in);
//        int var = scanner.nextInt();
//        int arr[][] = new int [5][5];
//        for(int i = 0; i<arr.length;i++){
//            for(int j = 0;j<arr.length;j++){
//                arr[i][j] = random.nextInt(10);
//
//            }
//            System.out.println(Arrays.toString(arr[i]));
//        }
//int str = 0;
//        for(int i = 0;i<arr.length;i++){
//            boolean IsGetElement = false;
//            for(int j =0;j<arr.length;j++){
//                if(var == arr[i][j]){
//                    IsGetElement = true;
//                }
//            }
//           if(!IsGetElement){
//               str++;
//
//           }
//        }
//        System.out.println(str);


//        int arr[][] = new int [8][8];
//        for(int i = 0;i<arr.length;i++){
//            for(int j = 0;j<arr.length;j++){
//arr[0][0] = 1;
//arr[7][0] = 1;
//            }
//            System.out.println(Arrays.toString(arr[i]));
//        }




//
//        int arr2[][] = new int [5][5];
//        for(int i = 0; i<arr2.length;i++){
//            for(int j = 0; j<arr2.length;j++){
//                arr2[i][j] = random.nextInt(20)-10;
//            }
//            System.out.println(Arrays.toString(arr2[i]));
//        }


//        int sum = 0;
//        int arr3[][]= new int[5][5];
//        for(int i = 0;i< arr3.length;i++){
//            for(int j = 0;j<arr3.length;j++){
//                arr3[i][j] = random.nextInt(50);
//                System.out.print(arr3[i][j] +"\t");
//
//            }
//            sum += arr3[i][i];
//            System.out.println(Arrays.toString(arr3[i]));
//        }
//       System.out.println(sum);


//        Scanner n = new Scanner(System.in);
//        int uu = n.nextInt();
//        int sum = 0;
//        int arr4[][] = new int [uu][uu];
//       for(int i = 0;i< arr4.length;i++){
//           for(int j = 0;j< arr4.length;j++){
//               arr4[i][j]= random.nextInt(10);
//               if(uu == arr4[i][j]){
//                   sum++;
//               }
//           }
//           System.out.println(Arrays.toString(arr4[i]));
//
//       }
//        System.out.println(sum);

//int sum = 0;
//        int arr5[][] = new int [3][3];
//        for(int i = 0;i< arr5.length;i++){
//            for(int j = 0;j< arr5.length;j++){
//                arr5[i][j]= random.nextInt(10);
//           if(arr5[i][j]%2 == 0){
//               sum+= arr5[i][j];
//           }
//
//            } System.out.println(Arrays.toString(arr5[i]));
//
//        }
//System.out.println(sum);
        int arr[][] = new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
method2(arr);



        }
    public static int [][] method2(int[][]arr){
int [][] arr2 = new int[arr.length][arr[0].length];
for(int i = 0;i<(int)arr.length/2;i++){
    for(int j = 0;j<arr[i].length;j++){
        int temp = arr[i][j];
        arr[i][j] = arr[arr.length-1-i][arr[i].length-1-j];
        arr[arr.length-1-i][arr[i].length-1-j] = temp;

    }
}
for(int i = 0;i<arr.length;i++){
    System.out.println(Arrays.toString(arr[i]));

}
arr2 = Arrays.copyOf(arr,arr.length);
return arr2;
    }

//public static void method(int[][] arr){
//
//            for(int i = 0; i<arr.length;i++){
//
//                System.out.println(Arrays.toString(arr[i]));
//            }
//        }



    }

