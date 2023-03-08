package reservaDeHabitaciones;
/**
 * Este clase  define objetos que representa las habitaciones de suite
 * @author Guoanqi Yin 
 * @version 08/03/2023
 */
public class suite extends habitacion{
	private float metro; 
	private String servicios; 
	
	/**
	 * El constructor para recibir el id de la habitacion, el estado de habitacion y numero de habitación desde padre Habitacion. Luego recibir metro de la cama y servicio
	 * 
	 * @param id  numero de habitaciones
	 * @param e  estado
	 * @param n	 numero de camas
	 * @param m	metro
	 * @param s servicio
	 */
	public suite(String id, boolean e, int n, float m, String s) {
		super(id, e, n);
		this.metro=m;
		this.servicios=s;
		
	}
	
	/**
	 * Getter para ver el metro
	 * @return metro
	 */
	public float getMetro() {
		return metro;
	}

	/**
	 * Setter para introducir el metro
	 * @param metro
	 */
	public void setMetro(float metro) {
		this.metro = metro;
	}

	/**
	 * Getter para ver servicio 
	 * @return servicios
	 */
	public String getServicios() {
		return servicios;
	}

	/**
	 * Setter para introducir el servicio 
	 * @param servicios
	 */
	public void setServicios(String servicios) {
		this.servicios = servicios;
	}

	/**
	 * Metodo para calcular los gatos 
	 */
	public void calcularGasto() {
		
	}	
}
