package com.xingej.algorithm.sort.bubble;

/**
 * 自定义数组类
 * 
 * 特点是：带有冒泡排序功能
 * 
 * 冒泡排序核心：1、从数组的最后一个元素，开始比较；2、两两比较，满足条件的话，就需要进行位置的互换
 * 
 * 实际生活中：小学时，需要根据身高进行座位排序，就可以使用冒泡排序进行。
 * 
 * @author erjun 2017年12月11日 上午9:20:28
 */
public class MyArrayWithBubbleSort {
    // 声明一个数组
    private int[] arr;

    // 数组，最多能存储多少个元素
    private int maxSize;

    // 当前数组里，有多少个元素;有点类似于指针，索引的意思
    private int elements;

    public MyArrayWithBubbleSort(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        // 初始化状态，数组里的默认元素个数为0
        this.elements = 0;
    }

    public void insert(int value) {
        arr[elements++] = value;
    }

    public void show() {

        for (int i = 0; i < elements; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public void bubbleSort() {
        // 4 3 2 1，按冒泡排序的话，需要进行3轮比较可以了
        for (int i = 0; i < elements - 1; i++) {
            // 每一轮比较，找出本轮的最小值
            for (int j = elements - 1; j > i; j--) {

                // 后面的/下面的水泡 小于 上面的水泡，就移位
                if (arr[j] < arr[j - 1]) {
                    swap(j, j - 1);
                }
            }
        }
    }

    // 左右值交换
    private void swap(int i, int j) {
        // java 是引用传递
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
