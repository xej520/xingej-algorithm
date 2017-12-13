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

    /**
     * 
     * 选择排序的核心:
     * 
     * 扫描所有的元素，得到最小的元素，并将最小的元素与左边第一个元素进行交换。再次扫描除
     * 
     * 第一位置的所有元素，得到最小的元素，与左边第二个元素进行交换。依次类推
     * 
     * 选择排序是建立在冒泡排序的基础之上的，
     * 
     * 冒泡排序的缺点，每一轮交换的次数太多了，为了解决这个问题，出现选择排序
     * 
     * 解决思路，很明显，既然冒泡排序每一轮的交换次数太多，那就，每一轮，最多交换依次，就是说，每一轮只将最小值
     * 
     * 找出来，进行交换，
     * 
     * 按照这个思路，去写"选择排序"
     * 
     */
    public static void selectSort(int[] arr) {
        int minIndex = 0; // 每次两两比较时，如a>b，那么minIndex就是b的下标
        int value;

        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            value = arr[minIndex]; // 每一轮未排序元素的第一个值

            // 这个for，每一次，都会找出未排序元素的最小下标
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;// 将最小下标赋值给minIndex
                }
            }

            // 将最小值与第一个元素，进行交换
            arr[i] = arr[minIndex];
            arr[minIndex] = value;
        }
    }

}
