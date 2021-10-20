package es.Studium.PracticaJuego.modelo;

public class Carta
{
	
	private int id;
	private int numero;
	private String palo;
	private String color;
	private String img;
	
	public Carta() {
		img = "img/" + numero + "-" + palo + ".jpg";
	}
	
	/**
	 * @return the id
	 */
	public int getId()
	{
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id)
	{
		this.id = id;
	}
	/**
	 * @return the numero
	 */
	public int getNumero()
	{
		return numero;
	}
	/**
	 * @return the palo
	 */
	public String getPalo()
	{
		return palo;
	}
	/**
	 * @return the color
	 */
	public String getColor()
	{
		return color;
	}
	/**
	 * @return the img
	 */
	public String getImg()
	{
		return img;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero)
	{
		this.numero = numero;
	}
	/**
	 * @param palo the palo to set
	 */
	public void setPalo(String palo)
	{
		this.palo = palo;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color)
	{
		this.color = color;
	}
	/**
	 * @param img the img to set
	 */
	public void setImg(String img)
	{
		this.img = img;
	}
	
}
