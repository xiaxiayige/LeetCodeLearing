package com.company.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* 两个数组的交集 II
         给定两个数组，编写一个函数来计算它们的交集。

         示例 1:

         输入: nums1 = [1,2,2,1], nums2 = [2,2]
         输出: [2,2]
         示例 2:

         输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
         输出: [4,9]
         说明：

         输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
         我们可以不考虑输出结果的顺序。
         进阶:

         如果给定的数组已经排好序呢？你将如何优化你的算法？
         如果 nums1 的大小比 nums2 小很多，哪种方法更优？
         如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
*/
public class Intersect {

    public static void main(String[] args) {
        Intersect test6 = new Intersect();
//        int[] aar = {4, 9, 5};
//        int[] aar2 = {9, 4, 9, 8, 4};

        int[] aar = {2, 1};
        int[] aar2 = {1, 2};

//        int[] aar = {3, 1, 2};
//        int[] aar2 = {1, 3};

//        int[] aar = {1, 2, 2, 1};
//        int[] aar2 = {2, 2};

        int[] intersect = test6.intersect(aar, aar2);
        System.out.println("args = " + Arrays.toString(intersect));

    }


    public int[] intersect(int[] nums1, int[] nums2) {

        if(nums1.length<nums2.length){
            return intersect(nums2,nums1);
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < nums2.length; i++) {
            for (int i1 = 0; i1 < nums1.length; i1++) {
                if (nums2[i] == nums1[i1] && !map.containsKey(i1)) {
                    integers.add(nums2[i]);
                    map.put(i1,i); //需要跳过的下标
                    break;
                }
            }
        }

        int[] result=new int[integers.size()];

        for (int i = 0; i < integers.size(); i++) {
            result[i]=integers.get(i);
        }

        return result;
    }


}
