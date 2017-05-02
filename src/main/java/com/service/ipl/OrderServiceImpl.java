package com.service.ipl;


import com.domain.Orders;

import com.mapping.OrdersMapper;

import com.service.IOrdersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

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
    public List<Orders> findAllOrdersWithFy(Map map){
        return this.ordersMapper.findAllOrdersWithFy(map);
    }

}
