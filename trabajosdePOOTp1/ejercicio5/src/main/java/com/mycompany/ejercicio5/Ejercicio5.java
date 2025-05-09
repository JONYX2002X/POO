package com.mycompany.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TOTAL_CLIENTES = 5;

        
        for (int i = 0; i < TOTAL_CLIENTES; i++) {
            System.out.println("\nCliente " + (i + 1));

            
            System.out.print("Ingrese el DNI del cliente: ");
            String dni = scanner.nextLine();

            
            System.out.println("Seleccione el tipo de servicio:");
            System.out.println("1. Internet 30 megas - $750");
            System.out.println("2. Internet 50 megas - $1100");
            System.out.println("3. Internet 100 megas - $1500 (5% de descuento)");

            int servicio;
            while (true) {
                System.out.print("Ingrese el número de servicio (1, 2 o 3): ");
                servicio = Integer.parseInt(scanner.nextLine());
                if (servicio >= 1 && servicio <= 3) break;
                else System.out.println("Servicio inválido. Intente nuevamente.");
            }

            double monto = 0;
            switch (servicio) {
                case 1:
                    monto = 750;
                    break;
                case 2:
                    monto = 1100;
                    break;
                case 3:
                    monto = 1500 * 0.95; // 
                    break;
            }

            
            System.out.println("\n--- Factura del Cliente ---");
            System.out.println("DNI: " + dni);
            System.out.println("Tipo de servicio: " + servicio);
            System.out.println("Monto a pagar: $" + monto);
        }

        scanner.close();
    }
}
