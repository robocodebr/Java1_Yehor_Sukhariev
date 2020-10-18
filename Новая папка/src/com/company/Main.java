package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
//func("func");
//String s = "text";
//func(s);
//println("text","text");

//str();
//Scanner scanner =  new Scanner(System.in);
//int int1 =  scanner.nextInt();
//        int int2 =  scanner.nextInt();
//        int int3 =  scanner.nextInt();
//
//System.out.println(scan(int1,int2,int3));
        Scanner scanner =  new Scanner(System.in);
        int int1= scanner.nextInt();
        int int2 = scanner.nextInt();
        String s = scanner.next();

        if(s.equals("+")){
            System.out.println(sum(int1,int2));
        }else if(s.equals("-")){
            System.out.println( sub(int1,int2));
        }else if(s.equals("/")){
            System.out.println(  div(int1,int2));
        }else if(s.equals("*")){
            System.out.println( ymn(int1,int2));
        }

        //System.out.println(s);

    }
//    public static void func(String name){
//        System.out.println("Hello" + name);
//
//    }

//public static void println(String arg1,String arg2){
// System.out.println("arg1 = " + arg1);
//    System.out.println("arg2 = " + arg2);
//}

public static int sum(int x,int y){

 return x+y;
}
//public static String str(){
//        return "boirenbownblmw";
//}

//    public static int scan(int int1,int int2,int int3){
//return int1*int2*int3;
//    }
public static  int sub(int x,int y){

    return x-y;
}
public  static  int div(int x,int y){

        return x/y;
}
public  static int ymn(int x,int y){

        return x*y;
}
}
