package com.demo;

/**
 * 选择排序（选择最小元素与左边第一位交换位置，然后从剩余元素中选最小元素，放在已排序元素后，直至待排序元素为空）
 * @author yuan
 */
public class SelectSort {

    public void sort(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++) {
            int minIndex = i;
            for(int j = i + 1 ; j < arr.length ; j ++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

}
