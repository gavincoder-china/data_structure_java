package data_structure.排序算法; /**
 * @Author: GavinCoder
 * @Date: 2020/7/6 07:20
 */

import java.util.Arrays;

/**
 * **********************************************************
 *
 * @Project:
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2020-07-06 07:20
 * @description:
 ************************************************************/
public class 归并排序 {
    public static void main(String[] args) {
          SortTools.check(归并排序.class);
     /*   int[] ints = {
                2, 3, 4, 51, 3, 4, 54, 123, 124, 435, 46, 4363, 1234, 11, 3
        };
        sort(ints);
        System.out.println(Arrays.toString(ints));*/
    }

    static void sort(int[] arr) {

        recursive(arr, 0, arr.length - 1);
    }

    /**
     * 递归排序
     * @param arr
     * @param start
     * @param end
     */
    static void recursive(int[] arr, int start, int end) {
        //
        if (start == end) return;
        //分成两半
        int mid = start + (end - start) / 2;
        //左边递归排序
        recursive(arr, start, mid);
        //右边递归排序
        recursive(arr, mid + 1, end);
        //合并
        merge(arr, start, mid + 1, end);

    }

    /**
     * 归并算法--合并两端已经排好序的数组
     */
    static void merge(int[] arr, int leftPointer, int rightPointer, int rightBound) {

        /**
         * 四个指针
         * 1.左起始位置
         * 2.右起始位置
         * 3.临时数组指针
         * 4.原数组中间位置
         */
        int left = leftPointer;
        int right = rightPointer;
        int middle = right - 1;
        int temp = 0;
        int[] tempArr = new int[rightBound - leftPointer + 1];

        while (left <= middle && right <= rightBound) {
            tempArr[temp++] = arr[left] < arr[right] ? arr[left++] : arr[right++];
        }

        while (left <= middle) {
            tempArr[temp++] = arr[left++];
        }
        while (right <= rightBound) {
            tempArr[temp++] = arr[right++];
        }

        for (int i = 0; i < tempArr.length; i++) {

            arr[leftPointer + i] = tempArr[i];
        }

    }
}
