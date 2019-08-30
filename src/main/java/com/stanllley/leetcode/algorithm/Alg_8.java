package com.stanllley.leetcode.algorithm;

/**
 * @Author: xuyang
 * @Email: youtouchyang@sina.com
 * @Description: 字符串转换整数 (atoi)
 * @Date: 2019/8/30 10:10
 */
public class Alg_8 {

    /**
     * 链接：https://leetcode-cn.com/problems/string-to-integer-atoi/
     *
     * @param str
     * @return
     */
    public int myAtoi(String str) {
        if (str.length() == 0) {
            return 0;
        }
        str = str.trim() + " ";
        int index = 0;
        char[] charArray = str.toCharArray();
        char c1 = charArray[0];
        boolean positiveNumber = true;
        if (c1 < '0' || c1 > '9') {
            if (c1 == '-') {
                positiveNumber = false;
                index++;
            } else if (c1 == '+') {
                index++;
            } else {
                return 0;
            }
        }
        int endIndex = index;
        long num = 0;
        for (int i = index; i < charArray.length; i++) {
            char c = charArray[i];
            if (c > '9' || c < '0') {
                break;
            } else {
                num = num * 10 + c - '0';
                if (num > Integer.MAX_VALUE) {
                    if (positiveNumber) {
                        return Integer.MAX_VALUE;
                    } else {
                        return -1 * num <= Integer.MIN_VALUE ? Integer.MIN_VALUE : (int) (-1 * num);
                    }
                }
            }

        }
        return (int) (positiveNumber ? num : num * -1);

    }

}
