package org.example;

public class EjercicioNumberFour {
    public int metodo(int numberOne, int numberTwo, Boolean type){
        int result = 0;
        if (type.equals(true)){
            result= numberOne-numberTwo;
           return result;
        }
        if (type.equals(false)){
             result= numberOne+numberTwo;
            return result;
        }
        return result;
    }
}
