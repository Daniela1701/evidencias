package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EjerciciosLambda {
    public void ejercicio1(){
        List<String> lenguajes = List.of("Java","python","c","c++");
        lenguajes.forEach(lenguaje -> System.out.println("lenguajes "+lenguaje));
    }
    public void ejercicio2(){
        List<Integer> number = List.of(1,2,3,4,5,6,7,8,9);
        List<Integer> pares = number.stream()
                .filter(num ->num%2==0)
                .collect(Collectors.toList());
        System.out.println("numeros pares: "+ pares);
    }
    public void ejercicio3(){
        List<String> nombres = List.of("ANA", "judith", "juan","daniela");
        nombres.stream().map(nombre -> nombre.toLowerCase()).forEach(System.out::println);
    }
    public void ejercicio4(){
        List<String> palabras = new ArrayList<>(List.of("Elefante","sol","lunass", "perro","gato"));
        palabras.sort(Comparator.comparingInt(String::length));
        System.out.println("ordenado por longitud" +palabras);
    }
    public void ejercicio4_1(){
        List<String> palabras = new ArrayList<>(List.of("Elefante","sol","lunass", "perro","gato"));
        List<String> ordenados = palabras.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("coleccion "+ordenados);
    }
}
