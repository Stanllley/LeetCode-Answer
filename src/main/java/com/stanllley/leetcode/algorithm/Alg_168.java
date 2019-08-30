package com.stanllley.leetcode.algorithm;

/**
 * @Author: xuyang
 * @Email: youtouchyang@sina.com
 * @Description: 168. Excel表列名称
 * @Date: 2019/8/30 9:43
 */
public class Alg_168 {


    public static void main(String[] args) {
        convertToTitle(59834);
    }

    /**
     * 给定一个正整数，返回它在 Excel 表中相对应的列名称。
     * <p>
     * 例如，
     * <p>
     * 1 -> A
     * 2 -> B
     * 3 -> C
     * ...
     * 26 -> Z
     * 27 -> AA
     * 28 -> AB
     * ...
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/excel-sheet-column-title
     *
     * @param n
     * @return
     */
    public static String convertToTitle(int n) {
        StringBuilder builder = new StringBuilder();
        while (n > 0) {
            builder.append((char) ((n - 1) % 26 + 'A'));
            n = (n - 1) / 26;
        }
        return builder.reverse().toString();
    }

}
