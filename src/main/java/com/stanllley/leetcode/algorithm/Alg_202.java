package com.stanllley.leetcode.algorithm;

/**
 * @Author: xuyang
 * @Email: youtouchyang@sina.com
 * @Description: 快乐数
 * @Date: 2019/8/30 10:35
 */
public class Alg_202 {

    /**
     * 链接：https://leetcode-cn.com/problems/happy-number
     *
     * @param n
     * @return
     */
    public boolean isHappy(int n) {
        int temp = n;
        temp = powSum(temp);
        while (temp != 1 && temp != 89) {
            temp = powSum(temp);
        }
        if (temp == 89) {
            return false;
        }
        return true;
    }

    private static int powSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        return sum;

    }
}
