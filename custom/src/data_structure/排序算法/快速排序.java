package data_structure.排序算法; /**
 * @Author: GavinCoder
 * @Date: 2020/7/6 09:25
 */

import com.sun.org.apache.bcel.internal.generic.SWAP;
import org.checkerframework.checker.units.qual.A;

import java.util.Arrays;

/**
 * **********************************************************
 *
 * @Project:
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2020-07-06 09:25
 * @description:
 ************************************************************/
public class 快速排序 {
    public static void main(String[] args) {
        SortTools.check(快速排序.class);


    }

    static void sort(int[] arr) {
        recursive(arr, 0, arr.length - 1);

    }

    static void recursive(int[] arr, int start, int end) {
        if (start >= end) return;
        int mid = partition(arr, start, end);
        recursive(arr, start, mid - 1);
        recursive(arr, mid + 1, end);

    }

    static int partition(int[] arr, int start, int end) {


        //轴
        int privot = arr[end];
        int left = start;
        int right = end - 1;


        while (left <= right) {
            while (left <= right && arr[left] <= privot) left++;
            while (left <= right && arr[right] > privot) right--;
            if (left < right) {
                SortTools.swap(arr, left, right);
            }
        }


        SortTools.swap(arr, left, end);


        return left;
    }
}
