

package com.mycompany.gestor_de_contact;
import controlador.ContactoController;
import factory.Factory;
import vista.ContactoVista;
public class Gestor_de_contact {

    public static void main(String[] args) {
       ContactoController Controller = new ContactoController(Factory.crearContactoDAO());
       ContactoVista vista = new ContactoVista (Controller);
       vista.mostrarMenu();
    }
    
}
