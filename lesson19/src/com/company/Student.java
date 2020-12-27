package com.company;

public class Student {
    public String name;
public int age;
public static String school;//Поле
public int CurrentClass;
    public Student(String n,int a,int CC){
     System.out.println("This is my class");
this.name = n;
this.age = a;
this.CurrentClass = CC;
    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
        this.CurrentClass = age-5;
    }
public void info(){
    System.out.println("name =" + this.name + "age" + this.age + "CurrentClass" + this.CurrentClass);//Метод


}
}



