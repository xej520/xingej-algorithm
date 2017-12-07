package com.xingej.algorithm.datastructure.stack;

import org.junit.Test;

/**
 * 栈的特点：先进后出；
 * 
 * 栈和队列的区别？
 * 
 * 栈的主要组成：一个存数据的容器，如数组，或者链表；一个指针；其他API行为都是围绕容器进行的
 * 
 * 队列的主要组成：一个存数据的容器，如数组，或者链表；两个指针。
 * 
 * 不适合大量存储，只是实现某种算法的一种手段吧，
 * 
 * 受限访问方式
 * 
 * @author erjun 2017年12月6日 上午9:11:40
 */
public class LongStackTest {

    @Test
    public void test() {
        LongStack theStack = new LongStack(10);

        theStack.push(29);
        theStack.push(2);
        theStack.push(9);
        theStack.push(5);

        while (!theStack.isEmpty()) {
            System.out.print(theStack.pop() + " ");
        }
        System.out.println();

    }

}
