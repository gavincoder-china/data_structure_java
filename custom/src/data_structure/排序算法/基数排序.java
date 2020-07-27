package data_structure.排序算法; /**
 * @Author: GavinCoder
 * @Date: 2020/7/6 14:31
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
 * @Date : 2020-07-06 14:31
 * @description:
 ************************************************************/
public class 基数排序 {
    public static void main(String[] args) {
        SortTools.check(基数排序.class);

    }

    static void sort(int[] arr) {
        int[] result = new int[arr.length];
        int[] count = new int[10];

        //最大数的位数,比如900,是3位
        int digit=3;

        for (int i = 0; i <digit; i++) {
            int division=(int)Math.pow(10,i);

            for (int j = 0; j <arr.length ; j++) {
                int num=arr[j]/division%10;
                count[num]++;
            }
            for (int m = 1; m <count.length ; m++) {
                count[m] = count[m] + count[m - 1];
            }

            for (int n = arr.length -1; n >=0 ; n--) {
                int num = arr[n] / division % 10;
                result[--count[num]] = arr[n];
            }
            System.arraycopy(result,0,arr,0,arr.length);

            Arrays.fill(count, 0);
        }

    }
}
