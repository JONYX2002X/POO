package com.mycompany.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la cantidad de productos: ");
        int n = scanner.nextInt();

        
        int[] cantidades = new int[n];
        double[] costos = new double[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("Producto " + (i + 1) + ":");
            System.out.print("Cantidad: ");
            cantidades[i] = scanner.nextInt();

            System.out.print("Costo unitario: ");
            costos[i] = scanner.nextDouble();
        }

        
        double precioTotal = 0;

        System.out.println("\nProductos con subtotal mayor a $1000:");
        for (int i = 0; i < n; i++) {
            double subtotal = cantidades[i] * costos[i];
            precioTotal += subtotal;

            if (subtotal > 1000) {
                System.out.println("- Producto " + (i + 1) + ": $" + subtotal);
            }
        }

        
        System.out.println("\nPrecio total de todos los productos: $" + precioTotal);

        scanner.close();
    }
}
