package org.example;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        if (saldo>0){
            return saldo;
        }else {
            System.out.println("error saldo negativo");
        }
        return 0;
    }

    public void setSaldo(double saldo) {
        this.saldo=saldo;
    }
}
