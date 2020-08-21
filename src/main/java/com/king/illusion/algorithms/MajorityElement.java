package com.king.illusion.algorithms;
//leetcode 169 多数元素
/*
 【适用于1/2情况】
  从第一个数开始count=1，遇到相同的就加1，
  遇到不同的就减1，减到0就重新换个数开始计数，总能找到最多的那个
 */

public class MajorityElement {
    public int majorityElement(int[] nums){
        int count = 1;
        int res = nums[0];
        for(int i = 1;i < nums.length;i++){
            if(nums[i]==res){
                count++;

            }else{
                count--;
                if(count==0){
                    res = nums[i+1];
                }
            }
        }
        return res;
    }
    public int majorityElement2(int[] nums) {
        int count = 0;
        int ret = 0;
        for (int num : nums) {
            if (count == 0) {
                ret = num;
            }
            count += (num == ret) ? 1 : -1;
        }
        return ret;
    }
    public static void main(String[] args) {
        MajorityElement m = new MajorityElement();
        int[] nums = {3,1,2,1,3,1};
        int a = m.majorityElement(nums);
        System.out.println(a);
    }
}
