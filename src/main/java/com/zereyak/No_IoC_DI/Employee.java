package com.zereyak.No_IoC_DI;

public class Employee {
    private Boss patron;
    public Employee(){
        patron = new Boss();
    }
    public String getData(String data){
        return patron.version("data: 17");
    }
}
