package com.cyg.suanfa.algorithm;

/**
 * 数组中重复的数字:
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。
 * 请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 *
 * @author cyg
 * @date 2019/3/31 下午7:47
 **/
public class Duplicate {
    /**
     * 功能描述: <br>
     * 〈数组中重复的数字〉
     *
     * @param numbers     数组
     * @param length      数组长度
     * @param duplication duplication[0]表示这个重复的值
     * @return
     * @author cyg
     * @date 2019/3/31 下午8:05
     */
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        int[] assist = new int[length];
        for (int i = 0; i < length; i++) {
            if (assist[numbers[i]] == 0) {
                assist[numbers[i]]++;
            } else {
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }
}
