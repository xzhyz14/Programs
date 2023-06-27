package com.buchong.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode              //用于后期去重处理
public class Book {
    private Long id;            //id
    private String name;        //书名
    private String category;    //分类
    private Integer score;      //评分
    private String intro;       //简介
}
