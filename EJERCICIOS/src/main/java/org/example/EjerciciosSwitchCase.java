package org.example;

import java.util.Scanner;

public class EjerciciosSwitchCase {
    public void ejercicio1(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresar el numero del mes");

        int valor1 = teclado.nextInt();
        String mes ="";
        switch (valor1){
            case 1:
                mes ="enero";
                break;
            case 2:
                mes ="febrero";
                break;
            case 3:
                mes ="marzo";
                break;
            case 4:
                mes ="abril";
                break;
            case 5:
                mes ="mayo";
                break;
            case 6:
                mes ="junio";
                break;
            case 7:
                mes ="julio";
                break;
            case 8:
                mes ="agosto";
                break;
            case 9:
                mes ="septiembre";
                break;
            case 10:
                mes ="octubre";
                break;
            case 11:
                mes ="noviembre";
                break;
            case 12:
                mes ="diciembre";
                break;
        }
        if (valor1>12){
            System.out.println("error");
        }else {
            System.out.println("mes del año es: " + mes);
        }
    }
    public void ejercicio2(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresar el numero del mes");

        int valor1 = teclado.nextInt();
        System.out.println("ingresar el numero del dia");
        int valor2 = teclado.nextInt();
        String mes ="";

        switch (valor1){
            case 1:
            case 2:
            case 3:
                mes ="VERANO";
                if (valor1 ==3 && valor2>20) {
                    mes = "OTOÑO";
                }
                break;
            case 4:
            case 5:
            case 6:
                mes ="OTOÑO";
                if (valor1==6 && valor2>21){
                    mes = "INVIERNO";
                }
                break;
            case 7:
            case 8:
            case 9:
                mes = "INVIERNO";
                if (valor1==9 && valor2>22){
                    mes = "PRIMAVERA";
                }
                break;
            case 10:
            case 11:
            case 12:
                mes = "PRIMAVERA";
                if (valor1==12 && valor2>20){
                    mes= "VERANO";
                }
                break;
        }
        System.out.println("ESTACION " +mes);
    }
}
