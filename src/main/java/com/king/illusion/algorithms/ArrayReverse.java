package com.king.illusion.algorithms;

import java.util.Arrays;

public class ArrayReverse {

    public static void arrayReverse(int[] arrays){

        for (int min = 0,max = arrays.length-1; min < arrays.length; min++,max--) {
            if (min < max){
                int temp = arrays[min];
                arrays[min] = arrays[max];
                arrays[max] = temp;
            }
        }
        int min = 0 , max = arrays.length-1;

        /*while (min < max){
            int temp = arrays[min];
            arrays[min++] = arrays[max];
            arrays[max--] = temp;
        }*/
        System.out.println(Arrays.toString(arrays));
    }

    public static void main(String[] args) {
        int[] arrays = {1,2,2,3};
        arrayReverse(arrays);
    }
}
