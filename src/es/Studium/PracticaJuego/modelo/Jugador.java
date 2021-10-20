package es.Studium.PracticaJuego.modelo;

public class Jugador
{
	private int id;
	private String nombre;
	private double tiempo;
	
	public Jugador(String nombre, double tiempo) {
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	public Jugador(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return the id
	 */
	public int getId()
	{
		return id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre()
	{
		return nombre;
	}
	/**
	 * @return the tiempo
	 */
	public double getTiempo()
	{
		return tiempo;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id)
	{
		this.id = id;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	/**
	 * @param tiempo the tiempo to set
	 */
	public void setTiempo(double tiempo)
	{
		this.tiempo = tiempo;
	}
	
}
