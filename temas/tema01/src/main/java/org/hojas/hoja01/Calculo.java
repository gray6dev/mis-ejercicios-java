package org.hojas.hoja01;

import java.util.Scanner;

public class Calculo {

    Scanner entrada = new Scanner(System.in);

    public void metodo1() {
        boolean valido = false;
        int numero = 0;

        while(!valido) {
            try {
                System.out.println("Introduzca un numero entero, y le diremos si está entre 100 y 1000.");

                numero = Integer.parseInt(entrada.next());

            } catch() {

            }
        }
    }
}