package com.service.ipl;


import com.domain.Orders;
import com.domain.User;

import com.mapping.OrdersMapper;
import com.mapping.UserMapper;

import com.service.IOrdersService;
import com.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by sw on 2016/11/28.
 */
@Service("ordersService")
public class OrderServiceImpl implements IOrdersService {

    @Resource(name="ordersMapper")
    private OrdersMapper ordersMapper;


    public Orders selectOrdersFetchPerson(Integer oid) {
        return this.ordersMapper.selectOrdersFetchPerson(oid);
    }
}
