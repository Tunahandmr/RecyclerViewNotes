package com.tunahan.carsbooksingleton;

public class Singleton {

    private cars sentCars;
    private static Singleton singleton;
    private Singleton(){

    }

    public cars getSentCars(){

        return sentCars;
    }

    public void setSentCars(cars sentCars){
        this.sentCars=sentCars;
    }

    public static Singleton getInstance(){
        if(singleton==null){
            singleton= new Singleton();
        }
        return singleton;
    }
}
