package com.xingej.algorithm.datastructure.linkedList.singleLinkedList;

import org.junit.Test;

/**
 * 单链表测试
 * 
 * @author erjun 2017年12月8日 上午9:00:54
 */
public class LinkListTest {

    @Test
    public void test() {
        LinkList list = new LinkList();

        // 很明显，每次都是插入链表的第一个元素
        list.insertFirst(32, 8);
        list.insertFirst(3, 3);
        list.insertFirst(2, 6);
        list.insertFirst(42, 8);
        list.insertFirst(26, 9);

        list.displayList();
    }

}
