package com.xingej.algorithm.array;

/**
 * 面向对象编程
 * 
 * 自定义类数组
 * 
 * 你一定要明白，这是在JDK基础之上的封装，要学会这种思路，其他框架如netty 也是在前者的基础上封装而来的，如有一
 * 
 * 部分是封装的线程池
 * 
 * @author erjun 2017年11月28日 下午9:42:10
 */
public class MyArray {
    // 定义的数据结构，类型是 数组
    // 这是最核心的组件，其他都是围绕这个来进行操作的
    private long[] arr;

    // 表示有效数据的长度，也就是说，数组里有多少个数组
    private int elements;

    public MyArray() {
        // 默认可以存储50个数字
        arr = new long[50];
    }

    public MyArray(int maxsize) {
        arr = new long[maxsize];
    }

    // 插入数据
    public void insert(long value) {
        arr[elements] = value;

        // 每次插入数据，都会自增一次
        elements++;
    }

    // 根据索引，来查找数据
    public long get(int index) {
        if (index >= elements || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return arr[index];
    }

    // 显示数据，也就是，打印数组里的内容
    public void display() {

        // 说明，此时数组里，还没有内容呢
        if (elements <= 0) {
            return;
        }

        System.out.print("[ ");

        for (int i = 0; i < elements; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("]");
    }

}
