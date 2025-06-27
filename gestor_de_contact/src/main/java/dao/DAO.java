
package dao;

import modelo.Contacto;
import java.util.ArrayList;
import java.util.List;

public class DAO implements ContactoDAO {
    private List<Contacto> contactos = new ArrayList<>();

    
    

    @Override
    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    @Override
    public List<Contacto> listarContactos() {
        return contactos;
    }

    @Override
    public Contacto buscarPorNombre(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public void eliminarContacto(String nombre) {
        contactos.removeIf(c -> c.getNombre().equalsIgnoreCase(nombre));
    }
}

