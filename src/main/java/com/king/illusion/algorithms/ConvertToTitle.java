package com.king.illusion.algorithms;
// leetcode
// 168. Excel表列名称
public class ConvertToTitle {

    public String convertToTitle(int n){
        if(n <= 0){
            return "";
        }
        StringBuffer sb = new StringBuffer();
        while (n > 0) {
            int c = n % 26;
            sb.append((char) ('A' + c - 1));
            n /= 26;
        }
        return sb.reverse().toString();

    }
/*
            n--;
            sb.append((char) (n % 26 + 'A'));
            n =n / 26;
 */
    public static void main(String[] args) {
        ConvertToTitle c = new ConvertToTitle();
        String s = c.convertToTitle(899);
        System.out.println(s);
    }
}
