package com.zereyak.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named(value = "injectTuto")
@ApplicationScoped
public class _03_Inject {

    @Inject
    List<String> injector;

    public List<String> getInjector(){
        return injector;
    }
}
