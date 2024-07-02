package com.conversor.menus;

public class Menu {
    private String bienvenida =
            """
                ***************************************************************
                Hola Bienbenido a este conversor de Monedas
                Por favor escriba el numero que corresponda con su moneda de cambio:
                
                1- Dólar =>> Peso Mexicano.
                2- Peso Mexicano =>> Dólar.
                3- Dolar =>> Real brasileño.
                4- Real brasileño =>> Dólar.
                5- Dólar =>> Peso colombiano.
                6- Peso colombiano =>> Dolar.
                7- Salir.              
                """;

    public String cantidad = """
            Ingrese la cantidad
            """;

    public String getBienvenida() {
        return bienvenida;
    }

    public String getCantidad(){
        return cantidad;
    }

}
