package org.example;

import java.util.Scanner;

public class Problema2 {

    public void cantidadProductos() {

        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Ingrese la cantidad de productos: ");
            int cantidad = teclado.nextInt();

            System.out.println("Cantidad de productos: " + cantidad);

        } catch (Exception e) {
            System.out.println("Error: debe ingresar un número entero.");
        }

    }
}
