
package com.mycompany.sanatorio;


public class Internados extends Paciente implements Departamento_de_Administracion, Departamento_de_Nutricion, Departamento_de_Clinica_Medica {
    private String habitacion;
    private double presionarterial;
    private String rh;

    public Internados(String DNI, String nombre, String obrasocial, String habitacion, double presionarterial, String rh) {
        super(DNI, nombre, obrasocial);
        this.habitacion = habitacion;
        this.presionarterial = presionarterial;
        this.rh = rh;
    }

    @Override
    public void mostrardatos() {
        System.out.println("Paciente Internado: " + nombre + ", Habitación: " + habitacion);
    }

    @Override
    public String coberturadelaobrasocial() {
        return "Cobertura de obra social " + obrasocial;
    }

    @Override
    public Double descuento() {
        return 15.0; // %
    }

    @Override
    public String vademecum() {
        return "Vademécum .";
    }

    @Override
    public String tipodedieta() {
        return "Dieta ";
    }

    @Override
    public String rx() {
        return "Radiografía solicitada";
    }

    @Override
    public String sangre() {
        return "Pruebas de laboratorio ";
    }

}  