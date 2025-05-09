package com.mycompany.ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalCensados = 0;
        int cantidadVarones = 0;
        int cantidadMujeres = 0;
        int varonesEntre16y65 = 0;

        int edadMaxima = -1;
        int dniMayorEdad = 0;
        char sexoMayorEdad = ' ';
        
        while (true) {
            System.out.print("\nIngrese número de documento (0 para terminar): ");
            int dni = scanner.nextInt();

            if (dni == 0) {
                break; 
            }

            System.out.print("Ingrese edad: ");
            int edad = scanner.nextInt();

            System.out.print("Ingrese sexo (M o F): ");
            char sexo = scanner.next().toUpperCase().charAt(0);

            totalCensados++;

            if (sexo == 'M') {
                cantidadVarones++;
                if (edad >= 16 && edad <= 65) {
                    varonesEntre16y65++;
                }
            } else if (sexo == 'F') {
                cantidadMujeres++;
            }

            if (edad > edadMaxima) {
                edadMaxima = edad;
                dniMayorEdad = dni;
                sexoMayorEdad = sexo;
            }
        }

        
        double porcentajeVaronesEnRango = 0;
        if (cantidadVarones > 0) {
            porcentajeVaronesEnRango = (varonesEntre16y65 * 100.0) / cantidadVarones;
        }

        
        System.out.println("\n--- RESULTADOS DEL CENSO ---");
        System.out.println("Total de personas censadas: " + totalCensados);
        System.out.println("Cantidad de varones: " + cantidadVarones);
        System.out.println("Cantidad de mujeres: " + cantidadMujeres);
        System.out.println("Porcentaje de varones entre 16 y 65 años: " + porcentajeVaronesEnRango + "%");

        if (edadMaxima != -1) {
            System.out.println("Persona de mayor edad:");
            System.out.println("DNI: " + dniMayorEdad);
            System.out.println("Edad: " + edadMaxima);
            System.out.println("Sexo: " + sexoMayorEdad);
        }

        scanner.close();
    }
}
