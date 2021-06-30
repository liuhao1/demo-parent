package com.zto.consumer.swg.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ProjectName: base-parent
 * @Description: 配置
 * @Author: liuhao
 * @CreateDate: 2020/11/24 15:26
 * @Version: 1.0
 */
@Component
@Configuration
@EnableSwagger2
@Slf4j
public class ServiceConfig {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zto.consumer.swg.controller"))
                .paths(PathSelectors.any())
                .build();
    }
}
