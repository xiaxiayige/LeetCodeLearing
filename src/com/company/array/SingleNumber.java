package com.company.array;

/****
 * 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 *
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */
public class SingleNumber {

    public static void main(String[] args) {
        SingleNumber test5 = new SingleNumber();
        int[] aar = {4,2,4};
        //1 ,1 ,2
        int singleNumber = test5.singleNumber(aar);
        System.out.println("singleNumber = " + singleNumber);
    }


    public int singleNumber(int[] nums) {

//        Arrays.sort(nums);
//        int len = nums.length ;
//        int result = nums[len-1];
//        for (int i = 0; i < len-2; i+=2) {
//            if (nums[i] != nums[i + 1]) {
//                result=nums[i];
//                break;
//            }
//        }
//        return result;




        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result ^= nums[i];
            System.out.println("result = " + result);
        }

        return result;
    }


}
