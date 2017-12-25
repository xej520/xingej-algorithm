package com.xingej.algorithm.datastructure.twoForkedTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.junit.Test;

public class TreeTest {

    @Test
    public void test() throws Exception {
        int value;

        Tree theTree = new Tree();

        theTree.insert(50, 1.5);
        theTree.insert(25, 1.2);
        theTree.insert(75, 1.5);
        theTree.insert(12, 1.7);
        theTree.insert(37, 1.5);
        theTree.insert(51, 1.9);
        theTree.insert(52, 1.0);
        theTree.insert(53, 1.2);
        theTree.insert(63, 1.2);
        theTree.insert(73, 1.2);
        theTree.insert(83, 1.2);

        while (true) {
            System.out.println("---请输入一个小写的字符----:\t(insert,find,delete,traverse)");
            int choice = getChar();

            switch (choice) {
            case 'i':// 插入
                System.out.println("----请输入要插入的值----");
                value = getInt();
                theTree.insert(value, value + 0.9);
                break;

            case 'f':// 查找
                System.out.println("----请输入要查找的值----");
                value = getInt();
                Node node = theTree.find(value);

                if (null != node) {
                    System.out.println("---找到了---:\t");
                    node.displayNode();
                } else {
                    System.out.println("----没有查询到该值----");
                }

                break;

            case 'd':// 删除
                System.out.println("----请输入要删除的值----");

                value = getInt();

                boolean flag = theTree.delete(value);

                if (flag) {
                    System.out.println("---删除的数据项是:\t" + value);
                } else {
                    System.out.println("---没有删除成功-----");
                }

                break;

            case 't':// 遍历
                System.out.println("--请输入1,2,3----");
                value = getInt();
                theTree.traverse(value);
                break;

            default:
                System.out.println("--输入值无效----");
                break;
            }
        }

    }

    public static String getString() throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }

    public static char getChar() throws Exception {
        return getString().charAt(0);
    }

    public static int getInt() throws Exception {
        return Integer.parseInt(getString());
    }

}
