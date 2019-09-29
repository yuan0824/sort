package com.demo;

/**
 * 归并排序（把数组不断递归拆分，直至无法拆分，把子数组合并在一起）
 * @author yuan
 */
public class MergeSort {

    public void sort(int[] arr, int low, int high) {
        if(low == high){
            return;
        }
        int mid = (low + high)/2;
        sort(arr, low, mid);
        sort(arr, mid + 1, high);
        merge(arr, low, mid + 1, high);
    }

    private void merge(int[] arr, int low, int mid, int high) {
        int[] leftArray = new int[mid - low];
        int[] rightArray = new int[high - mid + 1];

        for (int i = low ; i < mid ; i++) {
            leftArray[i - low] = arr[i];
        }
        for (int i = mid ; i <= high ; i++) {
            rightArray[i - mid] = arr[i];
        }
        int i = 0, j = 0;
        int  k = low;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] < rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
                k++;
            } else {
                arr[k] = rightArray[j];
                j++;
                k++;
            }
        }
        while (i < leftArray.length) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightArray.length) {
            arr[k] = rightArray[j];
            k++;
            j++;
        }
    }

}
