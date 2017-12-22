package com.xingej.algorithm.sort;

import org.junit.Before;
import org.junit.Test;

public class SortTest {

    private int max = 20;
    private int[] arr = new int[max];

    // 初始化数组
    @Before
    public void initArray() {

        for (int i = 0; i < max; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }

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

        for (int i = 0; i < max; i++) {
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

    // -----希尔排序
    @Test
    public void testByShellSort() {

        SortUtils.shellSort(arr);

        System.out.println("------排序后-----");

        show(arr);
    }

    // -----快速排序
    @Test
    public void testByQuickSort() {
        SortUtils.quickSort(arr);

        System.out.println("------排序后-----");

        show(arr);
    }

    // -----归并排序
    @Test
    public void testByMergeSort() {
        SortUtils.mergeSort(arr);

        System.out.println("------排序后-----");

        show(arr);
    }

    // -----桶排序
    @Test
    public void testByBucketSort() {
        SortUtils.bucketSort(arr);

        System.out.println("------排序后-----");

        show(arr);
    }

}
