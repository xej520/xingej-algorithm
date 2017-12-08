package com.xingej.algorithm.datastructure.linkedList.singleLinkedList;

/**
 * 声明一个节点
 * 
 * @author erjun 2017年12月8日 上午8:41:50
 */
public class Node {
    private int iData;

    private double dData;

    // 不是private 哦，不然对象访问不了
    public Node next;

    public Node(int iData, double dData) {
        this.dData = dData;
        this.iData = iData;
    }

    public void displayLink() {
        System.out.println("{" + iData + ", " + dData + "}");
    }
}
