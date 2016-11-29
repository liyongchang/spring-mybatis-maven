package com.controler;

import com.alibaba.fastjson.JSON;
import com.domain.User;
import com.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.logging.Logger;

/**
 * Created by sw on 2016/11/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
   // private ApplicationContext ac = null;
    private static Logger logger = Logger.getLogger("TestMyBatis");
    //  private ApplicationContext ac = null;
    @Resource
    private IUserService userService;

/*  @Before
  public void before() {
      ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
     userService = (IUserService) ac.getBean("userService");
 }*/


    /*public static void main(String[] args) {
         ApplicationContext ac=new ClassPathXmlApplicationContext("spring-mybatis.xml");
        System.out.println(ac);


    }
*/
    @Test
    public void test1() {
        User user=new User();
        user.setId("123");
        user.setSex("1");
        user.setName("lyc");
        user.setMessage("dd");
        user.setBirs(new Date());
        userService.insert(user);
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(user));
    }

}
