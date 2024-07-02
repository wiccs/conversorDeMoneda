package com.conversor.principal;

import com.conversor.calculadora.Conversor;
import com.conversor.conexion.HTTP;
import com.conversor.menus.Menu;
import com.conversor.monedas.Convercion;
import com.conversor.monedas.Moneda;
import com.google.gson.Gson;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int entradaUsuario = 0;
        Scanner scanner = new Scanner(System.in);
        Menu presentacion = new Menu();
        HTTP conectarApi = new HTTP();
        Gson gson = new Gson();

        while (entradaUsuario != 7) {
            System.out.println(presentacion.getBienvenida());
            entradaUsuario = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            if (entradaUsuario == 7) {
                System.out.println("Saliendo del programa...");
                break; // Salir del bucle si la opción es 7
            }

            Convercion lanzarConversion = new Convercion();
            lanzarConversion.convertir(entradaUsuario);
            conectarApi.setBase1(lanzarConversion.getBase1());
            conectarApi.setBase2(lanzarConversion.getBase2());
            conectarApi.sendRequest();

            Moneda monedita = gson.fromJson(conectarApi.getJson(), Moneda.class);

            System.out.println(presentacion.getCantidad());
            int cantidad = scanner.nextInt();

            System.out.println("Cantidad = " + cantidad);
            System.out.println("Valor = " + monedita.getValor());

            Conversor calcular = new Conversor(cantidad, monedita.getValor());
            System.out.println("Resultado de conversión: " + calcular.getResultado());
        }

        scanner.close(); // Cerrar el scanner al finalizar el programa
    }
}

