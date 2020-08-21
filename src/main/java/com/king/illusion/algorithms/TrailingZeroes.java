package com.king.illusion.algorithms;
// leetcode 172. 阶乘后的零
// 算术
public class TrailingZeroes {

    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            count += n / 5;
            n = n / 5;
        }
        return count;
    }

    public static void main(String[] args) {
        TrailingZeroes t = new TrailingZeroes();
        System.out.println(t.trailingZeroes(125));
    }

}
