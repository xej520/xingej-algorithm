package com.xingej.algorithm.array;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * 面向过程编程
 * 
 * @author erjun 2017年11月28日 下午9:45:35
 */
public class ArrayTest extends TestCase {

    // 面向过程编程，全是基本类型的操作
    // 没有封装成对象
    @Test
    public void test() {
        long[] books = new long[] { 2, 5, 3 };

        System.out.println("----:\t" + books[0]);

        books[2] = 40;

        System.out.println("----:\t" + books[2]);

    }
}
