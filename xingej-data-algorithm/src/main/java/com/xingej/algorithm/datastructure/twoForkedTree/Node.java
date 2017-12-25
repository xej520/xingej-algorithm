package com.xingej.algorithm.datastructure.twoForkedTree;

/**
 * 节点类型
 * 
 * @author erjun 2017年12月25日 上午8:32:55
 */
public class Node {
    public int iData;

    public double dData;

    public Node leftChild;

    public Node rightChild;

    public void displayNode() {
        System.out.println("{");
        System.out.println(iData);
        System.out.println(",");
        System.out.println(dData);
        System.out.println("}");
    }
}
