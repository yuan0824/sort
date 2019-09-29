package com.demo;

/**
 * 基数排序（先确定最大元素的位数，即排序的次数，再分配给10个桶，桶中元素收集，重复此步骤至需要的次数）
 * @author yuan
 */
public class RadixSort {
    public void sort(int[] arr) {
        int max = findMax(arr);
        int time = 0;
        while(max > 0) {
            max /= 10;
            time++;
        }

        int[][] temp = new int[10][arr.length];
        int[] order = new int[10];
        int divisor = 1;
        for(int i = 0 ; i < time; i++) {
            //分配
            for (int ele : arr) {
                int digit = ((ele / divisor) % 10);
                temp[digit][order[digit]++] = ele;
            }

            //收集
            int index = 0;
            for (int j = 0; j < 10; j++) {
                int k = 0;
                while(k < order[j]){
                    arr[index++] = temp[j][k++];  // 按照先进先出依次取出桶中的元素
                }
                order[j] = 0;  // 计数器归零
            }
            divisor *= 10;
        }


    }

    private int findMax(int[] array) {
        int max = 0;
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] > array[max]){
                max = i;
            }
        }
        return array[max];
    }
}
