package com.domain;

import java.util.Set;

public class User {
    private Integer uid;

    private String username;

    private String password;

    private String name;

    private String email;

    private String phone;

    private String addr;

    private Integer state;

    private String code;

    private Set<Orders> orders;

    public void setOrders(Set<Orders> orders) {
        this.orders = orders;
    }

    public Set<Orders> getOrders() {
        return orders;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    @Override
    public String toString() {
        return "Person [id=" + uid + ", name=" + name + "]";
    }

    public User() {
        super();
    }

    public User(int uid, String name, Set<Orders> orders) {
        super();
        this.uid = uid;
        this.name = name;
        this.orders = orders;
    }



}