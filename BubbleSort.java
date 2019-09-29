package com.demo;

/**
 * 冒泡排序（从左向右比较相邻元素，如果第一个数比第二个数大，交换位置，一趟排序使最大值位于最右边，每趟排序个数减一，直至个数为一）
 * @author yuan
 */
public class BubbleSort {

    public void sort(int[] arr) {
        for(int i = 0 ; i < arr.length - 1 ; i ++) {
            for(int j = 0 ; j < arr.length - i - 1 ; j ++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
