package com.king.illusion.algorithms;
/*
     leetcode 263 丑数
     丑数就是只包含质因数 2, 3, 5 的正整数。
     1也是丑数。
     输入不会超过 32 位有符号整数的范围: [−2^31,  2^31 − 1]。
 */
public class IsUgly {
    public boolean isUgly(int num) {
        if (num == 0){
            return false;
        }
        while (num != 1){
            if (num % 2 == 0){
                num /= 2;
                continue;
            }
            if (num % 3 == 0){
                num /= 3;
                continue;
            }
            if (num % 5 == 0){
                num /= 5;
                continue;
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        IsUgly i = new IsUgly();
        System.out.println(i.isUgly(60));
    }
}
