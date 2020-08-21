package com.king.illusion.algorithms;
/*
leetcode #14 Longest Common Prefix
 */
/*
indexOf()返回出现的第一个的索引否则返回-1
subString 复习
charAt()返回指定索引处的字符
入参校验顺序
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs){
        if(strs == null ||strs.length==0){
            return "";
        }
        String prefix = strs[0];
        for(int i = 0;i<strs.length;i++){
            char c = prefix.charAt(i);//返回指定索引处的字符
            for(int j = 1;j<strs.length;j++){
                if( i == strs[j].length() || strs[j].charAt(i) != c){
                    return prefix.substring(0,i);
                }
                /*if(strs[j].charAt(i) != c || i == strs[j].length()){
                    return prefix.substring(0,i);
                }*/
            }

        }
       return prefix;
    }
    public String prefix(String[] s){

        if(s.length == 0){
            return "";
        }
        String pre = s[0];
        for(int i = 1;i<s.length;i++){
            while(s[i].indexOf(pre)!=0){
                pre = pre.substring(0,pre.length()-1);
            }
            if(pre.isEmpty()){
                return "";
            }
        }
        return pre;

    }
    public String pre(String[] s){

        if(s.length==0){
            return "";
        }
        String pre = s[0];
        if(pre.isEmpty()){
            return "";
        }
        for(int i = 1;i<s.length;i++){
            while(s[i].indexOf(pre)!=0){
                pre = pre.substring(0,pre.length()-1);
            }
        }
        return pre;
    }





    public static void main(String[] srgs){
        LongestCommonPrefix l = new LongestCommonPrefix();
        String[] a = {"123","12","12"};
        String pre = l.prefix(a);
        System.out.println(pre);
    }
}
