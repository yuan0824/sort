package com.demo;

/**
 * 希尔排序（取数组长度的为增量，每次减半后按增量为元素分组，对每组进行插入排序，直至增量为一）
 * @author yuan
 */
public class ShellSort {

    public void sort(int[] arr) {
        int d = arr.length;
        do {
            d = d / 2;
            for (int x = 0 ; x < d ; x++) {
                for (int i = x + d ; i < arr.length; i = i + d) {
                    int temp = arr[i];
                    int j;
                    for (j = i - d ; j >= 0 && arr[j] > temp ; j = j - d) {
                        arr[j + d] = arr[j];
                    }
                    arr[j + d] = temp;
                }
            }
        } while (d != 1);
    }

}
