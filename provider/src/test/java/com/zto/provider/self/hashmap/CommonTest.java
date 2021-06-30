package com.zto.provider.self.hashmap;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @ProjectName: demo-parent
 * @Description: 普通测试类
 * @Author: liuhao
 * @CreateDate: 2020/5/21 15:39
 * @Version: 1.0
 */
public class CommonTest {
    @Test
    public void test() {
        Class clazz = String.class;
        HashMap<String, String> map = new HashMap<String, String>(2);
        map.put(null,null);
        String result = map.put("name", "xiaolliu");
        map.put("nice", "zhongguo");
        map.get("name");
        map.forEach((k, v) -> {
            System.out.println(String.format("%s:%s", k, v));
        });
        Map<String, String> mpp0 = new HashMap<String, String>(32);
        Map<String, String> mpp = new HashMap<String, String>(32, 0.75f);

    }

    public final int hashCode(String key, String value) {
        int keyhas = Objects.hashCode(key);
        int valuehas = Objects.hashCode(value);
        int aa = keyhas ^ valuehas;
        int bb = keyhas + valuehas;
        int a = 2;
        int cc = ~a;
        return Objects.hashCode(key) ^ Objects.hashCode(value);
    }

    @Test
    public void testHash() {
        int var2 = 1 << 30;
        System.out.println(var2);
        int max = 0x7fffffff;
        System.out.println(max);

        int threshold = 16;
        int oldThr = threshold;
        threshold = 32;
        System.out.println("123");

        int a = tableSizeFor(3);
        System.out.println(a);
        int four = 1 << 4;
        System.out.println("four：" + four);

    }

    @Test
    public void newNode() {
        CommonTest tet = new CommonTest();
        tet.g(" ");
        tet.g(1);
    }

    public <T> void f(T t) {
        System.out.println(t.getClass().getName());
    }

    public static <T> void g(T t) {
        System.out.println(t.getClass().getName());
    }

    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n = n | n >>> 2;
        n = n | n >>> 4;
        n = n | n >>> 8;
        n = n | n >>> 16;

//        n |= n >>> 1;
//        n |= n >>> 2;
//        n |= n >>> 4;
//        n |= n >>> 8;
//        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= 1 << 30) ? (1 << 30) : n + 1;
    }


    static class Node<K, V> implements Map.Entry<K, V> {
        final int hash;
        final K key;
        V value;
        CommonTest.Node<K, V> next;

        Node(int hash, K key, V value, CommonTest.Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public final K getKey() {
            return key;
        }

        public final V getValue() {
            return value;
        }

        public final String toString() {
            return key + "=" + value;
        }

        public final int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }

        public final V setValue(V newValue) {
            V oldValue = value;
            value = newValue;
            return oldValue;
        }

        public final boolean equals(Object o) {
            if (o == this)
                return true;
            if (o instanceof Map.Entry) {
                Map.Entry<?, ?> e = (Map.Entry<?, ?>) o;
                if (Objects.equals(key, e.getKey()) &&
                        Objects.equals(value, e.getValue()))
                    return true;
            }
            return false;
        }

    }

}
