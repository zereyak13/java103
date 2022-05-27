package com.zereyak.with_IoC_DI;

public class Boss implements BossInterface {

    @Override
    public  String version(String data){
        return "sürüm"+data;
    }
}
