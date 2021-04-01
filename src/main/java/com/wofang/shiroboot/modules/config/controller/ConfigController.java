package com.wofang.shiroboot.modules.config.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.wofang.shiroboot.modules.common.controller.BaseController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * nacos配置测试controller
 * @author youzhian
 */
@RequestMapping("config")
@RestController
public class ConfigController extends BaseController {

    @NacosValue(value = "${useLocalCache:false}",autoRefreshed = true)
    private boolean useLocalCache;

    @GetMapping("get")
    public Object get(){

        return success(useLocalCache);
    }
}
