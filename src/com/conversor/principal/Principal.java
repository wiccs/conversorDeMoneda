package com.conversor.principal;

import com.conversor.conexion.HTTP;
import com.conversor.menus.Menu;
import com.conversor.monedas.Convercion;
import com.google.gson.Gson;

import java.util.Scanner;

public class Principal {
    public static void main (String[] Args){

        int entradaUsuario = 0;

        while ( entradaUsuario != 7){

            Scanner entrada = new Scanner(System.in);
            Menu presentacion = new Menu();
            System.out.println(presentacion.getBienvenida());
            entradaUsuario = entrada.nextInt();
            if(entradaUsuario == 1){
                Convercion LanzarConvercion = new Convercion();
                LanzarConvercion.convercion1();
                HTTP ConectarApi = new HTTP();

                ConectarApi.setBase1(LanzarConvercion.getBase1());
                ConectarApi.setBase2(LanzarConvercion.getBase2());

                ConectarApi.sendRequest();





            }

        }




    };
}
