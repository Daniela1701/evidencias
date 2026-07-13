package org.example;

import java.util.Scanner;

public class If_else {
    public static void escuela (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar nota: ");
        int nota = sc.nextInt();

        if (nota < 0 || nota > 20){
            System.out.println("Ingrese un numero valido");
        } else if (nota >= 11) {
            System.out.println("Aprobado");

        } else {
            System.out.println("Desaprobado");
        }
    }
}
