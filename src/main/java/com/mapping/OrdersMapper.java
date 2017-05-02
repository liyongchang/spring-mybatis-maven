package com.mapping;

import com.domain.Orders;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component("ordersMapper")
public interface OrdersMapper {

    Orders selectOrdersFetchPerson(Integer oid);
    List<Orders> findAllOrdersWithFy(Map map);


}