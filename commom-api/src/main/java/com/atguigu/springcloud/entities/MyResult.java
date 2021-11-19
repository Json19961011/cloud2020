package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:huang
 * @Date: Created in 2021/11/14 20:54
 * @Description：
 * @Version:1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyResult<T> {
    private Integer code;
    private String message;
    private T data;

    public MyResult(Integer code, String message) {
        this(code, message, null);
    }
}

