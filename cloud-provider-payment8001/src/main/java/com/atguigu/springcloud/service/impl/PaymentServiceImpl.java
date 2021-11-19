package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * @Author:huang
 * @Date: Created in 2021/11/14 21:19
 * @Description：
 * @Version:1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;


    public int create(Payment payment) {
        return paymentDao.create(payment);
    }


    public Payment getById(Integer id) {
        return paymentDao.getById(id);
    }
}
