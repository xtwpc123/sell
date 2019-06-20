package com;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: Mr Wang
 * @date: 2019/3/6 20:09
 * @description: 日志测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    @Test
    public void test1() {
        String name = "imooc";
        String password = "123456";
        log.debug("debug...");
        log.info("name: " + name + ", password: " + password);
        // 使用占位符的方式输出
        log.info("name: {}, password: {}", name, password);
        log.error("error...");
    }
}
