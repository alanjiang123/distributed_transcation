package com.example.demo.web.model;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2018/3/28.
 */
public class User {
    private Long id;
    private String userName;
    private String password;
    private BigDecimal surplusPirce;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getSurplusPirce() {
        return surplusPirce;
    }

    public void setSurplusPirce(BigDecimal surplusPirce) {
        this.surplusPirce = surplusPirce;
    }
}
