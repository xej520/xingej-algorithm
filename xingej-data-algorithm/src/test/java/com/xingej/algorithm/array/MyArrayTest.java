package com.xingej.algorithm.array;

import org.junit.Before;
import org.junit.Test;

/**
 * 面向对象编程，
 * 
 * 也就是说，你操作的 都是对象，而非基本数据类型了
 * 
 * 
 * @author erjun 2017年11月28日 下午9:59:36
 */
public class MyArrayTest {

    private MyArray myArray;

    @Before
    public void init() {
        myArray = new MyArray();
    }

    // 插入数据测试
    @Test
    public void test() {
        myArray.insert(20);
        System.out.println("----:\t" + myArray.get(0));
    }

}
