package com.stanllley.leetcode.algorithm;

/**
 * @Author: xuyang
 * @Email: youtouchyang@sina.com
 * @Description: 删除排序数组中的重复项
 * @Date: 2019/8/30 10:16
 */
public class Alg_26 {

    /**
     * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

}
