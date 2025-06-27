
package vista;


import controlador.ContactoController;
import modelo.Contacto;

import java.util.List;
import java.util.Scanner;

public class ContactoVista {
    private ContactoController controller;
    private Scanner scanner = new Scanner(System.in);

    public ContactoVista(ContactoController controller) {
        this.controller = controller;
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n--- Gestor de Contactos ---");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Ver todos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1 -> agregar();
                case 2 -> listar();
                case 3 -> buscar();
                case 4 -> eliminar();
                case 5 -> System.out.println("Adios");
                default -> System.out.println("Opcion incorrecta.");
            }
        } while (opcion != 5);
    }

    private void agregar() {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Teléfono: ");
        String tel = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        controller.agregar(nombre, tel, email);
        System.out.println("Contacto agregado.");
    }

    private void listar() {
        List<Contacto> lista = controller.obtenerTodos();
        if (lista.isEmpty()) {
            System.out.println("No hay contactos.");
        } else {
            lista.forEach(System.out::println);
        }
    }

    private void buscar() {
        System.out.print("Nombre a buscar: ");
        String nombre = scanner.nextLine();
        Contacto c = controller.buscar(nombre);
        System.out.println(c != null ? c : "No encontrado.");
    }

    private void eliminar() {
        System.out.print("Nombre a eliminar: ");
        String nombre = scanner.nextLine();
        controller.eliminar(nombre);
        System.out.println("Si existía, fue eliminado.");
    }
}
