package org.example;

import java.util.Scanner;

public class Main {
   /*
   ejercicio numero en orden inverso
   public static void main(String[] args) {

        Scanner data = new Scanner(System.in);
        System.out.println("INGRESAR NUMERO 1 ");
        int ingresado1 = data.nextInt();
        System.out.println("INGRESAR NUMERO 2 ");
        int ingresado2 = data.nextInt();
        System.out.println("INGRESAR NUMERO 3 ");
        int ingresado3 = data.nextInt();
        System.out.println("INGRESAR NUMERO 4 ");
        int ingresado4 = data.nextInt();
        System.out.println("INGRESAR NUMERO 5 ");
        int ingresado5 = data.nextInt();

        System.out.println("Orden inverso:");
        System.out.println(ingresado5);
        System.out.println(ingresado4);
        System.out.println(ingresado3);
        System.out.println(ingresado2);
        System.out.println(ingresado1);

        data.close();

    }*/
//ejercicio dolares
   /* public static void main(String[] args) {

        Scanner data = new Scanner(System.in);
        System.out.println("Ingresar numero en soles");
        Double monto = data.nextDouble();
        Ejercicio2 ejercicios = new Ejercicio2();
        ejercicios.ejercicio6(monto);

        data.close();
    }
}*/

//ejercicio7

   /* public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = data.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int nummero2 = data.nextInt();

        Ejercicio2 ejercicios = new Ejercicio2();
        ejercicios.ejercicio7(numero1,nummero2);

        data.close();
    }
    */

    //ejercico 8
    /*public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        System.out.print("Ingrese el número 1: ");
        int num1 = data.nextInt();

        System.out.print("Ingrese el número 2: ");
        int num2 = data.nextInt();

        System.out.print("Ingrese el número 3: ");
        int num3 = data.nextInt();

        System.out.print("Ingrese el número 4: ");
        int num4 = data.nextInt();

        Ejercicio2 ejercicios = new Ejercicio2();
        ejercicios.ejercicio8 ( num1,  num2,  num3,num4);

        data.close();

    }*/

/*
    public static void main(String[] args) {
        Bucles ejercicios = new Bucles();
        ejercicios.ejercicio2_1();
    }
   */

  /*  public static void main(String[] args) {
        Matrices matrices=new Matrices();
        matrices.problema3();
    }*/
    //Obtener la cantidad de los primeros N números múltiplos de 5
   /* public static void methodWhile(){
        int n, i,c = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero: ");
        n= teclado.nextInt();
        i = 1;
        while (i<=n){
            if (i%5==0){
                c++;
            }
            i++;
        }
        System.out.printf("cantidad " + c);
    }*/

   /* private static void methodFor() {
        int n, c = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero: ");
        n = teclado.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i % 5 == 0) {
                c++;
            }
        }
        System.out.printf("cantidad " + c);
    }
*/
 /*   //romano
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        System.out.print("Ingrese un número menor a 4000: ");
        int numero = data.nextInt();

        if (numero < 1 || numero > 4000) {
            System.out.println("Ingrese un número entre 1 y 3999.");
            return;
        }

        EjerciciosClase2 ejercicios = new EjerciciosClase2();
        ejercicios.ejercicio9(numero);

        data.close();
    }*/

    /*
//fruteria
        public static void main(String[] args) {

            Scanner data = new Scanner(System.in);

            System.out.print("Ingrese los kilos de manzana: ");
            double kilos = data.nextDouble();

            System.out.print("Ingrese el precio por kilo: ");
            double precioKilo = data.nextDouble();

            EjerciciosClase2 ejercicios = new EjerciciosClase2();
            ejercicios.ejercicio12(kilos, precioKilo);

            data.close();
        }
*/
//factorial
  /*  public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = teclado.nextInt();

        EjerciciosClase2  ejercicios= new EjerciciosClase2();
        ejercicios.ejercicio13(numero);

        teclado.close();
    }*/
    //par e impar
    /*public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int inicio = teclado.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int fin = teclado.nextInt();

        EjerciciosClase2 ejercicios = new EjerciciosClase2();
        ejercicios.ejercicio14(inicio, fin);

        teclado.close();
    }*/
   /* public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = teclado.nextInt();

        EjerciciosClase2 ejercicios = new EjerciciosClase2();
        ejercicios.ejercicio15(numero);

        teclado.close();
    }*/

    //cantidad de digitos 0
   /* public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = teclado.nextInt();

        EjerciciosClase2 ejercicios = new EjerciciosClase2();
        ejercicios.ejercicio16(numero);

        teclado.close();
    }*/
   /* public static void main(String[] args){

        Clase3 clase3 = new Clase3();

        clase3.ejercicio1();
        //clase3.ejercicio2();
        //clase3.ejercicio3();
        //clase3.ejercicio4();
        //clase3.ejercicio5();
    }*/
//clase 09/07/2026----------------------------------------------
    public static void main(String[] args) {
        // Estudiantes est = new Estudiantes();
        // est.setNombre("FRANCO");
        // est.setNota(28.5);
        // System.out.println("ESTUDIANTE "+est.getNombre()+ " | NOTA: "+est.getNota());
        //  CuentaBancaria cuentaBancaria = new CuentaBancaria("CTA-0000",-300);
        //System.out.println("saldo "+ cuentaBancaria.getSaldo());

        //problema1
        // Problema1 problema1 = new Problema1();
        // problema1.convertirEdad();

        //problema2
        //  Problema2 problema2 = new Problema2();
        //  problema2.cantidadProductos();

        //Problema3

        //Problema3 problema3 = new Problema3();
        //  problema3.listaPaises();

        //Problema4

        // Problema4 problema4= new Problema4();
        //  problema4.descuento();

        //Problema5-Empleado

        Empleado empleado = new Empleado();
        empleado.setNombre("FRANCO");
        empleado.setSalario(500);
        System.out.println("NOMBRE: "+empleado.getNombre());
        System.out.println("SALARIO: S/. "+empleado.getSalario());

    }
}