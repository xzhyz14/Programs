package com.buchong.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Author> authorList = getAuthor();
        //现在需要打印所有年龄小于18的作家的名字，并且要注意去重。
//        authorList.stream()//将集合转换为流
//                .distinct()//去重
//                .filter(author -> author.getAge() < 18)//筛选年龄小于18
//                .forEach(author -> System.out.println(author.getName()));//打印姓名
//        System.out.println("---------------------------------------------");

        //打印所有作家的姓名
//        authorList.stream()
//                .map(author -> author.getName())
//                .forEach(s -> System.out.println(s));

        //将所有作家年龄加1
//        authorList.stream()
//                .map(author -> author.getAge())
//                .map(age -> (age + 1))
//                .forEach((age) -> System.out.println(age));

        //将作家按照年龄进行排序
//        authorList.stream()
//                .distinct()
//                .sorted()
//                .forEach(author -> System.out.println(author.getAge()));

//        authorList.stream()
//                .distinct()
//                .sorted((o1, o2) -> o1.getAge() - o2.getAge())
//                .forEach(author -> System.out.println(author.getAge()));

        //对流中的元素按照年龄进行降序排序，并且要求不能有重复的元素，然后印其中年龄最大的两个作家的姓名。
//        authorList.stream()
//                .distinct()
//                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
//                .limit(2)
//                .forEach(author -> System.out.println(author.getName()));
//        //打印除了年龄最大的作家外的其他作家，要求不能有重复元素，并且按照年龄降序排序。
//        authorList.stream()
//                .distinct()
//                .sorted((o1,o2) -> o2.getAge()-o1.getAge())
//                .skip(1)
//                .forEach(author -> System.out.println(author.getName()));

        //打印所有书籍的名字。要求对重复的元素进行去重
//        authorList.stream()
//                .flatMap((Function<Author, Stream<Book>>) author -> author.getBooks().stream())
//                .distinct()
//                .forEach(book -> System.out.println(book.getName()));

        //打印现有数据的所有分类。要求对分类进行去重。不能出现这种格式：哲学，爱情
//        authorList.stream()
//                .flatMap(author -> author.getBooks().stream())
//                .distinct()
//                .flatMap(book -> Arrays.stream(book.getCategory().split("，")))
//                .distinct()
//                .forEach(category -> System.out.println(category));

////        打印这些作家的所出书籍的数目，注意删除重复元素。
//        long count = authorList.stream()
//                .flatMap(author -> author.getBooks().stream())
//                .distinct()
//                .count();
//        System.out.println(count);

//        //分别获取这些作家的所出书籍的最高分和最低分并打印。
//        Optional<Integer> max = authorList.stream()
//                .flatMap(author -> author.getBooks().stream())
//                .distinct()
//                .map(book -> book.getScore())
//                .distinct()
//                .max(((o1, o2) -> o1 - o2));
//        System.out.println(max.get());
//
//        Optional<Integer> min = authorList.stream()
//                .flatMap(author -> author.getBooks().stream())
//                .distinct()
//                .map(book -> book.getScore())
//                .distinct()
//                .min((o1, o2) -> o1 - o2);
//        System.out.println(min.get());

        //获取一个存放所有作者名字的List集合。
//        List<String> collect = authorList.stream()
//                .map(author -> author.getName())
//                .distinct()
//                .collect(Collectors.toList());
//        System.out.println(collect);

//        //获取一个所有书名的Set集合。
//        Set<Book> collect = authorList.stream()
//                .flatMap(author -> author.getBooks().stream())
//                .collect(Collectors.toSet());
//        System.out.println(collect);

//        //获取一个Map集合，map的hey为作者名，value为List Book
//        Map<String, List<Book>> map = authorList.stream()
//                .distinct()
//                .collect(Collectors.toMap(author -> author.getName(), author -> author.getBooks()));
//        System.out.println(map);

//        //判断是否有年龄在29以上的作家
//        boolean b = authorList.stream()
//                .distinct()
//                .anyMatch(author -> author.getAge() > 29);
//        System.out.println(b);

        //判断是否所有的作家都是成年人
