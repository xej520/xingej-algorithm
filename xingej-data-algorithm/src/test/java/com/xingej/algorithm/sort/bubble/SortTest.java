package com.xingej.algorithm.sort.bubble;

import org.junit.Before;
import org.junit.Test;

import com.xingej.algorithm.sort.selection.SortUtils;

public class SortTest {

    private int[] arr = new int[5];

    // 初始化数组
    @Before
    public void initArray() {
        arr[0] = 3;
        arr[1] = 1;
        arr[2] = 8;
        arr[3] = 10;
        arr[4] = 9;

        System.out.println("------排序前-----");
        show(arr);
    }

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

    @Test
    public void testByBubbleSort() {

        SortUtils.bubbleSort(arr);

        System.out.println("------排序后-----");

        show(arr);
    }

}
