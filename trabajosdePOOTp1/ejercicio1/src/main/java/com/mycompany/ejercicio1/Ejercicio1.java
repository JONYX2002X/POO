
package com.mycompany.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese la cantidad de notas: ");
        int n = scanner.nextInt();

       
        double[] notas = new double[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

     
        double notamasalta = notas[0];
        double suma = 0;

        for (int i = 0; i < n; i++) {
            if (notas[i] > notamasalta) {
                notamasalta = notas[i];
            }
            suma += notas[i];
        }

        double promedio = suma / n;

      
        System.out.println("La nota más alta es: " + notamasalta);
        System.out.println("El promedio de notas es: " + promedio);

        scanner.close();
    }
}
