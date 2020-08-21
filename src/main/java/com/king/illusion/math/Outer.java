package com.king.illusion.math;

public class Outer {

    public void demo(){
        System.out.println("外部方法");
    }
    class Inner{
        public Inner innerDemo(){
            System.out.println("内部方法");
            return new Inner();
        }
    }
    public Inner inner(){
        return new Inner();
    }
    public static void main(String[] args) {
        /*Outer out  = new Outer();
        Outer.Inner c = out.inner();*/
        String s = "abc";
        String s1 = "a"+"b"+"c";
        String s2 = "ab";
        String s3 = new String("c");
        String s4 = s2+s3;
        System.out.println(s==s1);
        System.out.println(s1==s4);
        System.out.println(s1.equals(s4));
    }

}
