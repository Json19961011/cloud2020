package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.MyResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:huang
 * @Date: Created in 2021/11/14 22:36
 * @Description：
 * @Version:1.0
 */
@RestController
@Slf4j
public class OrderController {

    public static final String url = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/test")
    public MyResult<Payment> create(@RequestBody Payment payment) {
        System.out.println("aaaaaaaaaaaaaa");

        return restTemplate.postForObject(url + "/payment/create", payment, MyResult.class);
    }
}
