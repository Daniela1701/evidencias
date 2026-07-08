package org.example;

import java.util.Scanner;

public class Bucles {
    //Obtener la suma de los primeros N números naturales positivo
    public void ejercicio1(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresar el numero natural positivo");

        int valor1 = teclado.nextInt();
        int contador = 1;
        int acumulador = 0;
        while (contador <=valor1){
            acumulador = acumulador+ contador;
            contador= contador+1;
        }
        System.out.println("Suma: "+ acumulador);
    }
    public void ejercicio1_2(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresar el numero natural positivo");

        int valor1 = teclado.nextInt();
        int acumulador =0;
        for (int i = 1; i <=valor1 ; i++) {
            acumulador= acumulador+i;
        }
        System.out.println("suma :"+ acumulador);
    }

    //Dado un rango de números enteros obtener la cantidad de números que contiene
    public void ejercicio2(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresar primer numero \n");
        int number1=teclado.nextInt();
        System.out.println("ingrese segundo numero \n");
        int number2=teclado.nextInt();
        int   i= number1+1;
        int cont = 0;
        while (i <= number2){
            i= i+1;
            cont++;
        }
        System.out.println("cantidad de numeros enteros "+ cont);
    }
    public void ejercicio2_1(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresar primer numero \n");
        int number1=teclado.nextInt();
        System.out.println("ingrese segundo numero \n");
        int number2=teclado.nextInt();
        int cont = 0;
        for (int i = number1+1; i <=number2; i++) {
            cont++;
        }
        System.out.println("resultado " + cont);
    }
}
