
package controlador;


import dao.ContactoDAO;
import modelo.Contacto;
import java.util.List;

public class ContactoController {
    private ContactoDAO dao;

    public ContactoController(ContactoDAO dao) { 
        this.dao = dao;
    }

    public void agregar(String nombre, String tel, String email) {
        dao.agregarContacto(new Contacto(nombre, tel, email));
    }

    public List<Contacto> obtenerTodos() {
        return dao.listarContactos();
    }

    public Contacto buscar(String nombre) {
        return dao.buscarPorNombre(nombre);
    }

    public void eliminar(String nombre) {
        dao.eliminarContacto(nombre);
    }
}


