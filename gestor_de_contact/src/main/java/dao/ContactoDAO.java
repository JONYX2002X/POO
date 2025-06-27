
package dao;

import modelo.Contacto;
import java.util.List;

public interface ContactoDAO {
    void agregarContacto(Contacto contacto);
    List<Contacto> listarContactos();
    Contacto buscarPorNombre(String nombre);
    void eliminarContacto(String nombre);
}