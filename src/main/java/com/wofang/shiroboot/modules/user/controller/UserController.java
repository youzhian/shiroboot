package com.wofang.shiroboot.modules.user.controller;

import com.wofang.shiroboot.modules.common.controller.BaseController;
import com.wofang.shiroboot.modules.user.bean.UserInfo;
import com.wofang.shiroboot.modules.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController extends BaseController {

    @Autowired
    private IUserService userService;

    @GetMapping("queryUsers")
    public Object queryUsers(){
        List<UserInfo> users = userService.queryUsers();
        return success("查询成功",users);
    }


}
