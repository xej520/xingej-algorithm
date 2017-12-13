package com.xingej.algorithm.sort;

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
    /**
     * 
     * 冒泡排序核心：1、从数组的最后一个元素，开始比较；2、两两比较，满足条件的话，就需要进行位置的互换
     * 
     * 实际生活中：小学时，需要根据身高进行座位排序，就可以使用冒泡排序进行。
     * 
     */
    public static void bubbleSort(int[] arr) {

        int temp;

        // 4 3 2 1，按冒泡排序的话，需要进行3轮比较可以了
        for (int i = 0; i < arr.length - 1; i++) {
            // 每一轮比较，找出本轮的最小值
            for (int j = arr.length - 1; j > i; j--) {

                // 后面的/下面的水泡 小于 上面的水泡，就移位
                if (arr[j] < arr[j - 1]) {
                    // java 是引用传递
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

}
