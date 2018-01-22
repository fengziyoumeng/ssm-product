package com.cn.wubin.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 测试volatile的可见性
 */
public class TestVolatile_KeJianXian {

    private static final Logger logger = LogManager.getLogger(TestVolatile_KeJianXian.class);

    private static boolean v;

    public static void main(String[] args) throws Exception{

        /**
         * 写法NO.1：
         * 这种写法有问题
         * 不能将启动线程程序放在while下面，不然永远进入死循环，到不了下面的启动线程程序
         *
                while(!v){
                    logger.info("V还是没有逃离死循环");
                }
                if(v){
                    logger.info("V已经逃离死循环~oh~yeah~");
                }

                Thread.sleep(5);

                new Thread(){
                    public void run(){
                        v = true;
                        logger.info("大家好，我是V，我已经变身了！");
                    }
                }.start();
         *
         */


        /**
         * 写法NO.2：
         * 这种写法ok的
         * 不能将启动线程程序放在while下面，不然永远进入死循环，到不了下面的启动线程程序

            new Thread(){
                public void run(){
                    try {
                        logger.info("我是线程，我在等待");
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    logger.info("大家好，我是V，我准备变身了！");
                    v = true;
                    logger.info("大家好，我是V，我已经变身了！");
                }
            }.start();

            logger.info("我不知道我有没有线程跑的快");
             while(!v){
                 logger.info("V还是没有逃离死循环");
             }
             if(v){
                 logger.info("V已经逃离死循环~oh~yeah~");
             }
         *
         */


        /**
         * 写法NO.3：
         * 这种写法ok的，也是最容易懂的
         * 不能将启动线程程序放在while下面，不然永远进入死循环，到不了下面的启动线程程序
         */

         new Thread(){
             public void run(){
                 logger.info("我不知道我有没有线程跑的快");
                 while(!v){
                     logger.info("V还是没有逃离死循环");
                 }
                 if(v){
                     logger.info("V已经逃离死循环~oh~yeah~");
                 }
             }
         }.start();

         Thread.sleep(1000); //这里睡眠1S是因为担心还没有进入死循环就已经变身了，那么就和先变身，永远进入不了死循环一样一样的

         new Thread(){
             public void run(){
                 logger.info("大家好，我是V，我准备变身了！");
                 v = true;
                 logger.info("大家好，我是V，我已经变身了！");
             }
         }.start();
    }
}
