package com.controler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yongchang.li on 2017/2/8.
 */
public class MybatisFirst {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring-mybatis.xml");
        System.out.println(ac);


    }

}
