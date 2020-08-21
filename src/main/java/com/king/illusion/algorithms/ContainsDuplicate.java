package com.king.illusion.algorithms;
/*

    leetcode 217 存在重复元素

    给定一个整数数组，判断是否存在重复元素。

    如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    //排序找重复数
    public boolean containsDuplicate1(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if (nums[i] == nums[i+1]) return true;
        }
        return false;
    }
    //去重集合找重复数
    public boolean containsDuplicate2(int[] nums) {
        Set set = new HashSet();
        set.add(nums);
        if(set.size() == nums.length){
            return false;
        }
        return true;
    }
}
