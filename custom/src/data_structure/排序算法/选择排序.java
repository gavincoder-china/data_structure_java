package data_structure.排序算法; /**
 * @Author: GavinCoder
 * @Date: 2020/4/26 5:04 下午
 */

import java.util.Arrays;

/**
 * **********************************************************
 *
 * @Project: 选择排序
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2020-04-26 17:04
 * @description:
 ************************************************************/
public class 选择排序 {

    public static void main(String[] args) {
     /*   int[] arr = {3, 5, 6, 1, 2, 3, 4, 6, 8, 91, 0, 9, -2};

        min(arr);
        System.out.println("***********");
        minAndMax(arr);*/
     SortTools.check(选择排序.class);
    }


    /**
     * 遍历只取最小值
     */
    static void sort(int[] arr) {


        for (int i = 0; i < arr.length - 1; i++) {

            int minPosition = i;

            for (int j = i + 1; j < arr.length; j++) {
                minPosition = arr[j] < arr[minPosition] ? j : minPosition;
            }
            SortTools.swap(arr, i, minPosition);
            System.out.println("第" + (i + 1) + "次循环，最小值位置为" + minPosition + "，数组为" + Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 遍历同时取最大最小值
     */
    static void minAndMax(int[] arr) {


        for (int i = 0; i < (arr.length + 1) / 2; i++) {

            int minPosition = i;
            int maxPosition = arr.length - 1 - i;

            if (arr[minPosition] > arr[maxPosition]) {
                int temp = minPosition;
                minPosition = maxPosition;
                maxPosition = temp;
            }
            for (int j = i + 1; j < arr.length - 1 - i; j++) {

                minPosition = arr[j] < arr[minPosition] ? j : minPosition;
                maxPosition = arr[j] > arr[maxPosition] ? j : maxPosition;

            }
            SortTools.swap(arr, i, minPosition);

            if (i != maxPosition) {
                //如果最大值不在i上直接交换
                SortTools.swap(arr, arr.length - 1 - i, maxPosition);
            } else {
                //如果最大值在i上，经过上面最少值交换，已将最大值交换到minPosition，所以最大值交换要和maxPosition
                SortTools.swap(arr, arr.length - 1 - i, minPosition);
            }

            System.out.println("第" + (i + 1) + "次循环，最小值位置为" + minPosition + "，最大值位置为" + maxPosition + "数组为" + Arrays.toString(arr));

        }
        System.out.println(Arrays.toString(arr));


    }


}
