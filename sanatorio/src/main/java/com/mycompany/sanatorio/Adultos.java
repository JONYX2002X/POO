
package com.mycompany.sanatorio;

public class Adultos extends Paciente implements Departamento_de_Administracion, Departamento_de_Clinica_Medica {
    private double presionarterial;
    private double altura;
    private double peso;

    public Adultos(String DNI, String nombre, String obrasocial, double presionArterial, double altura, double peso) {
        super(DNI, nombre, obrasocial);
        this.presionarterial = presionArterial;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public void mostrardatos() {
        System.out.println("Paciente Adulto: " + nombre + ", DNI: " + DNI);
    }

    @Override
    public String coberturadelaobrasocial() {
        return "Cobertura de la obra social " + obrasocial;
    }

    @Override
    public Double descuento() {
        return 5.0; // %
    }

    @Override
    public String vademecum() {
        return "vademécum .";
    }

    @Override
    public String rx() {
        return "Radiografía  solicitada";
    }

    @Override
    public String sangre() {
        return "analisis solicitado";
    }
}
