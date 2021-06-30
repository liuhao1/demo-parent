package com.zto.provider.entry;

/**
 * @ProjectName: demo-parent
 * @Description: 测试
 * @Author: liuhao
 * @CreateDate: 2020/7/7 13:14
 * @Version: 1.0
 */
public abstract class User {
    public abstract void who();

    public void say() {
        System.out.println("hello");
    }

    public void root() {
        System.out.println("user");
    }
}
