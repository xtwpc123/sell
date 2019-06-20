package com.imooc.utils;

import java.util.Random;

/**
 * @author: Mr Wang
 * @date: 2019/6/1 20:00
 * @description:
 */

public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     * @return  时间戳+六位随机数
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        // 生成六位随机数
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
