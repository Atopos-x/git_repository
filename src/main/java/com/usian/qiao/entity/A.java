package com.usian.qiao.entity;

import com.usian.qiao.entity.vo.B;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class A extends B{
    private Integer id;
    private String name;
    private String age;
}