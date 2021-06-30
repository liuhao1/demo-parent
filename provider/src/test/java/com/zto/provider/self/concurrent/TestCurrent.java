package com.zto.provider.self.concurrent;

import org.junit.Test;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @ProjectName: demo-parent
 * @Description: 测试类
 * @Author: liuhao
 * @CreateDate: 2020/8/4 8:44
 * @Version: 1.0
 */
public class TestCurrent {

    @Test
    public void test() {
        ConcurrentHashMap map = new ConcurrentHashMap();
        map.put(null,null);
        map.put("name", "张三");
        map.put("nice", "李四");
        map.get("name");
        System.out.println(map);

    }
}
