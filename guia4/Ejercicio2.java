/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        String nombre;
        int edad;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        nombre = read.nextLine();
        while (nombre != "NO") {
            System.out.println("Ingrese la edad de la persona");
            edad = read.nextInt();
            if (retorno(edad) == true) {
                System.out.println(nombre + " es mayor de edad");
            } else {
                System.out.println(nombre + " es menor de edad");
            }
            System.out.println("Ingrese el nombre");
            nombre = read.nextLine();
        }

    }

    public static boolean retorno(int edad) {
        boolean respuesta;

        if (edad > 18) {
            respuesta = true;
        } else {
            respuesta = false;
        }
        return respuesta;
    }
}