//        boolean b = authorList.stream()
//                .distinct()
//                .allMatch(author -> author.getAge() >= 18);
//        System.out.println(b);

        //判断作家是否都没有超过100岁的。
//        boolean b = authorList.stream()
//                .distinct()
//                .noneMatch(author -> author.getAge() > 100);
//        System.out.println(b);

        //获取任意一个年龄大于18的作家，如果存在就输出他的名字
//        Optional<Author> optionalAuthor = authorList.stream()
//                .distinct()
//                .filter(author -> author.getAge() > 18)
//                .findAny();
//        optionalAuthor.ifPresent(author -> System.out.println(author.getName()));

        //获取一个年龄最小的作家，并输出他的姓名。
//        Optional<Author> first = authorList.stream()
//                .distinct()
//                .sorted(((o1, o2) -> o1.getAge() - o2.getAge()))
//                .findFirst();
//        first.ifPresent(author -> System.out.println(author.getName()));

        //使用reduce.求所有作者年龄的和
//        Integer sum = authorList.stream()
//                .map(author -> author.getAge())
//                .distinct()
//                .reduce(0, (identity, element) -> identity + element);
//        System.out.println(sum);


        //使用reduce求所有作者中年龄的最大值
//        Integer max = authorList.stream()
//                .map(author -> author.getAge())
//                .distinct()
//                .reduce(Integer.MIN_VALUE, (result, element) -> result < element ? element : result);
//        System.out.println(max);

        //便用reduce求所有作者中年龄的最小值
//        Integer min = authorList.stream()
//                .map(author -> author.getAge())
//                .distinct()
//                .reduce(Integer.MAX_VALUE, (result, element) -> result > element ? element : result);
//        System.out.println(min);

        Stream<Integer> distinct = authorList.stream()
                .map(author -> author.getAge())
                .distinct();
        Optional<Integer> max = distinct.max((o1, o2) -> o1 - o2);
        max.ifPresent(integer -> System.out.println(integer));
        Optional<Integer> min = distinct.min(((o1, o2) -> o2 - o1));
        min.ifPresent(integer -> System.out.println(integer));
    }

    private static List<Author> getAuthor() {
        //初始化数据
        Author author1 = new Author(1L, "蒙多", 35, "个从菜刀中明悟哲理的祖安人", null);
        Author author2 = new Author(2L, "亚拉索", 15, "狂风也追逐不上他的思考速度", null);
        Author author3 = new Author(3L, "易", 14, "是这个世界在限制他的思维", null);
        Author author4 = new Author(3L, "易", 14, "是这个世界在限制他的思维", null);

        //书籍列表
        List<Book> book1 = new ArrayList<>();
        List<Book> book2 = new ArrayList<>();
        List<Book> book3 = new ArrayList<>();

        book1.add(new Book(1L, "刀的两侧是光明与黑暗", "哲学，爱情", 88, "用一把刀划分了爱恨"));
        book1.add(new Book(2L, "一个人不能死在同一把刀下", "个人成长，爱情", 99, "讲述如何从失败中明悟真理"));

        book2.add(new Book(3L, "那风吹不到的地方", "哲学", 85, "带你用思维去领略世界的尽头"));
        book2.add(new Book(3L, "那风吹不到的地方", "哲学", 85, "带你用思维去领略世界的尽头"));
        book2.add(new Book(4L, "吹或不吹", "爱情，个人传记", 56, "一个哲学家的恋爱观注定很难把他所在的时代理解"));

        book3.add(new Book(5L, "你的剑就是我的剑", "爱情", 56, "无法想象一个武者能对他的伴侣这么的宽容"));
        book3.add(new Book(6L, "风与剑", "个人传记", 100, "两个哲学家灵魂和肉体的碰撞会激起怎么样的火花呢？"));
        book3.add(new Book(6L, "风与剑", "个人传记", 100, "两个哲学家灵魂和肉体的碰撞会激起怎么样的火花呢？"));

        author1.setBooks(book1);
        author2.setBooks(book2);
        author3.setBooks(book3);
        author4.setBooks(book3);

        List<Author> authorList = new ArrayList<>(Arrays.asList(author1, author2, author3, author4));
        return authorList;
    }

}
