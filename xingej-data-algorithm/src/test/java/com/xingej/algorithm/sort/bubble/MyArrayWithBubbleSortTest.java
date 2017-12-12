package com.xingej.algorithm.sort.bubble;

import org.junit.Test;

public class MyArrayWithBubbleSortTest {

    @Test
    public void test() {
        MyArrayWithBubbleSort bubbleSort = new MyArrayWithBubbleSort(6);

        bubbleSort.insert(2);
        bubbleSort.insert(3);
        bubbleSort.insert(1);
        bubbleSort.insert(7);

        System.out.println("------排序前----打印输出------");
        bubbleSort.show();

        bubbleSort.bubbleSort();

        System.out.println("------排序后----打印输出------");
        bubbleSort.show();

    }

}
