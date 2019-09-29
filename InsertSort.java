package com.demo;

/**
 * 插入排序（从第二个元素开始，插入已排序好得数组，直至全部插入）
 * @author yuan
 */
public class InsertSort {

    public void sort (int[] arr) {
        for(int i = 1 ; i < arr.length ; i++){
            int temp = arr[i];
            int j;
            for (j = i - 1 ; j >= 0 && arr[j] > temp ; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
    }

}
