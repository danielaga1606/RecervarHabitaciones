package reservaDeHabitaciones;


/**
 * Este clase  define objetos que representa las habitaciones 
 * @author Guoanqi Yin 
 * @version 08/03/2023
 */
public class habitacion {
	private String numHabitacion;
	private boolean estado; 
	private int numCama;
	
	/**
	 * El constructor para recibir el id de la habitacion, el estado de habitacion y numero de habitación
	 * @param id  numero de habitaciones
	 * @param e  estado
	 * @param n	 numero de camas
	 */
	public habitacion (String id, boolean e, int n) {
		this.estado =e;
		this.numHabitacion =id;
		this.numCama=n;
	}

	/**
	 * Getter para id de habitacion
	 * @return id de habitacion
	 */
	public String getNumHabitacion() {
		return numHabitacion;
	}

	/**
	 * Setter para introducir el numero de habitaciones
	 * @param numHabitacion
	 */
	public void setNumHabitacion(String numHabitacion) {
		this.numHabitacion = numHabitacion;
	}

	/**
	 * Nos dice si el habitacion esta reservado:
	 * 
	 * @return si está o no esta 
	 */
	public boolean isEstado() {
		return estado;
	}

	/**
	 * Setter para introducir el estado
	 * @param estado
	 */
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	/**
	 * Getter para ver numero de cama
	 * @return numero de cama
	 */
	public int getNumCama() {
		return numCama;
	}

	/**
	 * Setter para introducir el numero de la cama
	 * @param numCama
	 */
	public void setNumCama(int numCama) {
		this.numCama = numCama;
	}

	
	

}
