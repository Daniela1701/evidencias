package org.example;

public class Estudiantes {
    private String nombre;
    private double nota;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
       if(nota>=0 && nota <=20){
           this.nota =nota;
       }else {
           System.out.println("NOTA INVALIDA DEBE SER DE 0 A 20");
       }
    }
}
