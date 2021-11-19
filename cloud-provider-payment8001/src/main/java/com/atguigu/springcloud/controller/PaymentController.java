package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.MyResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author:huang
 * @Date: Created in 2021/11/14 21:37
 * @Description：
 * @Version:1.0
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public MyResult create(@RequestBody Payment payment) {
        int i = paymentService.create(payment);
        log.info("插入结果" + i);
        if (i > 0) {
            return new MyResult(200, "插入成功");
        } else {
            return new MyResult(404, "插入失败", null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public MyResult getById(@PathVariable("id") Integer id) {
        Payment payment = paymentService.getById(id);
        log.info("插入结果" + payment);
        if (payment != null) {
            return new MyResult(200, "插入成功",payment);
        } else {
            return new MyResult(404, "插入失败", null);
        }
    }
}
