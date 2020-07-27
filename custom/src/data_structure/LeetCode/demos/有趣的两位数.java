package data_structure.LeetCode.demos; /**
 * @Author: GavinCoder
 * @Date: 2020/7/1 09:30
 */

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * **********************************************************
 *
 * @Project: 34*86=43*68
 * 如果把这些两位数的十位数跟个位数交换,两者乘积不变
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2020-07-01 09:30
 * @description:
 ************************************************************/
class Func {
    public static int swap(int origin) {

        if (origin >= 100 || origin < 10) {
            throw new IllegalArgumentException("参数只能是两位正整数");
        }

      /*  //获取十位
       origin / 10;
        //获取个位
       origin % 10;*/

        return (origin % 10) * 10 + (origin / 10);
    }

    public static HashSet<String> getNumbers() {

        HashSet<String> set = new LinkedHashSet<>();

        for (int i = 10; i < 100; i++) {

            for (int j = 10; j < 100; j++) {
                String r0 = i <= j ? i + ":" + j : j + ":" + i;

                if (set.contains(r0)) {
                    continue;
                }

                if (i * j == Func.swap(i) * Func.swap(j)) {
                    set.add(r0);
                }
            }
        }
        return set;
    }

}

public class 有趣的两位数 {
    public static void main(String[] args) {

        HashSet<String> set = Func.getNumbers();

        System.out.println(set.toString());
        System.out.println(set.size());
    }


}
