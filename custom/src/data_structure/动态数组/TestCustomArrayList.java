package data_structure.动态数组;
/**
 * @Author: GavinCoder
 * @Date: 2020/6/6 11:42 下午
 */

/**
 * **********************************************************
 *
 * @Project:
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2020-06-06 23:42
 * @description:
 ************************************************************/
public class TestCustomArrayList {
    public static void main(String[] args) {



        int[]  array = new int[3];

        //1.我们的数据，一般是规则的数据
        //2.数据一般是对象形式
        //3.数据的数量是不确定的

        //现在数组的情况是，不支持扩容。且不支持对象存储。
        //数组的优点，查询比较快（因为内存地址连续）

        //对数组进行改造，完成我们的需求
        //查 增 改 删




        CustomArrayList<String> customArrayList = new CustomArrayList<>();
        customArrayList.add("gavin111");
        customArrayList.add("betty");
        customArrayList.add("gavin");
        customArrayList.add("betty");
        customArrayList.add("gavin");
        customArrayList.add("betty");
        customArrayList.add("gavin");
        customArrayList.add("betty666");
        customArrayList.add("gavin");
        customArrayList.add("betty");
        customArrayList.add("gavin");
        customArrayList.add("betty");

        System.out.println(customArrayList);
        customArrayList.add(2, "666");
        System.out.println(customArrayList);
        customArrayList.remove(0);
        System.out.println(customArrayList);

        customArrayList.remove("betty666");
        System.out.println(customArrayList);
    }
}
