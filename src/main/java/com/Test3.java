package com;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author YZK
 * @Date 2024/7/6
 * @Desc
 */
public class Test3 {
    public static void main(String[] args) throws Exception {
        System.out.println("---------获取类上注解的数据----------");
        test01();
        System.out.println("---------获取成员方法上注解的数据----------");
        test02();
    }

    /**
     * 获取BookStore类上使用的Book注解数据
     */
    public static void test01() {
// 获得BookStore类对应的Class对象
        Class c = BookStore.class;
// 判断BookStore类是否使用了Book注解
        if (c.isAnnotationPresent(Book.class)) {
// 根据注解Class对象获取注解对象
            Book book = (Book) c.getAnnotation(Book.class);
// 输出book注解属性值
            System.out.println("书名：" + book.value());
            System.out.println("价格：" + book.price());
            System.out.println("作者：" + Arrays.toString(book.authors()));
        }
    }

    /**
     * 获取BookStore类成员方法buyBook使用的Book注解数据
     */
    public static void test02() throws Exception {
// 获得BookStore类对应的Class对象
        Class c = BookStore.class;
// 获得成员方法buyBook对应的Method对象
        Method m = c.getMethod("buyBook");
// 判断成员方法buyBook上是否使用了Book注解
        if (m.isAnnotationPresent(Book.class)) {
// 根据注解Class对象获取注解对象
            Book book = (Book) m.getAnnotation(Book.class);
// 输出book注解属性值
            System.out.println("书名：" + book.value());
            System.out.println("价格：" + book.price());
            System.out.println("作者：" + Arrays.toString(book.authors()));
        }
    }
}
