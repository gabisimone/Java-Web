package practica7;

	import java.util.ArrayList;
	import java.util.List;
	 
	 
	public class ItemDAO implements IClienteDao {
		
		//lista de tipo cliente
		List<Cliente> clientes;
		
		List<String> DJs;
		List<String> vinos;
		
		
		
		//inicializar los objetos cliente y añadirlos a la lista
		public ItemDAO() {
			clientes = new ArrayList<>();
			Cliente cliente1 = new Cliente(0,"Javier", "Molina");
			clientes.add(cliente1);
			clientes.add(cliente2);
			vinos = new ArrayList<>();
			vinos.add("tinto Cabernet Malbec");

		
		}

		public void agregarCliente(Cliente cli) {
			clientes.add(cli);
			
		}
		
		//obtener todos los clientes
		@Override
		public List<Cliente> obtenerClientes() {
			return clientes;
		}
		
		//obtener un cliente por el id
		@Override
		public Cliente obtenerCliente(int id) {
			return clientes.get(id);
		}
		
		//actualizar un cliente
		@Override
		public void actualizarCliente(Cliente cliente) {
			clientes.get(cliente.getId()).setNombre(cliente.getNombre());
			clientes.get(cliente.getId()).setApellido(cliente.getApellido());
			System.out.println("Cliente con id: "+cliente.getId()+" actualizado satisfactoriamente");
		}
		
		//eliminar un cliente por el id
		@Override
		public void eliminarCliente(Cliente cliente) {
			clientes.remove(cliente.getId());
			System.out.println("Cliente con id: "+cliente.getId()+" elimnado satisfactoriamente");
		}
	}

