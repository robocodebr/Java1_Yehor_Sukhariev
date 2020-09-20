package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        String surname = scanner.nextLine();
//        String surname2 =scanner.nextLine();
//        System.out.println(name + " " + surname + " " + surname2);

//        String aa = scanner.nextLine();
//        System.out.println(aa+ aa + aa);

//        int i = scanner.nextInt();
//        int j = scanner.nextInt();
//
//        System.out.println( i + j);
//        System.out.println(i - j);
//        System.out.println(i * j);
//        System.out.println(i / j);


        String s = scanner.nextLine();
        s.charAt(2);
        int i = Integer.parseInt(""+s.charAt(0)+ ""+s.charAt(1));
        int j = Integer.parseInt(""+ s.charAt(3)+ ""+s.charAt(4));
        if("+".equals(""+s.charAt(2))){
         System.out.println(i+j);
        }else if("-".equals(""+s.charAt(2))){
            System.out.println(i-j);
        }else if("*".equals(""+s.charAt(2))){
            System.out.println(i*j);
        }else if("/".equals(""+ s.charAt(2))){
            System.out.println(i/j);
        }

       // System.out.println(s.equals("text"));

    }
}
