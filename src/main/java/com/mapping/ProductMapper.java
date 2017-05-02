package com.mapping;

import com.domain.Product;

public interface ProductMapper {


    int deleteByPrimaryKey(Integer pid);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer pid);

    Product findAllProductWithFy(Integer pid);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}