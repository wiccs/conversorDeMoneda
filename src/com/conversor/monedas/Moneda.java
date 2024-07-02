package com.conversor.monedas;

import com.google.gson.annotations.SerializedName;

public class Moneda {

    @SerializedName("conversion_rate")

    double valor;

    @Override
    public String toString() {
        return "Moneda{" +
                "valor=" + valor +
                '}';
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
