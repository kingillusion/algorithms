package com.king.illusion.algorithms;
/*
 #7 整数反转 考虑整数范围  [-2^31,2^31-1]
 */
public class Reverse {
    public int reverse(int x) {
        int result = 0;

        while(x!=0){

            int next = x % 10;

            if(result>Integer.MAX_VALUE/10||(result>Integer.MAX_VALUE/10&&next>7)){
                return 0;
            }
            if(result<Integer.MIN_VALUE/10||(result<Integer.MIN_VALUE/10&&next<-8)){
                return 0;
            }
            result = result*10 + next;//   -2^31 < (result*10 + next) < 2^31-1
            x /=10;
        }
        return result;
    }

    public static void main(String[] args) {
       // System.out.println(Integer.MAX_VALUE+"..."+Integer.MIN_VALUE);
        Reverse r = new Reverse();
        System.out.println(r.reverse(-731894798));
    }
}
