
package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        boolean bool = scanner.hasNextLine();
//        System.out.println(bool);
//        boolean bool2 = scanner.hasNextInt();
//        System.out.println(bool2);
        Random random = new Random();
//          System.out.println(random.nextInt(65)-55);
//        float f = scanner.nextFloat();
    //    Random random2 = new Random();
//        System.out.println(f/100);
//        boolean bool3 = random.nextBoolean();
//        System.out.println(bool3);
//        double doub = random.nextDouble();
//        System.out.println(doub);
   //    int i  = -20;
//        while(i<20){
//          System.out.println(random.nextInt(100));
//            i++;
//
//        }
//        int j = 100;
//        do{
//            System.out.println(random.nextInt(100)+100);
//            j++;
//        }while(j<200);

//        for(int i = 0;i<70;i+=7){
//            System.out.println(i);
//        }
//        int n = scanner.nextInt();
//        int i = 0;
//        while(i<n){
//            System.out.println(random.nextInt(10)-10);
//            i++;
//        }
//        int n = scanner.nextInt();
//        for(int i =0;i<n;i++){
//            System.out.println(random.nextInt(20)-10);
//        }
      int n = scanner.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.println(i+"*"+n+"="+ i*n);
        }
        String s = "";
        System.out.println(s);

        for(int i = 1;i<=10;i++){
            System.out.println(n+"/"+i+"="+n/i);
        }
        String s2 = "";
        System.out.println(s2);
        for(int i = 0;i<=10;i++){
           System.out.println(i+"+"+n+"="+(n+i));
       }
        String s3 = "";
        System.out.println(s3);
        for(int i = 0;i<=10;i++){
            System.out.println(i+"-"+n+"="+(n-i));
        }
    }
}
