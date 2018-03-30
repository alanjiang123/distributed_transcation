package com.example.demo.web.controller;

import com.example.demo.web.model.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/3/28.
 */
@RestController
@RequestMapping("/productinfo")
public class ProductController {
    @RequestMapping("/getaccountinfo")
    public Product getProductInfo(){
        return null;
    }
    @RequestMapping("/getproductsurpluscount")
    public Product getProductSurplusCount(){
        return null;
    }
    @RequestMapping("/updateproductsurpluscount")
    public Product updateProductSurplusCount(){
        return null;
    }
}
