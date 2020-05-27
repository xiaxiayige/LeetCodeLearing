package com.company.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * 示例 2:
 *
 * 输入: [-1,-100,3,99] 和 k = 2
 * 输出: [3,99,-1,-100]
 * 解释:
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 * 说明:
 *
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 要求使用空间复杂度为 O(1) 的 原地 算法。
 */
public class RotateArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        int[] arr = {1, 2};

        RotateArray test3 = new RotateArray();

        test3.rotate(arr, 3);

    }

    public void rotate(int[] nums, int k) {
        long start = System.nanoTime();
        if (nums.length <= 1 || k <= 0 || k % nums.length == 0) {
            System.out.println(Arrays.toString(nums));
            return;
        }
        k = k % nums.length;

/*********************************** 方法一 （耗时 220290） ********************************************************/
//
//        int len = nums.length;
//
//        for (int i = 0; i < k; i++) {
//            int lastValue = nums[len - 1];
//            for (int j = len - 1; j > 0; j--) {
//                nums[j] = nums[j - 1];
//            }
//            nums[0] = lastValue;
//        }
//        System.out.println(Arrays.toString(nums));


/*********************************** 方法二 （耗时 30144）********************************************************/
//        changeArray(nums, 0, nums.length - 1);
//        //System.out.println(Arrays.toString(nums));
//        changeArray(nums, 0, k - 1);
//        //System.out.println(Arrays.toString(nums));
//        changeArray(nums, k, nums.length - 1);
//        //System.out.println(Arrays.toString(nums));

        /*********************************** 方法二 （耗时 30144）********************************************************/

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(i, nums[i]);
        }


        int len = nums.length - 1;

        for (int i = 0; i < k; i++) {
            list.add(0, nums[len-i]);
        }

        //移除最后三位
        for (int i = 0; i < k; i++) {

        }


        System.out.println("list = " +list + ", k = " + k);
        System.out.println("time = " + (System.nanoTime() - start));

    }

    public void changeArray(int[] num, int start, int end) {
        while (start < end) {
            int temp = num[end];
            num[end] = num[start];
            num[start] = temp;
            start++;
            end--;
        }
    }

}
