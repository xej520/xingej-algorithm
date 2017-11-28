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
        testInsert();
    }

    // 插入数据测试
    @Test
    public void test() {
        myArray.insert(20);
        System.out.println("----:\t" + myArray.get(0));
    }

    @Test
    public void testInsert() {
        myArray.insert(20);
        myArray.insert(10);
        myArray.insert(5);
        myArray.insert(30);
    }

    // 显示/打印数组里的内容
    @Test
    public void testDisplay() {
        myArray.display();
    }

    // 显示/打印数组里的内容
    @Test
    public void testGetIndexByValue() {
        System.out.println("---索引值是:\t" + myArray.getIndexByValue(20));
    }

    // 根据下标，来删除指定位置的元素
    @Test
    public void testDelete() {
        System.out.println("---删除之前打印数组里的元素------");
        myArray.display();

        myArray.delete(5);

        System.out.println("---删除之后打印数组里的元素------");
        myArray.display();
    }

    @Test
    public void testUpdate() {
        myArray.update(2, 100);
        System.out.println("---更新之后的值----：\t" + myArray.get(2));
    }

}
