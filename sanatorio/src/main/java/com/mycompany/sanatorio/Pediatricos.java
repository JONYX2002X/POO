
package com.mycompany.sanatorio;


public  class Pediatricos extends Paciente implements Departamento_de_Administracion , Departamento_de_Nutricion {
private   double peso;
private   String celular;
private  String tutor;
   
    
public Pediatricos (String DNI, String nombre, String obrasocial, double peso , String celular , String tutor){
        
  super (DNI, nombre, obrasocial);
  
  this.peso = peso;
  this.celular  = celular;
  this.tutor  = tutor;
}

    @Override
    public void mostrardatos() {
       System.out.println("Paciente Pediatricos" + nombre +", DNI" + DNI );
    }
       
@Override
    public Double descuento() {
        return 10.0; //%
    }

@Override
    public String vademecum() {
        return "Vademécum ";
    }
    
@Override
    public String tipodedieta() {
        return "Dieta infantil ";
    }

    @Override
    public String coberturadelaobrasocial() {
     return "cobertura de obra social " + obrasocial;
    }
}
