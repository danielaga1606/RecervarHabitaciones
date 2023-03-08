package reservaDeHabitaciones;

/**
 * Este clase  define objetos que representa las habitaciones de tipo doble 
 * @author Guoanqi Yin 
 * @version 08/03/2023
 */
public class doble extends habitacion{
	private boolean minibar; 
	
	/**
	 * **
	 * El constructor para recibir el id de la habitacion, el estado de habitacion y numero de habitación de padre Habitacion 
	 * y recibir estado y numeros de camas
	 * @param m
	 * @param id  numero de habitaciones
	 * @param e  estado
	 * @param n	 numero de camas
	 *
	 */
	public doble (boolean m, String id, boolean e, int n) {
		super(id, e, n);
		this.minibar =m;
	}
	
	/**
	 * Nos dice si hay minibar 
	 *
	 * @return Si hay o no hay
	 */
	public boolean isMinibar() {
		return minibar;
	}

	/**
	 * Setter para introducir si hay minibar
	 * @param minibar
	 */
	public void setMinibar(boolean minibar) {
		this.minibar = minibar;
	}

	/**
	 * Metodo para calcular el descuento 
	 */
	public void calcularDescuentos() {
		
	}
}
