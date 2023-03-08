package reservaDeHabitaciones;
/**
 * Este clase  define objetos que representa las clientes 
 * @author Guoanqi Yin 
 * @version 08/03/2023
 */
public class cliente {
	private String numeroCliente;
	private String nombre;
	private String telefono; 
	
	/**
	 * El constructor para recibir el nombre, telefono y id de cliente
	 * @param n
	 * @param no
	 * @param tel
	 */
	public cliente (String n, String no, String tel) {
		
		this.nombre = n;
		this.numeroCliente = no;
		this.telefono = tel;
	}

	/**
	 * Getter para id de cliente
	 * @return id de cliente
	 */
	public String getNumeroCliente() {
		return numeroCliente;
	}

	/**
	 * Setter para introducir el id de cliente
	 * @param numeroCliente
	 */
	public void setNumeroCliente(String numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	/**
	 * Getter para ver nombre de cliente
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter para introducir el nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter para ver telefono
	 * @return telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Setter para introducir el telefono 
	 * @param telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}
