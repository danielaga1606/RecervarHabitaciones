package reservaDeHabitaciones;
import java.util.*;
import java.util.Date;

/**
 * Este clase  define objetos que representa las reservas
 * @author Guoanqi Yin 
 * @version 08/03/2023
 */
public class reserva {
	private String numeroRerseva;
	private Date fechaEntrada;
	private Date fechaSalida; 
	private int numPersona; 
	
	/**
	 * /**
	 * El constructor para recibir el numero de Reservas, el fecha de entrada, fecha de salida y numero de persona
	 
	 * @param nu numero de reserva 
	 * @param fe fecha de entrada 
	 * @param f fecha de salida 
	 * @param n numero de persona 
	 */
	public reserva (String nu, Date fe, Date f, int n) {
		this.fechaEntrada = fe;
		this.fechaSalida =f;
		this.numeroRerseva = nu;
		this.numPersona = n;
	}

	/**
	 * Getter para numero de reserva 
	 * @return numero de reserva 
	 */
	public String getNumeroRerseva() {
		return numeroRerseva;
	}

	/**
	 * Setter para introducir el numero de reserva
	 * @param numeroRerseva
	 */
	public void setNumeroRerseva(String numeroRerseva) {
		this.numeroRerseva = numeroRerseva;
	}

	/**
	 * Getter para la fecha de entrada 
	 * @return fecha de entrada
	 */
	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	/**
	 * Setter para introducir fecha de entrada 
	 * @param fechaEntrada
	 */
	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	/**
	 * Getter para ver fecha de salidad
	 * @return fecha de salida
	 */
	public Date getFechaSalida() {
		return fechaSalida;
	}

	/**
	 * Setter para introducir fecha de salida 
	 * @param fechaSalida
	 */
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	/**
	 * Getter para ver numero de persona 
	 * @return numero de persona 
	 */
	public int getNumPersona() {
		return numPersona;
	}

	/**
	 * Setter introducir el numero de persona 
	 * @param numPersona
	 */
	public void setNumPersona(int numPersona) {
		this.numPersona = numPersona;
	}

	
}
