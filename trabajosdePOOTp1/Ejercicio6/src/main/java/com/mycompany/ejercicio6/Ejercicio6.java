package com.mycompany.ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TOTAL_COMPETIDORES = 12;

        int mejorauto = 0;
        double mejorTiempo = Double.MAX_VALUE;

        for (int i = 0; i < TOTAL_COMPETIDORES; i++) {
            System.out.println("\nCompetidor " + (i + 1));

            System.out.print("Ingrese el número de auto: ");
            int numeroauto = scanner.nextInt();

            System.out.print("Ingrese el tiempo en segundos: ");
            double tiempo = scanner.nextDouble();

            if (tiempo < mejorTiempo) {
                mejorTiempo = tiempo;
                mejorauto = numeroauto;
            }
        }

        
        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("El vehículo con mejor tiempo es el N° " + mejorauto);
        System.out.println("Tiempo realizado: " + mejorTiempo + " segundos");

        scanner.close();
    }
}
