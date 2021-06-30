package com.zto.provider;

import com.zto.provider.entry.Leader;
import com.zto.provider.entry.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ApplicationTests {

    @Resource
    private Member member;
    @Resource
    private Leader leader;

    // 实现
    @Test
    public void test1() {
        System.out.println("---------------member---------------");
        member.who();
        System.out.println("---------------leader---------------");
        leader.who();
    }

    @Test
    public void test2() {
        // 继承
        System.out.println("---------------member---------------");
        member.say();
        // 重载
        System.out.println("---------------leader---------------");
        leader.say();
    }

    @Test
    public void test3() {
        System.out.println("---------------member---------------");
        member.root();
        System.out.println("---------------leader---------------");
        leader.root();
    }

    @Test
    public void test4() {
        // 独有方法
        System.out.println("---------------member---------------");
        member.doSomething();
        // 子类重写
        System.out.println("---------------leader---------------");
        leader.doSomething();
    }

    @Test
    public void test5() {
        System.out.println("---------------member---------------");
        member.getCompany();
        System.out.println("---------------leader---------------");
        leader.getCompany();
    }

    // 独有的方法
    @Test
    public void test6() {
        System.out.println("---------------leader---------------");
        leader.self();
    }
}