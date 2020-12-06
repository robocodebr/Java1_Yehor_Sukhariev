package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("orange",10);
        hashMap.put("apple",10);
        hashMap.put("Grapes",10);
        hashMap.put("Banana",10);
        System.out.println(hashMap);

        int i = 0;
        while(i<10){
            i++;

            String str = scanner.next();
            int Int = scanner.nextInt();
            hashMap.put(str, Int);
        }

System.out.println(hashMap);


//        hashMap.put(1111,"Фам.1");
//        hashMap.put(1234,"Фам.2");
//System.out.println(hashMap);
//hashMap.put(1111,"Фам.3");
//System.out.println(hashMap);


//for(int i = 0;i<10;i++){
//    hashMap.put(i,scanner.nextLine());
//
//}
//    System.out.println(hashMap);



//        for(int i = 0;i<str.length();i++){
//            char currentElement = str.charAt(i);
//           if(hashMap.containsKey(currentElement)){
//               hashMap.put(currentElement,hashMap.get(currentElement)+1);
//
//           }
//           else{
//               hashMap.put(currentElement,1);
//           }
//
//
//        }
//        char maxChar = ' ';
//        int max = 0;
//        for(HashMap.Entry<Character,Integer>element:hashMap.entrySet()){
//            System.out.println(element.getKey());
//            System.out.println(element.getValue());
//        if(element.getValue()>max){
//            max = element.getValue();
//            maxChar = element.getKey();
//        }
//        }
//        System.out.println(hashMap);
//        System.out.println(max);
//        System.out.println(maxChar);






    }
}
