package com.controler;

import com.alibaba.fastjson.JSON;
import com.domain.Orders;
import com.domain.User;
import com.domain.UserCustom;
import com.domain.UserQueryVo;
import com.service.IOrdersService;
import com.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.*;
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
        User user = new User();
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
        User user = userService.queryUserByID(7);
        System.out.println(user);
        System.out.println(user.getPassword());
    }

    //一对多，查询person（一）级联查询订单order（多）
    @Test
    public void testSelectPersonFetchOrder() throws Exception {

        User user = userService.selectPersonFetchOrder(7);
        System.out.println(user.toString());
        System.out.println(user.getOrders().size());
        for (Orders order : user.getOrders()) {
            System.out.println(order.toString());

        }

    }

    //多对一，查询订单order（多）级联查询person（一）
    @Test
    public void testSelectOrdersFetchPerson() throws Exception {
        Orders orders = orderService.selectOrdersFetchPerson(9000);
        System.out.println(orders.toString());
        System.out.println(orders.getUser().toString());

    }

    //订单分页查询,动态传参
    @Test
    public void testfindAllOrdersWithFy() throws Exception {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("pstart", 0);
        map.put("psize", 3);
        List<Orders> orders = orderService.findAllOrdersWithFy(map);
        for (Orders o : orders) {
            System.out.println(orders.toString());
            System.out.println(orders.size());
        }


    }


    // 测试if语句

    @Test
    public void findUserList() throws Exception {
        UserCustom userCustom = new UserCustom();
        userCustom.setUsername("bbb");
        userCustom.setState(1);
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(7);
        ids.add(8);
        ids.add(9);
        //将ids通过userQueryVo传入statement中
        UserQueryVo userQueryVo = new UserQueryVo();
        userQueryVo.setUserCustom(userCustom);
        userQueryVo.setIds(ids);
        List<UserCustom> userCustoms = userService.findUserList(userQueryVo);
        System.out.println(userCustoms);
    }


}
