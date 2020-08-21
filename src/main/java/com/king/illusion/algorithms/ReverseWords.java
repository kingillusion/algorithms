package com.king.illusion.algorithms;

import java.util.Arrays;

public class ReverseWords {
    public static String reverseWords(String s) {
        char[] strs = s.toCharArray();
        StringBuffer str = new StringBuffer();
        int len = strs.length;
        reverse(strs,0,len-1);
        word_reverse(strs,len);

        return clean_space(strs,len);
    }
    //轴对称调换数组下标 for循环
    private static void reverse(char[] char_,int min,int max){
        for( int i = min,j = max;i < j;i++,j--){
            if(i < j){
                char temp = char_[i];
                char_[i] = char_[j];
                char_[j] = temp;
            }
        }
    }
    //轴对称调换数组下标 while循环
    /*private static void reverse(char[] s_arr, int i, int j) {
        while (i < j) {
            char t = s_arr[i];
            s_arr[i++] = s_arr[j];
            s_arr[j--] = t;
        }
    }*/

    private static void word_reverse(char[] s_arr, int len) {
        int i = 0;
        int j = 0;
        while (j < len) {
            // 找到第一个首字母
            while (i < len && s_arr[i] == ' ')
                i++;
            j = i;
            // 末位置
            while (j < len && s_arr[j] != ' ')
                j++;
            reverse(s_arr, i, j - 1);
            i = j;
        }
    }

    private static String clean_space(char[] s_arr, int len) {
        int i = 0;
        int j = 0;
        while (j < len) {
            while (j < len && s_arr[j] == ' ')
                j++;

            while (j < len && s_arr[j] != ' ')
                s_arr[i++] = s_arr[j++];

            while (j < len && s_arr[j] == ' ')
                j++;

            if (j < len)
                s_arr[i++] = ' ';
        }
       // System.out.println(Arrays.toString(s_arr));
        return new String(s_arr).substring(0, i);
    }

    public static void main(String[] args) {
        String ss = " hel  wo  ";
        //ss.trim();
        String s = reverseWords(ss);
        System.out.println(s);
    }
}
