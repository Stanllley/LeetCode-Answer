package com.stanllley.leetcode.algorithm;

import java.util.PriorityQueue;

/**
 * @Author: xuyang
 * @Email: youtouchyang@sina.com
 * @Description: 703. 数据流中的第K大元素
 * @Date: 2019/8/29 10:48
 */
public class Alg_703 {


    public static void main(String[] args) {
        int k = 3;
        int[] arr = {4, 5, 8, 2};
        KthLargest kthLargest = new KthLargest(k, arr);
        kthLargest.add(3);// returns 4
        kthLargest.add(5);// returns 5
        kthLargest.add(10);// returns 5
        kthLargest.add(9);// returns 8
        kthLargest.add(4);// returns 8
    }

    /**
     * 设计一个找到数据流中第K大元素的类（class）。注意是排序后的第K大元素，不是第K个不同的元素。
     * <p>
     * 你的 KthLargest 类需要一个同时接收整数 k 和整数数组nums 的构造器，它包含数据流中的初始元素。每次调用 KthLargest.add，返回当前数据流中第K大的元素。
     * <p>
     * 示例:
     * <p>
     * int k = 3;
     * int[] arr = [4,5,8,2];
     * KthLargest kthLargest = new KthLargest(3, arr);
     * kthLargest.add(3);   // returns 4
     * kthLargest.add(5);   // returns 5
     * kthLargest.add(10);  // returns 5
     * kthLargest.add(9);   // returns 8
     * kthLargest.add(4);   // returns 8
     * 说明:
     * 你可以假设 nums 的长度≥ k-1 且k ≥ 1。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/kth-largest-element-in-a-stream
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    static class KthLargest {

        private PriorityQueue<Integer> pq;

        private int k;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            pq = new PriorityQueue<>(k);
            for (int val : nums) {
                add(val);
            }
        }

        public int add(int val) {
            if (pq.size() < k) {
                pq.offer(val);
            } else if (pq.peek() < val) {
                pq.poll();
                pq.offer(val);
            }
            return pq.peek();
        }

    }

}
