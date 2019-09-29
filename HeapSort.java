package com.demo;

/**
 * 堆排序（构造最大堆，堆顶元素与末尾元素交换后，去除尾元素，重新构造最大堆，直至堆为空）
 * @author yuan
 */
public class HeapSort {

    public void sort(int[] arr) {
        if (null == arr || 1 >= arr.length) {
            return;
        }
        // 构建最大堆
        buildMaxHeap(arr);

        for (int i = arr.length - 1 ; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, 0, i - 1);
        }
    }

    private void buildMaxHeap(int[] arr) {
        for (int i = arr.length / 2 - 1 ; i >= 0 ; i--) {
            heapify(arr, i, arr.length - 1);
        }
    }

    // 判断非叶子节点的左右子节点是否满足最大堆特性
    private void heapify(int[] arr, int index, int len) {
        int li = index * 2 + 1;
        int ri = li + 1;
        int max = li;
        if (li > len) {
            return;
        }
        // 左右两个子结点中较大的值
        if (ri <= len && arr[ri] > arr[li]){
            max = ri;
        }
        // 较大值与父结点比较
        if (arr[max] > arr[index]) {
            swap(arr, max, index);
            heapify(arr, max, len);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
