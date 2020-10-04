package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner s =  new Scanner(System.in);
    //  int i = s.nextInt();

//	if(i%2 == 0){
//      System.out.println("odd");
//
//    }else {
//	    System.out.println("even");
//    }
        Random random = new Random();
//int i2 = 0;
//   for(int counter = 1;counter<=i;counter++){
//       i2++;
//       if(i2==7){
//           i2=0;
//       }
//        }
//switch(i2){
//    case 0 :  System.out.println("Mon"); break;
//    case 1 :  System.out.println("Tues"); break;
//    case 2 :  System.out.println("Thur"); break;
//    case 3 :  System.out.println("Wedn"); break;
//    case 4 :  System.out.println("Fri"); break;
//    case 5 :  System.out.println("Sun"); break;
//    case 6 :  System.out.println("Satur"); break;
//   }
//        int j = 0;
//        do{
//            System.out.println(random.nextInt(100));
//            j++;
//        }while(j<10);

//for(int i2 = 0;i2<10;i2++){
//    System.out.println(random.nextInt(100)-50);
//
//}
//        for(int i2 = 0;i2<5;i2++){
//
//         int i3 = s.nextInt();
//         int i4 = s.nextInt();
//         while(i3<=i4) {
//             if(i3%2==1) {
//                 System.out.println(i3);
//
//             }
//             i3++;
//         }

        int sum  = 0;
        int i = s.nextInt();
        int j = s.nextInt();
        while(i<j) {
            sum = sum+i;
            System.out.println(i);
            i++;
        }
        System.out.println("sum "+sum);
        }
        }


