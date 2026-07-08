package org.example;

public class EjerciciosClase2 {
    //numeros romanos
        public void ejercicio9(int numero) {
 //cadena vacia
            String romano = "";

            int millares = numero / 1000;
            int centenas = (numero % 1000) / 100;
            int decenas = (numero % 100) / 10;
            int unidades = numero % 10;

            switch (millares) {
                case 1: romano += "M"; break;
                case 2: romano += "MM"; break;
                case 3: romano += "MMM"; break;
            }

            switch (centenas) {
                case 1: romano += "C"; break;
                case 2: romano += "CC"; break;
                case 3: romano += "CCC"; break;
                case 4: romano += "CD"; break;
                case 5: romano += "D"; break;
                case 6: romano += "DC"; break;
                case 7: romano += "DCC"; break;
                case 8: romano += "DCCC"; break;
                case 9: romano += "CM"; break;
            }

            switch (decenas) {
                case 1: romano += "X"; break;
                case 2: romano += "XX"; break;
                case 3: romano += "XXX"; break;
                case 4: romano += "XL"; break;
                case 5: romano += "L"; break;
                case 6: romano += "LX"; break;
                case 7: romano += "LXX"; break;
                case 8: romano += "LXXX"; break;
                case 9: romano += "XC"; break;
            }

            switch (unidades) {
                case 1: romano += "I"; break;
                case 2: romano += "II"; break;
                case 3: romano += "III"; break;
                case 4: romano += "IV"; break;
                case 5: romano += "V"; break;
                case 6: romano += "VI"; break;
                case 7: romano += "VII"; break;
                case 8: romano += "VIII"; break;
                case 9: romano += "IX"; break;
            }

            System.out.println("Número romano: " + romano);
        }

//fruteria

        public void ejercicio12(double kilos, double precioKilo) {

            double compra = kilos * precioKilo;
            double descuento = 0;
            double total;

            if (kilos <= 2) {
                descuento = 0;
            } else if (kilos <= 5) {
                descuento = compra * 0.10;
            } else if (kilos <= 10) {
                descuento = compra * 0.20;
            } else {
                descuento = compra * 0.30;
            }

            total = compra - descuento;

            System.out.println("Monto de la compra: " + compra);
            System.out.println("Descuento: " + descuento);
            System.out.println("Total a pagar: " + total);
        }

//factorial
    public void ejercicio13(int numero) {

        int factorial = 1;
//recorre los numeros desde 1 hasta el numero que se ingrese
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial: " + factorial);
    }
//par e impar
    public void ejercicio14(int inicio, int fin) {

        int pares = 0;
        int impares = 0;
//recorre los numeros desde incio a fin
        for (int i = inicio; i <= fin; i++) {

            if (i % 5 != 0) {

                if (i % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }

            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }

    //sua multiplos de 3
    public void ejercicio15(int numero) {

        int suma = 0;
        int producto = 1;

        for (int i = 1; i <= numero; i++) {

            if (i % 3 == 0) {
                suma = suma + i;
                producto = producto * i;
            }

        }

        System.out.println("Suma: " + suma);
        System.out.println("Producto: " + producto);
    }

    //cantidad de digitos 0
    public void ejercicio16(int numero) {

        int contador = 0;
        while (numero > 0) {

            //obtiene el ultimo digito del numero
            if (numero % 10 == 0) {
                //aumenta el contador
                contador++;
            }

            //elimina el ultimo digito del numero
            numero = numero / 10;
        }

        System.out.println("Cantidad de ceros: " + contador);
    }
}


