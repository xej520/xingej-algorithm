package com.xingej.algorithm.datastructure.stack;

/**
 * 数据结构之栈Stack
 * 
 * 以long类型为测试用例
 * 
 * @author erjun 2017年12月4日 下午10:22:34
 */
public class LongStack {
    // 底层数据存储
    private long[] arr;

    // 最大元素数量
    private int maxSize;

    // 当前元素的指针
    private int top;

    public LongStack(int maxSize) {
        this.maxSize = maxSize;
        arr = new long[maxSize];
        top = -1;// 默认值为-1，栈里没有元素
    }

    // 添加数据
    public void push(long value) {
        arr[++top] = value;
    }

    // 查看、并删除元素数据
    public long pop() {
        return arr[top--]; // 先返回，然后，指针再减一
    }

    // 仅仅查看元素
    public long peek() {
        return arr[top];
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
