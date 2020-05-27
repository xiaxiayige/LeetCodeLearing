package com.company.array;

import java.util.HashMap;
import java.util.Map;

/****
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        ContainsDuplicate test4 = new ContainsDuplicate();
        int[] aar = {7, 3, 2, 1, 2};

        long start = System.nanoTime();
        System.out.println(test4.containsDuplicate(aar));
        System.out.println("time = " + (System.nanoTime() - start));
    }

    public boolean containsDuplicate(int[] nums) {
/**************************** 方法一 236522 *********************************************************/
//        if (nums.length <= 1) {
//            return false;
//        }
//        int len = nums.length;
//        for (int i = 0; i < len; i++) {
//            for (int j = i+1; j < len; j++) {
//                if (nums[i] == nums[j]) {
//                    return true;
//                }
//            }
//        }
//
//        return false;

/**************************** 方法二 421564 *********************************************************/
//        Arrays.sort(nums);
//        int len = nums.length;
//        for (int i = 0; i < len; i++) {
//            if(i + 1<len){
//                if (nums[i] == nums[i + 1]) {
//                    return true;
//                }
//            }
//
//        }
//        return false;
/**************************** 方法三 421564 *********************************************************/
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            if (map.containsKey(num)) {
//                return true;
//            }
//            map.put(num, num);
//        }
//        return false;

/**************************** 方法四 421564 *********************************************************/
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, num);
        }

        return !(map.size() == nums.length);
        //大神写法

//        if (nums.length<1 || nums[0]==237384 || nums[0]==-24500) return false;
//        boolean[] booleans=new boolean[256];
//        for(int i=0;i<nums.length;i++){
//            int t=nums[i]&255;
//            System.out.println("t = " + t);
//            if(booleans[t])return true;
//            booleans[t]=true;
//            System.out.println(Arrays.toString(booleans));
//        }
//        return false;


    }
}
