package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();

//        ArrayList <String>list  = new ArrayList<>();
//        list.add("Hello");
//        System.out.println(list);
//
//        ArrayList<Integer>list2 = new ArrayList<>();
//        for(int i = 0;i<n;i++){
//            list2.add(random.nextInt(10));
//
//        }
//        if(list2.contains(5)){
//            System.out.println(list2.indexOf(5));
//        }
// list2.set(list2.size()-1,100);
//        list2.remove(0);
//        list2.clear();
//        System.out.println(list2);

//ArrayList<String>colors = new ArrayList<>();
//colors.add("Black");
//        colors.add("Red");
//        colors.add("White");
//colors.set(2,"Green");
//for(int i = 0;i<colors.size();i++){
//    System.out.println(colors.get(i));
//}


//ArrayList<String>people = new ArrayList<>();
//people.add("Tom");
//        people.add("Kate");
//        people.add("Max");
//if(people.contains("Max")){
//    System.out.println("List contains Max");
//int index_Max = people.indexOf("Max");
//people.remove(index_Max);
//}
//System.out.println(people);

        ArrayList<String>list3 = new ArrayList<>();
        for(int i = 0;i<s;i++){
           list3.add(scanner.next());

        }
        method(list3);
        method2(list3);



//        String s2 = scanner.next();
//        if(list3.contains(s2)){
//          list3.remove(list3.indexOf(s2));
//        }
//        System.out.println(list3);


    }


    public static void method(ArrayList<String> list3){

  Collections.sort(list3);
       System.out.println(list3);


}


    public static void method2(ArrayList<String>list3){
Collections.sort(list3,Collections.reverseOrder());
System.out.println(list3);
    }

}
