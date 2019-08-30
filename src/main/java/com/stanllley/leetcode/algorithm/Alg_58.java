package com.stanllley.leetcode.algorithm;

/**
 * @Author: xuyang
 * @Email: youtouchyang@sina.com
 * @Description: 58. 最后一个单词的长度
 * @Date: 2019/8/29 17:05
 */
public class Alg_58 {


    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(" "));

    }

    /**
     * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
     * <p>
     * 如果不存在最后一个单词，请返回 0 。
     * <p>
     * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
     * <p>
     * 示例:
     * <p>
     * 输入: "Hello World"
     * 输出: 5
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/length-of-last-word
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param s
     * @return
     */
    public static int lengthOfLastWord(String s) {
        int len = s.length();
        if (len == 0) {
            return 0;
        }
        int end = len - 1;
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        if (end < 0) {
            return 0;
        }
        int index = end;
        while ((index >= 0) && s.charAt(index) != ' ') {
            index--;
        }
        return end - index;
    }

}
