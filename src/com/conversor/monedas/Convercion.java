package com.conversor.monedas;

import com.conversor.conexion.HTTP;

public class Convercion {
    //Metodos para las converciones
    String base1;
    String base2;
public void convercion1() {
     this.base1 = "USD";
     this.base2 = "MXN";

}

    public String getBase1() {
        return base1;
    }

    public void setBase1(String base1) {
        this.base1 = base1;
    }

    public String getBase2() {
        return base2;
    }

    public void setBase2(String base2) {
        this.base2 = base2;
    }
}
