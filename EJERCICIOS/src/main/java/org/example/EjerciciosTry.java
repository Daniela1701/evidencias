package org.example;

public class EjerciciosTry {
    public void ejercicio1(){
        int numerador = 10, denominador=0;
        try{
            int resultado = numerador/denominador;
            System.out.println("Resultado: "+resultado);
        }catch(ArithmeticException e){
            System.out.println("error no es posible dividir con 0 "+e);
        }
    }
    public void ejercicio1_1(){
        int numerador = 10, denominador=0;
        int resultado = numerador/denominador;
        System.out.println("Resultado: "+resultado);
    }
    public void ejercicio2(){
        String[] nombres = {"Juan", "Peres","Lucho"};
        try {
            System.out.println("nombre 5: "+ nombres[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("error al acceder a la posicion "+ e);
        }

    }
    public void nulos(){
        String text = null;
        try {
            System.out.println("longitud del text "+ text);
        }catch (NullPointerException e){
            System.out.println("ERROR la variable es nula "+e);
        }
    }
    public void edadMinima(int edad){
        if (edad<18){
            throw new ArithmeticException("error edad no adecuada");
        }else {
            System.out.println("acceso concedido");
        }
    }
}
