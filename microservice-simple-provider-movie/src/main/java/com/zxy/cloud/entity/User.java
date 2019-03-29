package com.zxy.cloud.entity;

import java.math.BigDecimal;

/**
 * Created with zhangxy
 * User: lucky
 * Date: 2019/3/28
 * Time: 17:19
 * Description:
 */
public class User {
    private Long id;
    private String username;
    private String myname;
    private int age;
    private BigDecimal balance;

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getMyname() {
        return myname;
    }

    public int getAge() {
        return age;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setMyname(String myname) {
        this.myname = myname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
