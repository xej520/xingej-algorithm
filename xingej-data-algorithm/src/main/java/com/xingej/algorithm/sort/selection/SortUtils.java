package com.xingej.algorithm.sort.selection;

/**
 * 排序工具类
 * 
 * @author erjun 2017年12月13日 上午8:38:22
 */
public class SortUtils {

    // 私有构造器，禁止外界创建对象
    private SortUtils() {

    }

    // --------冒泡排序------
    public static void bubbleSort(int[] arr) {

        int temp;

        // 4 3 2 1，按冒泡排序的话，需要进行3轮比较可以了
        for (int i = 0; i < arr.length - 1; i++) {
            // 每一轮比较，找出本轮的最小值
            for (int j = arr.length - 1; j > i; j--) {

                // 后面的/下面的水泡 小于 上面的水泡，就移位
                if (arr[j] < arr[j - 1]) {
                    // java 是引用传递
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
