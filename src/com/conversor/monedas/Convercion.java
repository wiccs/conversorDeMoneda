package com.conversor.monedas;

import com.conversor.conexion.HTTP;

public class Convercion {
    //Metodos para las converciones
    String base1;
    String base2;

    public void convertir(int seleccion){
        switch (seleccion){
            case 1:
                this.base1 = "USD";
                this.base2 = "MXN";
                break;
            case 2:
                this.base1 = "MXN";
                this.base2 = "USD";
                break;
            case 3:
                this.base1 = "USD";
                this.base2 = "BRL";
                break;
            case 4:
                this.base1 = "BRL";
                this.base2 = "USD";
                break;
            case 5:
                this.base1 = "USD";
                this.base2 = "COP";
                break;
            case 6:
                this.base1 = "COP";
                this.base2 = "USD";
                break;
        }
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
