package com.service;
import com.domain.Orders;

import java.util.List;
import java.util.Map;


/**
 * Created by sw on 2016/11/28.
 */
public interface IOrdersService {

    public Orders selectOrdersFetchPerson(Integer oid);

    public List<Orders> findAllOrdersWithFy(Map map);
}
