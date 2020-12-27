package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Student s = new Student("Ivan Ivanov",10,4);//Об'ект класса
//s.name = "Ivan Ivanov";
//System.out.println(s.name);
//s.age = 10;
//s.CurrentClass = 4;
s.info();

Student s2 = new Student("Masha Mashena",12,6);
//s2.name = "Masha Mashena";
//System.out.println(s2.name);
//s2.age = 12;
//s2.CurrentClass = 6;
s2.info();

Student s3 = new Student("Vasya Vasyliev",14);
s3.info();


Car c = new Car("Audi",2000,200,2);
System.out.println(c.mark);
System.out.println(c.date);
System.out.println(c.max);
System.out.println(c.weight);
c.Drive();
c.Refuel();
c.Stay();
System.out.println("   ");

        Car c1 = new Car("BMW",2002,180,2);
        System.out.println(c1.mark);
        System.out.println(c1.date);
        System.out.println(c1.max);
        System.out.println(c1.weight);
        c1.Drive();
        c1.Refuel();
        c1.Stay();

        System.out.println("    ");

        Calculator calc = new Calculator();
        calc.divide(4,2);
        calc.minus(10,5);
        calc.plus(12,7);
        calc.multiply(6,3);


        System.out.println("    ");
        figure f = new figure();
        f.plo(5);
        f.per(4);



    }


















}
