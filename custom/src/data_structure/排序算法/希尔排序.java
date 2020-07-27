package data_structure.排序算法; /**
 * @Author: GavinCoder
 * @Date: 2020/7/6 06:55
 */

/**
 * **********************************************************
 *
 * @Project:
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2020-07-06 06:55
 * @description:knuth序列计算gap大小
 ************************************************************/
public class 希尔排序 {
    public static void main(String[] args) {
        SortTools.check(希尔排序.class);
    }

    static void sort(int[] arr) {


        int h = 1;
        while (h <= arr.length / 3) {
            h = h * 3 + 1;
        }

        for (int gap = h; gap > 0; gap = (gap - 1) / 3) {


            for (int i = gap; i < arr.length; i++) {

                for (int j = i; j > gap - 1; j -= gap) {

                    if (arr[j] < arr[j - gap]) {
                        SortTools.swap(arr, j, j - gap);
                    }

                }

            }
        }
    }

}
