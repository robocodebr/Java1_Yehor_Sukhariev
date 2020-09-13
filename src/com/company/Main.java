package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
int day = 5;
int month = 12;
int year = 56;
        if(day>month){
   System.out.println(day);
}else if(year<month){
            System.out.println(month);
        }else{
            System.out.println(year);
        }

        String name = "Yehor";
       int n =  name.length();
        String surname = "Sukhariev";
      int s =  surname.length();
        String SN = "Oleksandrovich";
      int sn =   SN.length();
        if(n>s&&n>sn){
            System.out.println(name);
        }else if(s<sn&&s>sn){
            System.out.println(SN);
        } else{
            System.out.println(surname);
       }


        String one = "0123456";
        int FO = one.length();
        String two = "1391215";
        int FT = two.length();
        String three = "749864";
        int FTH = three.length();

               Random random = new Random();
               random.nextInt();
               System.out.println(random.nextInt());

        int i2 = random.nextInt();
        int i3 = random.nextInt();
        int i4 = random.nextInt();

       if(i2>i3&&i2>i4){
        System.out.println(i2);
       }else if(i3>i4&&i3>i2){
           System.out.println(i3);
       }else{
           System.out.println(i4);
       }

             //  && - и
             // || - или
             // == - сравнение
             //   != - не равно
             // !(1==3) = true !(...) Меняет знаки



    }
}
