package org.example;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Switch_case {
    public static void menu () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero dle 1 al 5: ");
        int producto = sc.nextInt();

        switch (producto)
        {
            case 1:
                System.out.println("Cafe: S/.");
                break;
            case 2:
                System.out.println("Te: S/.3.00 ");
                break;
            case 3:
                System.out.println("Sandwich: S/. 8.00");
            case 4:
                System.out.println("Pastel: S/. 6.00");
                break;
            case 5:
                System.out.println("Jugo: S/. 4.00 ");
                break;
            default:
                System.out.println("Producto no disponible");
        }
    }
}
