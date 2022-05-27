package com.zereyak.with_IoC_DI;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "cdliCalisan")
@ApplicationScoped
public class Employee {
    @Inject
    private BossInterface bossInterface;
    public Employee(){

        //bossInterface = new Boss();
    }
    public String getData(String data){
        return bossInterface.version(data);
    }
}
