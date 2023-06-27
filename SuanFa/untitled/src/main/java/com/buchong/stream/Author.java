package com.buchong.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Comparator;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode              //用于后期去重使用
public class Author{
    private Long id;            //id
    private String name;        //姓名
    private Integer age;        //年龄
    private String intre;       //简介
    private List<Book> books;   //作品

}
