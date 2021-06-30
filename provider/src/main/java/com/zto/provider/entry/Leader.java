package com.zto.provider.entry;

import org.springframework.stereotype.Component;

/**
 * @ProjectName: demo-parent
 * @Description: 测试
 * @Author: liuhao
 * @CreateDate: 2020/7/7 13:16
 * @Version: 1.0
 */
@Component
public class Leader extends Member{
    @Override
    public void say() {
        System.out.println("hello, members");
    }

    @Override
    public void who() {
        System.out.println("leader");
    }

    @Override
    public void doSomething() {
        System.out.println("leader doSomething");
    }

    public void self() {
        System.out.println("leader self");
    }
}
