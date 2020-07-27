package data_structure.排序算法; /**
 * @Author: GavinCoder
 * @Date: 2020/7/6 13:43
 */

import sun.reflect.generics.tree.FormalTypeParameter;

import javax.xml.transform.Result;
import java.util.Arrays;

/**
 * **********************************************************
 *
 * @Project: 非比较排序
 * 适用范围:
 * 数据量特别大,但是取值范围小.
 * 例,高考生计算名次
 * 几万人按照年龄排序
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2020-07-06 13:43
 * @description:
 ************************************************************/
public class 计数排序 {
    public static void main(String[] args) {
        SortTools.check(计数排序.class);
        // System.out.println(Arrays.toString(SortTools.generateArray()));
        //sort(SortTools.generateArray());
    }

    static void sort(int[] arr) {


        //找到最小最大的值,获取计数数组的大小范围
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        //计数数组
        int[] count = new int[max - min + 1];

        int[] result = new int[arr.length];

        //当数据重复出现时,计数数组的值增加1
        for (int num : arr) {
            count[num-min]++;
        }
        System.out.println(Arrays.toString(count));

     /*不稳定
      for (int i = 0, j = 0; i < count.length; i++) {
            while (count[i]-- > 0) arr[j++] = i;
        }
    */

        /**
         * 稳定实现,累加倒序取值
         */

        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            result[--count[arr[i]-min]] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {

            arr[i] = result[i];
        }
    }
}
