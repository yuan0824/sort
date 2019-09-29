package com.demo;

/**
 * 快速排序（取数组第一位为key值，将小于key值的数放在左边，大于key值得数放在右边，再分别对左右两部分进行快速排序，直至无法切分）
 * @author yuan
 */
public class QuickSort {

    public void sort(int[] arr,int low,int high) {
        int lo = low;
        int hi = high;
        int key = arr[low];
        while(low < high) {
            while(low < high && arr[high] >= key) {
                high--;
            }
            arr[low] = arr[high];
            while(low < high && arr[low] <= key) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[high] = key;
        if(hi > high+1) sort(arr,high+1,hi);
        if(lo < low-1) sort(arr,lo,low-1);
    }

}
