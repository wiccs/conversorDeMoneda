package com.conversor.calculadora;


import com.conversor.monedas.Moneda;

public class Conversor {

    public Conversor(int cantidad,Double monedita){

        System.out.println(monedita);

        double result = monedita*cantidad;
        this.resultado = result;
    }

    double resultado;


    public double getResultado() {
        return resultado;
    }
}
