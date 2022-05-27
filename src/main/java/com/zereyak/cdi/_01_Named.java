package com.zereyak.cdi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

//Lombok components
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

//cdi => bean
@Named(value = "namedTuto")
@ApplicationScoped //uygulama çalıştığı sürece aktif olsun.
public class _01_Named {

    private Long namedId;
    private String namedData = "Merhabalar Cdi Bean";
}
