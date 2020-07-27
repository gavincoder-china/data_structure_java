package data_structure.排序算法; /**
 * @Author: GavinCoder
 * @Date: 2020/7/5 22:07
 */

/**
 * **********************************************************
 *
 * @Project: 对基本有序的数组最好用, 且稳定
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2020-07-05 22:07
 * @description:
 ************************************************************/
public class 插入排序 {
    public static void main(String[] args) {
        SortTools.check(插入排序.class);
    }

    static void sort(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    SortTools.swap(arr, j, j - 1);
                }
            }
        }

    }

}
