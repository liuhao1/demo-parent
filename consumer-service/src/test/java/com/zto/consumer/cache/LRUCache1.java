package com.zto.consumer.cache;

import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ProjectName: demo-parent
 * @Description: lru算法实现
 * @Author: liuhao
 * @CreateDate: 2021/5/4 18:48
 * @Version: 1.0
 */
public class LRUCache1 {
    /**
     * map缓存
     */
    private static final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();

    /**
     * 淘汰阀值
     */
    private int maxSize;
    /**
     * 计算链表
     */
    private LinkedList<String> list;

    public LRUCache1() {
        this(20);
    }

    public LRUCache1(int maxSize) {
        this.maxSize = maxSize;
        this.list = new LinkedList();
    }

    /**
     * 获取值
     * <p>1.将链表标记移除,并重置链表尾部</p>
     *
     * @param key
     * @return
     */
    public synchronized Object get(String key) {
        Object obj = concurrentHashMap.get(key);
        if (Objects.nonNull(obj)) {
            refreshLink(key);
        }
        return obj;
    }


    /**
     * @param key
     * @param val
     */
    public synchronized void put(String key, Object val) {
        //1.放入map
        concurrentHashMap.put(key, val);
        //2.添加标记
        refreshLink(key);
        //3.判断是否链表是否达到阀值
        if (this.list.size() > maxSize) {
            String s = this.list.removeFirst();
            System.out.println("移除：" + s);
            concurrentHashMap.remove(s);
        }
    }

    /**
     * 刷新标记链表
     *
     * @param key
     */
    private void refreshLink(String key) {
        System.out.println("使用更新：" + key);
        this.list.remove(key);
        this.list.add(key);
    }

    public static void main(String[] args) {
        LRUCache1 lruCache = new LRUCache1(2);
        lruCache.put("test1", "liu1");
        lruCache.put("test2", "liu2");
        lruCache.put("test3", "liu3");
        Object test2 = lruCache.get("test2");
        System.out.println(test2);

    }


}
