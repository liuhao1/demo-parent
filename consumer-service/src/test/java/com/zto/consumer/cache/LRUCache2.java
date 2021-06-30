package com.zto.consumer.cache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @ProjectName: demo-parent
 * @Description: lru算法基于linkedmap实现
 * @Author: liuhao
 * @CreateDate: 2021/5/4 19:23
 * @Version: 1.0
 */
public class LRUCache2<K, V> extends LinkedHashMap<K, V> {
    private static final int cacheSize = 3;


    public LRUCache2() {
        super(cacheSize, 0.75f, true);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > cacheSize;
    }
    public static void main(String[] args) {
        LRUCache2<Integer, Integer> cache = new LRUCache2<>();
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);
        cache.get(1);
        cache.put(4, 4);
        System.out.println(cache.keySet());
    }

}
