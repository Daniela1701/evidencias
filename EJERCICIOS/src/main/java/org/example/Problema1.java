package org.example;

public class Problema1 {

    public void convertirEdad() {

        //String edad = "20";
          String edad = "veinte";

        try {
            int edadEntera = Integer.parseInt(edad);
            System.out.println("La edad es: " + edadEntera);
        } catch (NumberFormatException e) {
            System.out.println("Error: la edad debe contener solo números.");
        }

    }

}
