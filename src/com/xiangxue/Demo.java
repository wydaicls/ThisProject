package com.xiangxue;

/**
 * @Author:王亚栋
 * @Date:2021/10/24 12:52
 * @Version:1.0
 */
public class Demo {

    public static void main(String[] args) {

        Student student = new Student();
        student.setAge(12);
        student.setName("爱情");
        student.setSid(1);
        System.out.println(student.toString());
        student.outerClassMethod();
        Student.Book book = new Student().new Book();
        book.setBid(20);
        book.setBname("安全的书");
        System.out.println(book.toString());
        book.innerClassMethod();

    }
}
