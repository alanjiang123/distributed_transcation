package com.example.demo.web.controller;

import com.example.demo.web.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2018/3/28.
 */
@RestController
@RequestMapping("/accountinfo")
public class AccountController {

    @RequestMapping("/getaccountinfo")
    public User getAccountInfo(){
        return null;
    }
    //查询用户余额
    @RequestMapping("/getaccountsurplusprice")
    public BigDecimal getAccountSurplusPrice(){
        return null;
    }
    //修改用户余额
    @RequestMapping("/updateaccountsurplusprice")
    public BigDecimal updateAccountSurplusPrice(){
        return null;
    }
}
