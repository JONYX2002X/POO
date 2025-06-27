package main;

import controlador.ContactoController;
import factory.Factory;
import vista.ContactoVista;


public class Main {


    public static void main(String[] args) {
          System.out.println("App funcionando correctamente");
       ContactoController Controller = new ContactoController(Factory.crearContactoDAO());
       ContactoVista vista = new ContactoVista (Controller);
       vista.mostrarMenu();
    }
    
}
   

