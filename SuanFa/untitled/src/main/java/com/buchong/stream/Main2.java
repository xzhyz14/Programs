package com.buchong.stream;


import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Main2 {
    public static void main(String[] args) {
        Author author = new Author(1L, "蒙多", 35, "个从菜刀中明悟哲理的祖安人", null);
//        Author author = null;
//        Optional<Author> optional = Optional.of(author);
//        optional.ifPresent(author1 -> System.out.println(author1.getName()));
//        Author author1 = optional.get();
//        System.out.println(author1.getName());

        Optional<Author> optional = Optional.ofNullable(author);
//        Author author1 = optional.orElseGet(() -> new Author());
//        System.out.println(author1.getName());

//        try {
//            Author author1 = optional.orElseThrow(() -> new RuntimeException("数据为null"));
//            System.out.println(author1.getName());
//        } catch (Throwable e) {
//            throw new RuntimeException(e);
//        }

//        optional.filter(author1 -> author1.getAge() > 18)
//                .ifPresent(author12 -> System.out.println(author12.getName()));

       optional.map(author1 -> author1.getName())
               .ifPresent(name -> System.out.println(name));


    }


}
