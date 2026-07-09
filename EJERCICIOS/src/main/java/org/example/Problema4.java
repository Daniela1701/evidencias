package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Problema4 {
    public void descuento() {

        List<Double> precios = List.of(10.0, 25.5, 50.0, 100.0);

        List<Double> preciosFinales = precios.stream()
                .map(precio -> precio * 0.15)
               // .map(precio -> precio * 0.85)

                .collect(Collectors.toList());

        System.out.println("Precios con descuento: " + preciosFinales);
    }
}
