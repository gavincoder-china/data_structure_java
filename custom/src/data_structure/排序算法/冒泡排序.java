package data_structure.排序算法; /**
 * @Author: GavinCoder
 * @Date: 2020/7/5 21:42
 */

/**
 * **********************************************************
 *
 * @Project:
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2020-07-05 21:42
 * @description:
 ************************************************************/
public class 冒泡排序 {
    public static void main(String[] args) {
        SortTools.check(冒泡排序.class);
    }

    static void sort(int[] arr) {

        int length = arr.length;
        for (; length > 0; length--) {
            for (int i = 0; i < length-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    SortTools.swap(arr, i, i + 1);
                }
            }
        }
    }
}
