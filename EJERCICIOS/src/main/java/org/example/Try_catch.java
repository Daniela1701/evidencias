package org.example;

import java.util.Scanner;

public class Try_catch {
    public static void division () {
        Scanner sc =new Scanner(System.in);

        try {
            System.out.print("Ingresar primer numero:");
            int numero1 = sc.nextInt();

            System.out.print("Ingresar segundo numero:");
            int numero2 = sc.nextInt();

            int division = numero1/numero2;

            System.out.println("la division es: " +division);

        } catch (Exception exception){
            System.out.println("El residuo es 0" );

        }

    }

    public static void edad()
    {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Ingresar edad: ");
            int edad = sc.nextInt();
            if (edad < 18){
                throw new ArithmeticException("La edad debe ser mayor a 18");
            }
        }
        catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException.getMessage());

        }
    }
}

