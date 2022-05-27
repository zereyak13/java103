package com.zereyak.cdi;

//kapsam
//yaşam süresi
//performans - +

import javax.enterprise.context.*;
import javax.inject.Named;
import java.io.Serializable;

@Named
//@ApplicationScoped//Bütün uygulama boyunca ve bütün kullanıcılar için.
//@RequestScoped//1 istek için çalışır.
//@SessionScoped//Bir kullanıcı için yaşar. Logout ile sonlanır. //Serializable
//@Dependent//Bukalemun gibi , Çağırdığınız yere göre çalışma biçimi değişir.
//@ConversationScoped//Belirli istek boyunca yaşar.

public class _00_Scoped{
}
