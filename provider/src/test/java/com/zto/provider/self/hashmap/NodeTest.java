package com.zto.provider.self.hashmap;

import org.junit.Test;

/**
 * @ProjectName: demo-parent
 * @Description: 测试链表
 * @Author: liuhao
 * @CreateDate: 2020/7/31 15:44
 * @Version: 1.0
 */
public class NodeTest {

    @Test
    public void testNode() {
        //链表数据
        Node e = getNode();
        int oldCap = 10;
        Node loHead = null, loTail = null;
        Node hiHead = null, hiTail = null;
        Node next;
        do {
            next = e.next;
            if ((e.hash & oldCap) == 0) {
                if (loTail == null)
                    loHead = e;
                else
                    loTail.next = e;
                loTail = e;
            } else {
                if (hiTail == null)
                    hiHead = e;
                else
                    hiTail.next = e;
                hiTail = e;
            }
        } while ((e = next) != null);
        if (loTail != null) {
            loTail.next = null;
//            newTab[j] = loHead;
        }
        if (hiTail != null) {
            hiTail.next = null;
//            newTab[j + oldCap] = hiHead;
        }

    }

    @Test
    public void test12Node() {
        Node e = getNode();
        System.out.println(e);
    }


    public Node getNode() {
        //头部链表1
        Node e = new Node<String, String>("one", "234", null);
        Node e2 = new Node<String, String>("two", "23", null);
        Node e3 = new Node<String, String>("three", "4545", null);
        Node e4 = new Node<String, String>("four", "654", null);
        Node e5 = new Node<String, String>("five", "788", null);
        Node e6 = new Node<String, String>("six", "9800", null);
        Node e7 = new Node<String, String>("seven", "134", null);
        Node e8 = new Node<String, String>("eight", "6547", null);
        e.next = e2;
        e2.next = e3;
        e3.next = e4;
        e4.next = e5;
        e5.next = e6;
        e6.next = e7;
        e7.next = e8;
        return e;
    }

}
