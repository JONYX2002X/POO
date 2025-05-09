package com.mycompany.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TOTAL_CAMIONES = 30;

        
        String[] patentes = new String[TOTAL_CAMIONES];
        String[] choferes = new String[TOTAL_CAMIONES];
        String[] tiposCarga = new String[TOTAL_CAMIONES];
        String[] horasEgreso = new String[TOTAL_CAMIONES];

        int contadorTe = 0;

       
        for (int i = 0; i < TOTAL_CAMIONES; i++) {
            System.out.println("\nCamión " + (i + 1));

            System.out.print("Patente: ");
            patentes[i] = scanner.nextLine();

            System.out.print("Nombre y apellido del chofer: ");
            choferes[i] = scanner.nextLine();

            
            String tipo;
            while (true) {
                System.out.print("Tipo de carga (madera / yerba / té): ");
                tipo = scanner.nextLine().toLowerCase();
                if (tipo.equals("madera") || tipo.equals("yerba") || tipo.equals("té") || tipo.equals("te")) {
                    if (tipo.equals("té") || tipo.equals("te")) {
                        contadorTe++;
                    }
                    tiposCarga[i] = tipo;
                    break;
                } else {
                    System.out.println("Tipo de carga inválido. Intente nuevamente.");
                }
            }

            System.out.print("Hora de egreso: ");
            horasEgreso[i] = scanner.nextLine();
        }

        
        System.out.println("\n--- LISTADO DE CAMIONES ---");
        for (int i = 0; i < TOTAL_CAMIONES; i++) {
            System.out.println("\nCamión " + (i + 1));
            System.out.println("Patente: " + patentes[i]);
            System.out.println("Chofer: " + choferes[i]);
            System.out.println("Tipo de carga: " + tiposCarga[i]);
            System.out.println("Hora de egreso: " + horasEgreso[i]);
        }

        
        System.out.println("\nCantidad de camiones que transportan té: " + contadorTe);

        scanner.close();
    }
}

