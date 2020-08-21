package com.king.illusion.algorithms;

public class TitleToNumber {
    public int titleToNumber(String s){
        char[] c = s.toCharArray();
        int result = 0;
        for(int i = 0;i<c.length;i++){
            /*
              eg: AB = 28 = 26*1 + 2
              28 = (result + c[0])*26 + (c[1] - 'A' + 1)
              int num = s.charAt(i) - 'A' + 1;
              ans = ans * 26 + num;
             */
            int num = c[i] - 'A' + 1;
            result = result * 26 + num;

        }
        return result;
    }

    public static void main(String[] args) {
        TitleToNumber t = new TitleToNumber();
        int a = t.titleToNumber("AB");
        System.out.println(a);
    }
}
