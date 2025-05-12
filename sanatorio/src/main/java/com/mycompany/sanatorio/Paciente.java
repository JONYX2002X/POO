
package com.mycompany.sanatorio;


public abstract class Paciente {
    protected String DNI;
    protected String nombre;
    protected String obrasocial;
    
    public Paciente(String DNI,String nombre, String obrasocial){
         this.DNI = DNI;
         this.nombre=nombre;
         this.obrasocial=obrasocial;
    }          
    public abstract void mostrardatos(); 
 }
