package com.company.array;

import java.util.Arrays;
import java.util.HashMap;

class TwoSum {

    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, imax = 1, imin = 1; //一个保存最大的，一个保存最小的。
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int tmp = imax;
                imax = imin;
                imin = tmp;
            } //如果数组的数是负数，那么会导致最大的变最小的，最小的变最大的。因此交换两个的值。
            imax = Math.max(imax * nums[i], nums[i]);
            imin = Math.min(imin * nums[i], nums[i]);

            max = Math.max(max, imax);
        }
        return max;
    }


    public int[] twoSum(int[] nums, int target) {
       long startTime=System.currentTimeMillis();
        int[] arr = new int[2];
        int i1 = nums.length - 1;
        for (int i = 0; i < i1; i++) {
            for (int i2 = i+1; i2 <= i1; i2++) {
                if(nums[i]+nums[i2]==target){
                    arr[0]=i;
                    arr[1]=i2;
                }
            }
        }
        System.out.println("time =" +(System.currentTimeMillis()-startTime));
        return arr;
    }

    //2 7 8 9
    //9
    public int[] twoSum2(int[] nums, int target) {
        int length = nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < length; i++) {
            int value=target-nums[i];
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),i};
            }
            map.put(value,i);
        }
        throw new RuntimeException("没有能够匹配的数据");
    }


}