package com.example.demo.config.static_resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Administrator on 2018/3/28.
 */
@Configuration
@PropertySource("staticObj.properities")
public class StaticObject {
    private static String accountServerName;
    private static String orderServerName;
    private static String prodoctServerName;

    @Value("${jp.accountServerName}")
    public void setAccountServerName(String accountServerName){
        accountServerName = accountServerName;
    }
    @Value("${jp.orderServerName}")
    public void setOrderServerName(String orderServerName){
        orderServerName = orderServerName;
    }
    @Value("${jp.prodoctServerName}")
    public void setProdoctServerName(String prodoctServerName){
        prodoctServerName = prodoctServerName;
    }

    public static String getAccountServerName(){
        return accountServerName;
    }
    public static String getOrderServerName(){
        return orderServerName;
    }
    public static String getProdoctServerName(){
        return prodoctServerName;
    }
}
