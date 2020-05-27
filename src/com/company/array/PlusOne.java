package com.company.array;

import java.util.Arrays;

/*加一
        给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。

        最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。

        你可以假设除了整数 0 之外，这个整数不会以零开头。

        示例 1:
        输入: [1,2,3]
        输出: [1,2,4]
        解释: 输入数组表示数字 123。

        示例 2:

        输入: [4,3,2,1]
        输出: [4,3,2,2]
        解释: 输入数组表示数字 4321。
*/
public class PlusOne {

    public static void main(String[] args) {

        PlusOne test7 = new PlusOne();
        int[] aar = {1, 2, 3};
//        int[] aar = {9};
//        int[] aar = {9,9};
//        int[] aar={0};
//        int[] aar = {2, 4, 9, 3, 9};
//        int[] aar={9,8,7,6,5,4,3,2,1,0};
//        int[] aar = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
//        int[] aar = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
//        int[] aar = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
//        int[] aar={7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        int[] plusOne = test7.plusOne(aar);
        System.out.println("plusOne = " + Arrays.toString(plusOne));
    }


    public int[] plusOne(int[] digits) {
        //方法1
//        int len = digits.length;
//        if (digits.length == 1) {
//            if (digits[0] == 9) {
//                return new int[]{1, 0};
//            } else {
//                return new int[]{digits[0] + 1};
//            }
//        }
//
//        for (int i = len - 1; i > 0; i--) {
//            if (digits[i] + 1 >= 10) {
//                digits[i] = 0;
//                digits[i - 1] = digits[i - 1] + 1;
//                if (digits[i - 1] < 10) {
//                    break;
//                }
//            } else {
//                digits[i] = digits[i] + 1;
//                break;
//            }
//        }
//
//        int newLen = digits.length;
//        if (digits[0] >= 10) {
//            newLen = digits.length + 1;
//        }
//
//        int[] result = new int[newLen];
//
//        if (digits[0] >= 10) {
//            result[0] = 1;
//            for (int i = 1; i < digits.length; i++) {
//                result[i] = 0;
//            }
//        } else {
//            for (int i = 0; i < digits.length; i++) {
//                result[i] = digits[i];
//            }
//        }
//
//        System.out.println("result = " + Arrays.toString(result));

        //方法二

        for (int i = digits.length - 1; i >=0; i--) {
            digits[i] = digits[i] + 1;
            if (digits[i] >= 10) {
                digits[i] = 0;
            } else {
                return digits;
            }
        }

        int[] result=new int[digits.length+1];
        result[0]=1;

        return result;
    }

}
