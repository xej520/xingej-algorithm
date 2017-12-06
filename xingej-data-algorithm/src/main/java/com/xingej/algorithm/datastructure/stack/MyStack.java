package com.xingej.algorithm.datastructure.stack;

/**
 * java 不允许泛型数组， 因此，这里定义的MyStack不能使用的
 * 
 * @author erjun 2017年12月6日 上午9:41:12
 * @param <T>
 */
public class MyStack<T> {
    private T[] arr;

    // 栈允许最大的存储元素个数
    private int maxSize;

    private int top;

    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        // 这里会报错，java不允许泛型数组
        // arr = new T[];
        top = -1;
    }

    // 插入新元素
    public void push(T element) {
        arr[++top] = element; // 一定先累加指针，不然会覆盖以前的数据
    }

    // 从栈里弹出一个元素，一定是栈的顶部
    public T pop() {
        return arr[top--]; // 弹出元素后，再让指针减一
    }

    public T peek() {
        return arr[top]; // 返回当前栈的最顶部的元素
    }

    // 查看当前栈空间是否为空
    public boolean isEmpty() {
        return top == -1;
    }

    // 查看当前栈空间是否已经满了
    public boolean isFull() {
        return top == (maxSize - 1);
    }

}
