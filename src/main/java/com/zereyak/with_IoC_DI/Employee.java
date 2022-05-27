package com.zereyak.with_IoC_DI;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "cdsizCalisan")
@ApplicationScoped
public class Employee {
    private Boss patron;
    public Employee(){
        patron = new Boss();
    }
    public String getData(String data){
        return patron.version(data);
    }
}
