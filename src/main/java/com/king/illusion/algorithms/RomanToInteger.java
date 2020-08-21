package com.king.illusion.algorithms;

import java.util.HashMap;
import java.util.Map;

/*
leetcode #13 roman to Integer
 */
public class RomanToInteger {

    public int romanToInt(String s){

        int cache = 0;
        int sum = 0;
        int n = 0;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if(c == 'I') {
                n = 1;
            }else if(c == 'V') {
                n = 5;
            }else if(c == 'X') {
                n = 10;
            }else if(c == 'L') {
                n = 50;
            }else if(c == 'C') {
                n = 100;
            }else if(c == 'D') {
                n = 500;
            }else if(c == 'M') {
                n = 1000;
            }

            sum += n;
            if(n > cache) {
                sum -= cache * 2;
            }

            cache = n;
        }
        return sum;
    }
    public int romanToInteger(String s){
        Map<Character,Integer> map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] c=s.toCharArray();
        int result=0;

        for(int i=0;i<c.length;i++) {

            if(i==c.length-1) {
                result+=map.get(c[i]);
            }
            if((i<c.length-1)&&map.get(c[i])>=map.get(c[i+1])) {
                result+=map.get(c[i]);
            }
            if((i<c.length-1)&&map.get(c[i])<map.get(c[i+1])) {
                result+=map.get(c[i+1])-map.get(c[i]);
                i=i+1;
            }


        }
        return result;
    }
    public int roman(String s){
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int num = 0;
        char[] c = s.toCharArray();
        for (int i =0;i<c.length;i++) {
            if(i==c.length-1){//累加最后一位roman数的值
                num+=map.get(c[i]);
            }
            if(i<c.length-1&&(map.get(c[i])>=map.get(c[i+1]))){//非末位数且左边罗马数大于右边
                num+=map.get(c[i]);
            }
            if(i<c.length-1&&(map.get(c[i])<map.get(c[i+1]))){//左边罗马数小于右边
                num+=map.get(c[i+1])-map.get(c[i]);
                i++;//避免末尾罗马值大于前一位罗马值又累加末尾值
            }
        }
        return num;
    }
    public static void main (String[] args){
        RomanToInteger pnum = new RomanToInteger();
        int f = pnum.roman("IMC");
        System.out.println(f);
        String o = "qwer";
        String cu = o.substring(0,1);
        System.out.println(cu);
    }


}
