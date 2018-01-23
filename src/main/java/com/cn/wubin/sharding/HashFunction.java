package com.cn.wubin.sharding;

public class HashFunction {

    public int user(String username){
        int result = Math.abs(username.hashCode()%1024);
        if(0<=result && result<=255){
            return 1;
        }else if(256<=result && result<=511){
            return 2;
        }else if(512<=result && result<=767){
            return 3;
        }else if(768<=result && result<=1023){
            return 4;
        }
        return result;
    }
}
