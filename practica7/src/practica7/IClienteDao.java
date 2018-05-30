package practica7;
	
 
import java.util.List;
 
 
public interface IClienteDao {
	//declaración de métodos para acceder a la base de datos
	public List<Cliente> obtenerClientes();
	public Cliente obtenerCliente(int id);
	public void actualizarCliente(Cliente cliente);
	public void eliminarCliente(Cliente cliente);
}