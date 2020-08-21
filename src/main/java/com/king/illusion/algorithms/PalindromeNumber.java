package com.king.illusion.algorithms;
/*
 leetcode #9 palindrome number
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        //所有负数或者取模为0（除0外）都返回false,
        if(x<0 || (x%10==0&&x!=0)){
            return false;
        }
        int renum = 0;
        while(x>renum){
            renum = x%10 + renum*10;
            x = x/10;
        }
        //x位数为奇数时候  最中间数字舍弃
        return x == renum || x==renum/10;
    }
    public static void main (String[] args){
        /*PalindromeNumber pnum = new PalindromeNumber();
        boolean f = pnum.isPalindrome(78487);
        System.out.println(f);*/
        System.out.println(975%10);
    }
}
