package com.zto.consumer.aop;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class IocContext implements ApplicationContextAware {
    private static ApplicationContext context;

    public static ApplicationContext getContext() {
        return context;
    }

    public static <T> T getBean(Class<T> requiredType) throws BeansException {
        return context.getBean(requiredType);
    }

    public static <T> T getBean(String name, Class<T> requiredType) {
        return context.getBean(name, requiredType);
    }

    public static <T> T getBean(String name, Object... args) {
        T bean = (T) context.getBean(name, args);
        return bean;
    }

    public static <T> T getBean(Class<T> requiredType, Object... args) {
        return context.getBean(requiredType, args);
    }


    public static Object getBean(String name) {
        return context.getBean(name);
    }

    public static Class<?> getType(String name) {
        return context.getType(name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;

    }
}
