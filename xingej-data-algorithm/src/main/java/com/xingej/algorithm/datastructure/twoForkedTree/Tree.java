package com.xingej.algorithm.datastructure.twoForkedTree;

/**
 * 创建二叉树
 * 
 * @author erjun 2017年12月25日 上午8:33:14
 */
public class Tree {
    // 二叉树，有一个根节点
    public Node root;

    public Tree() {
        root = null;
    }

    // 插入节点
    public void insert(int id, double dd) {
        Node newNode = new Node();

        newNode.iData = id;
        newNode.dData = dd;

        // 如果当前的树一个节点都没有的话，就把当前的节点，当做根
        if (null == root) {// 树是空的
            root = newNode;

        } else {// 存在节点，需要查找
            Node current = root;// 当前节点为根节点
            Node parent;
            while (true) {
                parent = current; // 为当前节点

                if (id < current.iData) {// 要插入节点的id值 小于当前节点的iData值
                    current = current.leftChild;// 那么，当前节点，需要移动到左子节点上去

                    // 说明，没有左子节点了
                    if (null == current) {
                        parent.leftChild = newNode;
                        return;// 返回
                    }
                } else {
                    current = current.rightChild;
                    if (null == current) {
                        parent.rightChild = newNode;
                        return;
                    }

                }

            }

        }

    }

    // ---删除节点
    public boolean delete(int key) {
        Node current = root;
        Node parent = root;

        boolean isLeftChild = true;

        // 查询要删除的元素是否存在？
        // 退出循环的条件：current.iData 等于 key
        while (current.iData != key) {
            parent = current;

            if (key < current.iData) {// 往左边开始搜索
                isLeftChild = true;
                current = current.leftChild;
            } else {
                isLeftChild = false;// 往右边开始搜索
                current = current.rightChild;
            }

            if (null == current) {
                return false; // 没有找到要删除的节点
            }

        }
        // 走到这里，说明，已经找到要删除的元素了current.iData 等于 key
        if (null == current.leftChild && null == current.rightChild) {// 删除的是叶子节点
            if (current == root) {// 删除的是根节点，并且没有子节点
                root = null;
            } else if (isLeftChild) {
                parent.leftChild = null;
            } else {
                parent.rightChild = null;
            }
        } else if (null == current.rightChild) {// 要删除的节点只有一个左子节点
            if (current == root) {
                root = current.leftChild;
            } else if (isLeftChild) {
                parent.leftChild = current.leftChild;
            } else {
                parent.rightChild = current.leftChild;
            }
        } else if (null == current.leftChild) { // 要删除的节点只有一个右子节点
            if (current == root) {// 当前是根元素
                root = current.rightChild;
                // 将子节点往上移动
            } else if (isLeftChild) {
                parent.leftChild = current.rightChild;
            } else {
                parent.rightChild = current.rightChild;
            }
        } else {
            // 要删出的节点有两个子节点
            Node successor = getSuccessor(current);

            if (current == successor) {
                root = successor;
            } else if (isLeftChild) {
                parent.leftChild = successor;
            } else {
                parent.rightChild = successor;
            }

            successor.leftChild = current.leftChild;
        }

        return true;

    }

    // 向右子节点下找继承者节点
    private Node getSuccessor(Node delNode) {
        // 保存继承者的父节点
        Node successorParent = delNode;
        // 声明继承者
        Node successor = delNode;

        Node current = delNode.rightChild;

        while (null != current) {
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }

        if (successor != delNode.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }

        return successor;
    }

    // 查询节点
    public Node find(int key) {
        Node current = root;

        while (current.iData != key) {
            if (key < current.iData) {
                current = current.leftChild; // 往左边查询
            } else {
                current = current.rightChild; // 往右边查询
            }

            if (null == current) {
                return null;// 未查询到此值
            }
        }

        // 循环结束后，说明查询到了
        return current;
    }

    // 遍历
    public void traverse(int traverseType) {
        switch (traverseType) {
        case 1:
            System.out.print("----从上往下，从左往右----");
            preOrder(root);
            break;
        case 2:
            System.out.print("----从下往上，从左往右---从小到大排序----");
            inOrder(root);
            break;

        case 3:
            System.out.print("----从下往上，从右往左-------");
            postOrder(root);
            break;
        default:
            break;
        }

        System.out.println();
    }

    private void preOrder(Node localRoot) {

        if (null != localRoot) {
            System.out.print(localRoot.iData + " ");
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }

    }

    // 从小到大排序
    private void inOrder(Node localRoot) {
        if (null != localRoot) {
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.iData + " ");
            inOrder(localRoot.rightChild);
        }
    }

    private void postOrder(Node localRoot) {
        if (null != localRoot) {
            postOrder(localRoot.rightChild);
            postOrder(localRoot.leftChild);
            System.out.print(localRoot.iData + " ");
        }
    }

}
