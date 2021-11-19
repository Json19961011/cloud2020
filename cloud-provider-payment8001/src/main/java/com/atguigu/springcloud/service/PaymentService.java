package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @Author:huang
 * @Date: Created in 2021/11/14 21:18
 * @Description：
 * @Version:1.0
 */
@Service
public interface PaymentService {
    public int create(Payment payment);
    public Payment getById(@Param("id") Integer id);
}
