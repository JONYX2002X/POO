
package factory;
import dao.ContactoDAO;
import dao.DAO;

public class Factory {
 public static ContactoDAO crearContactoDAO(){
      return new DAO();
}

}
