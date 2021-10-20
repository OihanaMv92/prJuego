package es.Studium.PracticaJuego;

import es.Studium.PracticaJuego.controlador.Controlador;
import es.Studium.PracticaJuego.vista.Vista;

public class Solitario
{

	public static void main(String[] args)
	{
		new Controlador(new Vista());
	}

}
