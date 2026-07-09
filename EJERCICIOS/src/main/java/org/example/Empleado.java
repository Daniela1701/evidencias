package org.example;

public class Empleado {
    private String nombre;
    private double salario;


    public String getNombre() {
        return nombre;
    }
    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSalario(double salario) {

        if (salario >= 1020) {
            this.salario = salario;
        } else {
            System.out.println("Advertencia: el salario no puede ser menor a S/ 1,020.00");
        }

    }

}





