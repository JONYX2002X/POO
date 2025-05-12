

package com.mycompany.sanatorio;

import java.util.Scanner;

public class Sanatorio {

    public static void main(String[] args){
     
        try (Scanner Scanner = new Scanner (System.in)) {
            System.out.println("Ingreso de datos del Paciente Pediatricos");
            System.out.print("DNI:");
            String DNIP = Scanner.nextLine();
            System.out.print("nombre:");
            String nombreP = Scanner.nextLine();
            System.out.print("obra social:");
            String obrasocialP = Scanner.nextLine();
            System.out.print("peso:");
            Double pesoP = Scanner.nextDouble();
            Scanner.nextLine();
            System.out.print("celular:");
            String celularP = Scanner.nextLine();
            System.out.print("tutor:");
            String tutorP = Scanner.nextLine();
            
            Pediatricos p1 = new Pediatricos(DNIP, nombreP,  obrasocialP, pesoP, celularP, tutorP);
            
            
            System.out.println(" Ingreso de paciente Adultos ");
            System.out.print("DNI: ");
            String DNIA = Scanner.nextLine();
            System.out.print("nombre: ");
            String nombreA = Scanner.nextLine();
            System.out.print("Obra Social: ");
            String obrasocialA = Scanner.nextLine();
            System.out.print("presión arterial: ");
            double presionartirialA = Scanner.nextDouble();
            System.out.print("altura: ");
            double alturaA = Scanner.nextDouble();
            System.out.print("peso: ");
            double pesoA = Scanner.nextDouble();
            Scanner.nextLine();
            
            Adultos a1 = new Adultos(DNIA, nombreA, obrasocialA, presionartirialA, alturaA, pesoA);
            
            
            System.out.println(" Ingreso de paciente Internados ");
            System.out.print("DNI: ");
            String DNII = Scanner.nextLine();
            System.out.print("Nombre: ");
            String nombreI = Scanner.nextLine();
            System.out.print("Obra Social: ");
            String obrasocialI = Scanner.nextLine();
            System.out.print("Habitación: ");
            String habitacionI = Scanner.nextLine();
            System.out.print("presion arterial:");
            double presionarterialI = Scanner.nextDouble();
            Scanner.nextLine();
            System.out.print("Grupo RH: ");
            String rhI = Scanner.nextLine();
            
            Internados i1 = new Internados(DNII, nombreI, obrasocialI, habitacionI, presionarterialI, rhI);
            
            
            System.out.println("DATOS DE LOS PACIENTES ");
            
            p1.mostrardatos();
            System.out.println(p1.coberturadelaobrasocial());
            System.out.println("Dieta: " + p1.tipodedieta());
            System.out.println();
            
            a1.mostrardatos();
            System.out.println(a1.sangre());
            System.out.println();
            
            i1.mostrardatos();
            System.out.println(i1.tipodedieta());
            System.out.println(i1.rx());
        }
    }
}
    