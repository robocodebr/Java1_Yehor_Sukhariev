package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();
        map.put("Vasya",10);
        map.put("Nikita",11);
        map.put("Petya",12);
        map.put("Tom",9);
        map.put("Danya",9);
int sum =0;
for(Map.Entry<String,Integer> pair: map.entrySet()){
    String key = pair.getKey();
    int value = pair.getValue();
    sum += value;


}

int average = sum/map.size();
System.out.println(average);

        for(Map.Entry<String,Integer> pair: map.entrySet()){
            String key = pair.getKey();
            int value = pair.getValue();
            if(value>average){
                System.out.println(key);
            }


        }





















        //String max = " ";
//int max2 = 0;
//String maxString= "";
//String str = " ";
//HashMap<String,Integer> map = new HashMap<>();
//ArrayList<String> list = new ArrayList<>();
//String s = "Япо́ния  — островное государство в Восточной Азии. " +
//        "Находится в Тихом океане к востоку от Японского моря, Китая," +
//        " Северной и Южной Кореи, России.";
//
//        for(int i = 0;i<s.length();i++){
//            if(s.charAt(i)== ' '){
//                list.add(str);
//                if(map.containsKey(str)){
//                    map.put(str,map.get(str)+1);
//                }else{
//                    map.put(str,1);
//                }
//                if(map.get(str)>max2){
//                    max2 = map.get(str);
//                    maxString = str;
//                }
//
////                if(str.length()>max.length()){
////                  max = str;
////                }
//
//                str = " ";
//            }else{
//                str +=s.charAt(i);
//            }
//            System.out.println();
//        }
//        System.out.println(max2);
//        System.out.println(maxString);


//        for(int j = 0;j<list.size();j++){
//
//            System.out.println("element "+list.get(j));
//        }
//        System.out.println(max);




    }
}



















