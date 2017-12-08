package com.xingej.algorithm.datastructure.linkedList.singleLinkedList;

/**
 * 声明一个链表的头部
 * 
 * 从链表头的使用，联想到hadoop，spark，netty中都有上下文context
 * 
 * @author erjun 2017年12月8日 上午8:45:08
 */
public class LinkList {
    private Node first;

    public LinkList() {
        // 初始链表时，指针引用为空
        first = null;
    }

    public void insertFirst(int iData, double dData) {
        // 创建一个新的链节点
        Node newLink = new Node(iData, dData);

        // 更新新创建的链节点next引用，也就是将头部引用，赋值给它
        newLink.next = first;

        // 更新链表头部的引用， 也就是将新创建的链节点的引用，赋值给头部引用
        first = newLink;

    }

    public boolean isEmpty() {
        return null == first;
    }

    public Node deleteFirst() {
        // 先缓存 被删除的第一个元素
        Node temp = first;

        // 链表，这种数据结构里，删除元素，只需要更新指针引用就可以了
        // 更新头部元素的引用
        first = first.next;

        return temp;
    }

    public void displayList() {
        System.out.println("List (first--->last):");

        Node current = first;

        while (null != current) {
            current.displayLink();

            // 获取下一个元素的引用， 在C语言里，称为指针
            current = current.next;
        }

        System.out.println();
    }

}
