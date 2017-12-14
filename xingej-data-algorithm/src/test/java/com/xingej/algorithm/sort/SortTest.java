package com.xingej.algorithm.sort;

import org.junit.Before;
import org.junit.Test;

public class SortTest {

    private int[] arr = new int[5];

    // 初始化数组
    @Before
    public void initArray() {
        arr[0] = 3;
        arr[1] = 1;
        arr[2] = 11;
        arr[3] = 10;
        arr[4] = 9;

        System.out.println("------排序前-----");
        show(arr);
    }

    // -----打印输出
    /**
     * 打印输出数组
     * 
     * @param arr
     */
    private void show(int[] arr) {

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    // -----冒泡排序
    @Test
    public void testByBubbleSort() {

        SortUtils.bubbleSort(arr);

        System.out.println("------排序后-----");

        show(arr);
    }

    // -----选择排序
    @Test
    public void testBySelectionSort() {

        SortUtils.selectSort(arr);

        System.out.println("------排序后-----");

        show(arr);
    }

    // -----插入排序
    @Test
    public void testByInsertSort() {

        SortUtils.insertSort(arr);

        System.out.println("------排序后-----");

        show(arr);
    }

}
