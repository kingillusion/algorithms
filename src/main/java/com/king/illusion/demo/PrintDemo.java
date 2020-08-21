package com.king.illusion.demo;

import java.math.BigDecimal;

public class PrintDemo {


    public static void main(String[] args) {
        int i = 1;
        i = i++;
        int j = ++i;
        int k = i + ++i * i++;
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("k="+k);
        System.out.println("===================");
        BigDecimal a = new BigDecimal("44");
        double b = 44.456;
        double c = 778.809;
        System.out.println(Math.round(29673*0.3));
        System.out.println(new BigDecimal(29673*0.3).setScale(0,BigDecimal.ROUND_HALF_UP));
    }

}
