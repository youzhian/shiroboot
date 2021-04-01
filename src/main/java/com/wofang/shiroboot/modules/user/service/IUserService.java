package com.wofang.shiroboot.modules.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wofang.shiroboot.modules.login.bean.LoginUser;
import com.wofang.shiroboot.modules.user.bean.UserInfo;

import java.util.List;

public interface IUserService extends IService<UserInfo> {

    List<UserInfo> queryUsers();

    LoginUser getLoginUserByPassword(String userName, String password);

    UserInfo getUserByLoginName(String userName);
}
