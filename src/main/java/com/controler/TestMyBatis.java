package com.controler;

import com.alibaba.fastjson.JSON;
import com.domain.Orders;
import com.domain.User;
import com.service.IOrdersService;
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
    @Resource
    private IOrdersService orderService;

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
        user.setName("lyc");
        user.setEmail("9958@qq.com");
        user.setPassword("122");
        user.setUsername("lyc");
        userService.insertUser(user);
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(user));
    }

    @Test
    public void TestselectUserByID() {
        User user=  userService.queryUserByID(7);
        System.out.println(user);
        System.out.println(user.getPassword());
    }

    //一对多，查询person（一）级联查询订单order（多）
    @Test
    public void testSelectPersonFetchOrder() throws Exception {

        User user=userService.selectPersonFetchOrder(7);
        System.out.println(user.toString());
        System.out.println(user.getOrders().size());
        for(Orders order:user.getOrders()){
            System.out.println(order.toString());

        }

    }

    //多对一，查询订单order（多）级联查询person（一）
    @Test
    public void testSelectOrdersFetchPerson() throws Exception{
        Orders orders=orderService.selectOrdersFetchPerson(9000);
        System.out.println(orders.toString());
        System.out.println(orders.getUser().toString());

    }




}
