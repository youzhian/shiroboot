package com.wofang.shiroboot;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 项目启动类
 * @author youzhian
 */
@SpringBootApplication
@NacosPropertySource(dataId = "shiroboot",autoRefreshed = true)
public class ShiroBootApplication {
    /**
     * 入口
     * @param args
     */
    public static void main(String []args){
        SpringApplication.run(ShiroBootApplication.class,args);
    }
}
