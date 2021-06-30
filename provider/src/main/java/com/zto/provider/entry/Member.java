package com.zto.provider.entry;

import org.springframework.stereotype.Component;

/**
 * @ProjectName: demo-parent
 * @Description: 测试
 * @Author: liuhao
 * @CreateDate: 2020/7/7 13:15
 * @Version: 1.0
 */
@Component
public class Member extends User{

    @Override
    public void who() {
        System.out.println("member");
    }

    public void doSomething() {
        System.out.println("member doSomething");
    }

    public void getCompany() {
        System.out.println("zero tec");
    }
}