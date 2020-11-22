package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here

//        String s1 = "literal";
//        String s2 = new String("literal");
//        if(s1 == s2)
//            System.out.println("s1 == s2");
//        if(s1.equals(s2))
//            System.out.println("s1.equals(s2)");

//String s1 = "abcd";
//for(int i = 0;i< s1.length();i++){
//    System.out.println(s1.charAt(i));
//}

//                String str = "ПРИВЕТ КАК ДЕЛА?";
//
//        for(int i = 0;i<str.length();i++){
//            if(str.charAt(i) == '?'){
//                System.out.println("Это - вопрос");
//            }
//            else if(str.charAt(i) == '!'){
//                System.out.println("Это - восклицательное  предложение");
//
//            }else if(str.charAt(i) == '.'){
//                System.out.println("Это - повествовательное предложение");
//
//            }
//
//        }
//String s1= "text";
//
//        System.out.println(str.replace("Привет как дела?","Как сам?"));
//        System.out.println(str.toLowerCase());
//        System.out.println(s1.substring(0,2));
//        System.out.println(s1.substring(2,4));
//        System.out.println(s1.indexOf('t'));


//        String oldString = "Java";
//        String newString = oldString.replace('a','i');
//        System.out.println("Old String:" + oldString);
//        System.out.println("New String:" + newString);
//
//
//        String str = "Обожаю язык программирования Java";
//        System.out.println("  substring from 27 to end "+str.substring(27));
//        System.out.println(" substring from 0 to 8 " + str.substring(0,8));
//        System.out.println("substring from 27 to 31 "+str.substring(27,31));


//        String hello = "Hello";
//         int index1 = hello.indexOf('H');
//         int index2 = hello.indexOf('o');
//         int index3 = hello.indexOf('w');
//
//         System.out.println("Мы ищем букву 'H' в строке"+hello+".");
//         System.out.println("Индекс этой буквы : "+index1);
//        System.out.println("Мы ищем букву 'o' в строке"+hello+".");
//        System.out.println("Индекс этой буквы : "+index2);
//        System.out.println("Мы ищем букву 'w' в строке"+hello+".");
//        System.out.println("Индекс этой буквы : "+index3);


        Scanner scanner =new Scanner(System.in);
        String s = scanner.nextLine();
        String s2 = scanner.nextLine();
int count = 0;
        for(int i = 0;i<s.length();i++){
             for(int j = 0;j<s2.length();j++) {
            if((s.charAt(i)+"").equals(s2.charAt(j)+"")) {
              count+=1;
            }

             }

            }
        System.out.println(count);

        }










    }

