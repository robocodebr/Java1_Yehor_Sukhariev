package com.company;

public class Car {

    public String mark;
    public int date;
    public int max;
    public int weight;
public void Drive(){
    System.out.println("Drive");
}
public void Stay(){
    System.out.println("Stay");
}
public void Refuel(){
    System.out.println("Refuel");
}
public Car(String mark,int date,int max,int weight){
    this.mark = mark;
    this.date = date;
    this.max = max;
    this.weight = weight;
}
}
