package com.imooc.controller;

import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Mr Wang
 * @date: 2019/6/19 20:43
 * @description:
 */
@RestController
@RequestMapping("/wechat")
@Slf4j
public class WeChatController {

    @Autowired
    private WxMpService wxMpService;

    @GetMapping("/authorize")
    public void authorize(@RequestParam("returnUrl") String returnUrl) {

        WxMpService wxMpService = new WxMpServiceImpl();
        //1. 配置
        //2. 调用方法
        wxMpService.oauth2buildAuthorizationUrl("", WxConsts.OAUTH2_SCOPE_USER_INFO);
    }

    @GetMapping("/userInfo")
    public void userInfo() {


    }

}
