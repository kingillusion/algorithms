package com.king.illusion.demo;

public class Singleton {
    Singleton(){}
    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
