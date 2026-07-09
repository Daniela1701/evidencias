package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Problema3 {
    public void listaPaises(){
        List<String> paises = List.of( "Argentina", "Brasil", "Alemania", "Chile", "Australia");
        List<String> resultado = paises.stream()
                .filter(pais -> pais.startsWith("A"))
                        .collect(Collectors.toList());
        System.out.println("Países que comienzan con A: " + resultado);
    }
}

