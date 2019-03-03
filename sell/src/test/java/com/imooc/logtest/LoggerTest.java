package com.imooc.logtest;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
//注解版输出日志
@Slf4j
public class LoggerTest {
//    //LoggerTest.class当前类
//    private final Logger logger= LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test01(){
//        logger.debug("debug........");
//        logger.info("info......");
//        logger.error("error......");

        String name = "imooc";
        String password ="123456";
        log.debug("debug........");
        log.info("name: {}, password: {}",name,password);
        log.info("info......");
        log.error("error......");


    }
}
