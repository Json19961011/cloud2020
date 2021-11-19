package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author:huang
 * @Date: Created in 2021/11/14 20:59
 * @Description：
 * @Version:1.0
 */
@Mapper
@Repository
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getById(@Param("id") Integer id);
}
