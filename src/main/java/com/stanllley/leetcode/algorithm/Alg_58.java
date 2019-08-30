package com.stanllley.leetcode.algorithm;

/**
 * @Author: xuyang
 * @Email: youtouchyang@sina.com
 * @Description:
 * @Date: 2019/8/29 17:05
 */
public class Alg_58 {


    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(" "));

    }


    public static int lengthOfLastWord(String s) {
        int len = s.length();
        if(len == 0){
            return 0;
        }
        int end = len - 1;
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        if(end < 0){
            return 0;
        }
        int index = end;
        while((index >= 0) && s.charAt(index) != ' '){
            index--;
        }
        return end - index;
    }

}
