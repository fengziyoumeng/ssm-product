package com.cn.wubin.controller;

//测试内部类
public class TestOutClass {

    // 内部类
    class InnerClass{
        int i = 1;
        private void innerMethod(){
            System.out.println("InnerClass-i："+i);//内部类有变量i就用内部类的变量
            System.out.println("InnerClass-i："+this.i);//内部类有变量i就用内部类的变量
            System.out.println("InnerClass-j："+j);//内部类没有这个变量，就去外部类中找
        }
    }

    // 外部类成员方法
    private void outMethod(){
        System.out.println("OutClass-i："+this.i);
        System.out.println("OutClass-i："+this.j);
    }

    // 外部类成员变量
    int i = 0;
    int j = 1;

    public static void main(String[] args) {
        TestOutClass OutClass = new TestOutClass();
        OutClass.outMethod();
        InnerClass innerClass = OutClass.new InnerClass();//通过外部类获得内部类的对象，注意这里的new
        innerClass.innerMethod();
    }
}