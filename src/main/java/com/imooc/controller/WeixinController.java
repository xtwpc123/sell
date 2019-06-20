package com.imooc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Mr Wang
 * @date: 2019/6/19 20:10
 * @description:
 */
@RestController
@RequestMapping("/weixin")
@Slf4j
public class WeixinController {

    @GetMapping("/auth")
    public void auth(@RequestParam("code") String code) {
        log.info("进入auth方法。。。");
        log.info("code={}", code);

        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=xxxx" + code + "xxx";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        log.info("response={}",response);
    }

}
