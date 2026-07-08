package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio2 {
    public void ejercicio() {
        int s, n;
        Scanner entrada = new Scanner(System.in);
        n = entrada.nextInt();
        s = (n * (n + 1)) / 2;
        System.out.println("el resultado es :" + s);
    }

    public void ejercicio2(int variable) {
        int hora = 3600;
        int minuto = 60;
        int horasTotales = variable / hora;
        int minutosTotales = variable / minuto;
        System.out.println("minutos " + minutosTotales);
        System.out.println("horas " + horasTotales);
        System.out.println("Segundos " + variable);
    }

    public Double ejercicio3(int variable) {
        Double area;
        area = 3.14 * (variable ^ 2);
        return area;
    }
//ejercicio dolares
    public Double ejercicio6(Double monto) {
        Double montoDolar = monto/3.40;
        Double montoEuro = monto/4.02;
        System.out.println("dolares " + montoDolar);
        System.out.println("euros " + montoEuro);
        return montoDolar;
    }
    //Hallar el cociente y el residuo(resto) de dos números enteros
    public void ejercicio7(int numero1, int numero2){
        int cociente = numero1/numero2;
        int residuo = numero1%numero2;
        System.out.println("residuo " + residuo);
        System.out.println("cociente " + cociente);

    }

    //porcentaje de 4 numeros ingresados y sumados
    public void ejercicio8(int num1, int num2, int num3, int num4) {

        int suma = num1 + num2 + num3 + num4;

        double porcentaje1 = (num1 * 100.0) / suma;
        double porcentaje2 = (num2 * 100.0) / suma;
        double porcentaje3 = (num3 * 100.0) / suma;
        double porcentaje4 = (num4 * 100.0) / suma;

        System.out.println("Suma: " + suma);
        System.out.println("Porcentaje del número 1: " + porcentaje1 + "%");
        System.out.println("Porcentaje del número 2: " + porcentaje2 + "%");
        System.out.println("Porcentaje del número 3: " + porcentaje3 + "%");
        System.out.println("Porcentaje del número 4: " + porcentaje4 + "%");
    }
}
