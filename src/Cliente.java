/**
 * 
 * @author Juan
 * @version 1.0
 * @see Cliente
 *
 */
public class Cliente {
	public int codigo;
	public String nombre;
	public String apellido;
	public String email;
	public long telefono;
	public boolean nuevo;
	public double cifraVentas;
	
	public Cliente() {
	// este es el cambio en el archivo	
	}
	
	/**
	 * 
	 * @param codigo
	 * 		codigo interno del cliente
	 * @param nombre
	 * 		nombre del cliente
	 * @param email
	 * 		email del cliente
	 * @param telefono
	 * 		numero de telefono del cliente
	 * @param nuevo
	 * 		boolean que indica si es un cliente nuevo
	 * @param cifraVentas
	 * 		ventas totales a ese cliente
	 * @see Cliente
	 */
	public Cliente(int codigo, String nombre, String email, long telefono, 
			boolean nuevo, double cifraVentas) {
		
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.nuevo = nuevo;
		this.cifraVentas = cifraVentas;

	}
	
	// acciones -> metodos
	/**
	 * @see Cliente
	 */
	public void mostrarDatos() {
		System.out.println("Codigo: " + codigo + " Nombre: " + nombre + " ... ");
	}
	/**
	 * 
	 * @return cifraVentas
	 * 		devuelve las ventas al cliente
	 * @see Cliente
	 */
	public double verCifraVentas() {
		return cifraVentas;
	}
	
	/**
	 * 
	 * @param nuevoTelefono
	 * 		se pasa el nuevo telefono por parametro para sustituirlo
	 * @see Cliente
	 */
	public void cambiarTelefono(long nuevoTelefono) {
		telefono = nuevoTelefono;
	}
}
