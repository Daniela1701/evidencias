package org.example;

import java.util.Scanner;

public class EjercicioPracticos {
    public static class Variable{
        public void ejercicio1(){
            Scanner teclado = new Scanner(System.in);
            System.out.println("ingresar un numero");
            int valor = teclado.nextInt();
            if (valor>0){
                System.out.println("es positivo");
            } if (valor<0) {
                System.out.println("es negativo");
            }  if (valor==0) {
                System.out.println("es neutro");
            }
        }
        public void ejercicio2(){
            Scanner teclado2 = new Scanner(System.in);
            String valor = teclado2.next();

            if (valor.equals("A")){
                System.out.println("es una vocal");
            }else if (valor.equals("3")){
                System.out.println("es un numero");
            }else if (valor.contains("d")){
                System.out.println("tiene una d");
            }
        }
        public void ejercicios3(){
            Scanner teclado = new Scanner(System.in);
            System.out.println("ingresar un numero");
            int valor = teclado.nextInt();

            int multiplo1 = valor%5;
            int multiplo2 = valor%3;
            if (multiplo1==0 && multiplo2==0){
                System.out.println("es multiplo de ambos");
            } else if (multiplo2==0){
                System.out.println("es multiplo de 3");
            } else if (multiplo1==0) {
                System.out.println("es multiplo de 5");
            } else {
                System.out.println("no es multiplo de ninguno");
            }
        }
        public void ejercicio4(){
            Scanner teclado = new Scanner(System.in);
            System.out.println("ingresar primer numero");
            int valor1 = teclado.nextInt();
            System.out.println("ingresar segundo numero");
            int valor2 = teclado.nextInt();
            System.out.println("ingresar tercer numero");
            int valor3 = teclado.nextInt();

            if (valor1>valor2 && valor1>valor3){
                System.out.println("el numero mayor es: "+ valor1);
            }else if (valor2>valor1 && valor2>valor3){
                System.out.println("el numero mayor es: "+ valor2);
            }else if (valor3>valor1 && valor3>valor2){
                System.out.println("el numero mayor es: "+ valor3);
            }else {
                System.out.println("error");
            }
        }
    }

}
