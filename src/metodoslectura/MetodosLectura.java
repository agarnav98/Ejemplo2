/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodoslectura;

import java.util.Scanner;

/**
 *
 * @author Algoritmo hecho por Alberto García Navarro 
 * 1ºCFGS DAW Curso 2021-2022.
 */
public class MetodosLectura {

    /**
     * @param args the command line arguments
     */
    
    //Método para leer números enteros.
    public static int leerInt(String cadena) {
        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.print(cadena);

        numero = sc.nextInt();

        return numero;
    }

    //Método para leer números reales.
    public static double leerDouble(String cadena) {
        double numero;

        Scanner sc = new Scanner(System.in);

        System.out.print(cadena);

        numero = sc.nextDouble();

        return numero;
    }

    //Método para leer cadenas.
    public static String leerString(String cadena) {
        String palabra;

        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        do {
            System.out.print(cadena);

            palabra = sc.nextLine();

        } while (palabra.equals(""));

        return palabra;
    }

    //Método main donde comprobamos que los métodos funcionan.
    public static void main(String[] args) {
        int edad = leerInt("Dime tu edad: ");

        double peso = leerDouble("Dime tu peso: ");

        String nombre = leerString("Dime tu nombre: ");

        System.out.println(String.format("Tienes %d años, pesas %.2f kg y te llamas %s.",
                edad, peso, nombre));
    }

}
