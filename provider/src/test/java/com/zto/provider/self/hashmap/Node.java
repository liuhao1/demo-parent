package com.zto.provider.self.hashmap;

/**
 * @ProjectName: demo-parent
 * @Description: 测试链表
 * @Author: liuhao
 * @CreateDate: 2020/7/31 15:37
 * @Version: 1.0
 */
public class Node<K, V> {
    final int hash;
    final K key;
    V value;
    Node<K, V> next;

    public Node() {
        this(null, null, null);
    }

    Node(K key, V value, Node<K, V> next) {
        this.hash = key.hashCode();
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public int getHash() {
        return hash;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Node<K, V> getNext() {
        return next;
    }

    public void setNext(Node<K, V> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "hash=" + hash +
                ", key=" + key +
                ", value=" + value +
                ", next=" + next +
                '}';
    }
}
