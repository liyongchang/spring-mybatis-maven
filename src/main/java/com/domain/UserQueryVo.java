package com.domain;

import java.util.List;

/**
 * Created by yongchang.li on 2017/2/16.
 */
public class UserQueryVo {

    //在这里包装所需要的查询条件
    //传入多个id
    private List<Integer> ids;

    //用户查询条件
    private UserCustom userCustom;

    public UserCustom getUserCustom() {
        return userCustom;
    }

    public void setUserCustom(UserCustom userCustom) {
        this.userCustom = userCustom;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }
}
