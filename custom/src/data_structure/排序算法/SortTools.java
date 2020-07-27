package data_structure.排序算法; /**
 * @Author: GavinCoder
 * @Date: 2020/7/5 20:35
 */

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Random;

/**
 * **********************************************************
 *
 * @Project: 排序算法工具类
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2020-07-05 20:35
 * @description:
 ************************************************************/
public class SortTools {

    /**
     * 生成一千个,1000以内的数据
     *
     * @return
     */
    public static int[] generateArray() {
        int[] array = new int[1000];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000) ;
        }

        return array;
    }

    /**
     * 交换
     */
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 验证算法是否正确
     *
     * @param clazz
     */
    public static void check(Class clazz) {
        int[] arr1 = generateArray();
        int[] arr2 = new int[arr1.length];

        System.arraycopy(arr1, 0, arr2, 0, arr1.length);

        Arrays.sort(arr1);

        try {
            Method sort = clazz.getDeclaredMethod("sort", int[].class);
            sort.invoke(clazz, arr2);
        }
        catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        boolean same = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) same = false;
        }
        System.out.println(same ? "right" : "false");

    }
}
