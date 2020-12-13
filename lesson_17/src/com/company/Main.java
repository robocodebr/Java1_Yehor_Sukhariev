package com.company;
import java.net.Inet4Address;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String str = " ";

ArrayList<String> list = new ArrayList<>();
    String s = "По  — найбільша річка Італії у її північній частині. " +
            "Довжина 652 км, сточище 75 тисяч км², " +
            "середня витрата води в гирлі 1 460 м³/сек. ";
for(int i = 0;i<s.length();i++){
    if(s.charAt(i)== ' '){
        list.add(str);
        str = " ";
    }else{
        str +=s.charAt(i);
    }
    System.out.println();
}
String smax = list.get(0);

for(int j = 0;j<list.size();j++){
if(smax.length()<list.get(j).length()){
    smax = list.get(j);
}
   System.out.println("elem "+list.get(j));
}
System.out.println(smax);

        //        String str = scanner.nextLine();
//        String str2 = scanner.nextLine();
//        char c = str.charAt(0);
//        int j = 0;
//
//        for(int i = 0;i<str.length();i++){
//if(str.charAt(i) == c){
//    j++;
//}
//
//
//        }
//        System.out.println(j);



//HashMap<Integer,String> hashMap2 = new HashMap<>();
//        HashMap<Integer,String> hashMap = new HashMap<>();
//        hashMap.put(1111,"Fam 1");
//        hashMap.put(1234,"Fam 2");
//        hashMap.remove(1111);
//        hashMap.clear();
//        hashMap2.put(1112,"Fam 1");
//        hashMap2.put(1113,"Fam 2");
//        hashMap2.put(1114,"Fam 3");
//        hashMap.putAll(hashMap2);
//
//        System.out.println(hashMap.get(1111));
//System.out.println(hashMap.size());
//System.out.println(hashMap.containsKey(1111));
//System.out.println(hashMap.containsValue(1234));
//System.out.println(hashMap.isEmpty());
//System.out.println(hashMap.size());





    }
}
