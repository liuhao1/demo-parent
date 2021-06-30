package com.zto.consumer;

import com.zto.titans.common.annotation.EnableFramework;
import com.zto.titans.common.startup.Main;
import com.zto.titans.hbase.annotation.EnableHbase;
import com.zto.titans.soa.dubbo.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableFramework
@EnableDubbo
@EnableHbase //启用HbaseTemplate需要开启该注解
@ComponentScan(basePackages = "com.zto.consumer")
public class ConsumerApplication {

    public static void main(String[] args) {
        Main.run(ConsumerApplication.class, args);
//        SpringApplication.run(ConsumerApplication.class, args);
    }

}
