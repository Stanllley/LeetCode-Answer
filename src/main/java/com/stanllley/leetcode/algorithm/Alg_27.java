package com.stanllley.leetcode.algorithm;

/**
 * @Author: xuyang
 * @Email: youtouchyang@sina.com
 * @Description: 移除元素
 * @Date: 2019/8/30 10:19
 */
public class Alg_27 {

    /**
     * 链接：https://leetcode-cn.com/problems/remove-element/
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

}
