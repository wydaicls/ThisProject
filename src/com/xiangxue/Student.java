package com.xiangxue;

/**
 * @Author:王亚栋
 * @Date:2021/10/24 12:53
 * @Version:1.0
 */
public class Student {

    private int sid;
    private String name;
    private int age;

    public void outerClassMethod(){
        System.out.println("outerClassMethod");
    }


    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public class Book{

        private int bid;
        private String bname;

        public int getBid() {
            return bid;
        }

        public void setBid(int bid) {
            this.bid = bid;
        }

        public String getBname() {
            return bname;
        }

        public void setBname(String bname) {
            this.bname = bname;
        }

        public void innerClassMethod(){
            System.out.println("innerClassMethod");
        }

        @Override
        public String toString() {
            return "Book{" +
                    "bid=" + bid +
                    ", bname='" + bname + '\'' +
                    '}';
        }
    }
}
