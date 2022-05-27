package com.zereyak.alternative;

public class Boss implements BossInterface {

    @Override
    public  String version(String data){
        return "sürüm"+data;
    }
}
