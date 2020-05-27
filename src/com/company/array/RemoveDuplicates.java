package com.company.array;

import java.util.*;

/***
 * Demo 1
 * 移除数组中的重复元素
 *
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 *
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 */
public class RemoveDuplicates {


    public static void main(String[] args) {
        RemoveDuplicates test = new RemoveDuplicates();
        int[] ints = {-3, -1, 0, 0, 0, 3, 3};
        int result = test.removeDuplicates(ints);
        System.out.println("result = " + result);
    }


    public int removeDuplicates(int[] nums) {
        //第一种写法
//        List<Integer> list=new ArrayList<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            if(!list.contains(nums[i])){
//                list.add(nums[i]);
//            }
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//            nums[i]=list.get(i);
//        }
//
//        return list.size();
        //第二种写法
//        Map<Integer, Integer> map = new TreeMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(nums[i])) {
//                continue;
//            }
//            map.put(nums[i], i);
//        }
//        Set<Integer> keySet = map.keySet();
//        int i = 0;
//        for (Integer s : keySet) {
//            nums[i] = s;
//            i++;
//        }
//        return map.size();

        //第三种写法
        int size = nums.length;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int index = 0;
        for (int num : nums) {
            if (map.containsKey(num)) {
                size--;
            } else {
                map.put(num,num);
                nums[index] = num;
                index++;
            }
        }

        return size;

    }
}
