package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
Random random = new Random();

//ArrayList<String>List = new ArrayList<>();
//List.add("Hello");
//List.add(0,"Hello2");
//List.clear();
//List.add("Hallo");
//List.add("Hallo2");
//        if(List.contains("Hallo")){
//            System.out.println("True");
//        }
//
//System.out.println(List);
//System.out.println(List.size());


ArrayList<String> list = new ArrayList<>();
list.add("Vanya");
list.add("Nikita");
list.add("Vasya");
String str = list.get(random.nextInt(list.size()));

System.out.println(list.indexOf(str));
System.out.println(str);

System.out.println(System.currentTimeMillis());
System.out.println(true&&false);

    }
}
