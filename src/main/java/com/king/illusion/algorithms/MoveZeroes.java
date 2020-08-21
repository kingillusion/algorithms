package com.king.illusion.algorithms;
/*

leetcode 283 移动零
给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
说明:

   1,必须在原数组上操作，不能拷贝额外的数组。
   2,尽量减少操作次数。
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[res] = nums[i];
                if (res++ != i) {
                    nums[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        MoveZeroes m = new MoveZeroes();
        int[] ms = {0,1,2,5,0,9};
        m.moveZeroes(ms);
    }
}
