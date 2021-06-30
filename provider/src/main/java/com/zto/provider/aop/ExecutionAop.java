//package com.zto.provider.aop;
//
//import org.aspectj.lang.annotation.Before;
//import org.springframework.stereotype.Component;
//import org.aspectj.lang.annotation.Aspect;
//
///**
// * @ProjectName: demo-parent
// * @Description: 测试
// * @Author: liuhao
// * @CreateDate: 2020/7/7 13:17
// * @Version: 1.0
// */
//@Aspect
//@Component
//class ExecutionAop {
//
//    @Before("@within(com.zto.provider.annotation.Secure)")
//    public void execute1(){
//        System.out.println("@within(com.zto.provider.annotation.Secure)");
//    }
//
//    @Before("execution(* com.zto..*(..)) && @target(com.zto.provider.annotation.Secure)")
//    public void execute2(){
//        System.out.println("@target(com.zto.provider.annotation.Secure)");
//    }
//
//}
