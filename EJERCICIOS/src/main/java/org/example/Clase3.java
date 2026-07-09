
package org.example;

import java.util.Scanner;

public class Clase3 {

    //mayor o menor de edad
    public void ejercicio1(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresar la edad");
        int edad = teclado.nextInt();
        if (edad>=18){
            System.out.println("es mayor de edad");
        }else {
            System.out.println("es menor de edad");
        }
    }

    //ordenar 3 números ascendente y descendente
    public void ejercicio2(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresar primer numero");
        int a = teclado.nextInt();
        System.out.println("ingresar segundo numero");
        int b = teclado.nextInt();
        System.out.println("ingresar tercer numero");
        int c = teclado.nextInt();

        int menor, medio, mayor;

        menor = a;
        mayor = a;
        if (b<menor) menor = b;
        if (c<menor) menor = c;
        if (b>mayor) mayor = b;
        if (c>mayor) mayor = c;
        medio = (a+b+c) - menor - mayor;

        System.out.println("ascendente " + menor + " " + medio + " " + mayor);
        System.out.println("descendente " + mayor + " " + medio + " " + menor);
    }

    //vector de 4 numeros, suma y promedio
    public void ejercicio3(){
        Scanner teclado = new Scanner(System.in);
        int numero[] = new int[4];
        int suma = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Numero " + (i+1) + ": ");
            numero[i] = teclado.nextInt();
            suma = suma + numero[i];
        }
        double promedio = suma / 4.0;
        System.out.println("suma " + suma);
        System.out.println("promedio " + promedio);
    }

    //matriz 3x2, promedio aritmetico
    public void ejercicio4(){
        Scanner teclado = new Scanner(System.in);
        int numero[][] = new int[3][2];
        int suma = 0;

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.println("NUMERO (" + i + "," + j + "): ");
                numero[i][j] = teclado.nextInt();
                suma = suma + numero[i][j];
            }
        }
        double promedio = suma / 6.0;
        System.out.println("promedio " + promedio);
    }
    //matriz 4x3/mayor numero de cada columna
    public void ejercicio5(){
        Scanner teclado = new Scanner(System.in);
        int numero[][] = new int[4][3];

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println("NUMERO (" + i + "," + j + "): ");
                numero[i][j] = teclado.nextInt();
            }
        }

        for (int j = 0; j <= 2; j++) {
            int mayor = numero[0][j];
            for (int i = 1; i <= 3; i++) {
                if (numero[i][j] > mayor){
                    mayor = numero[i][j];
                }
            }
            System.out.println("mayor de la columna " + j + ": " + mayor);
        }
    }
}