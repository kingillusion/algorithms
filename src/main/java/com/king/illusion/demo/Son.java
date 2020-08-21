package com.king.illusion.demo;

public class Son extends Father {
    Father father = new Father();

    public Son (){
        super(1);
        System.out.println("Son Construtor");
    }

    public void Father(){
        System.out.println("Inherited Father member function.");
        super.Father();
    }


    public static void main(String[] args) {
        Father son = new Son();
        son.Father();

    }
}
