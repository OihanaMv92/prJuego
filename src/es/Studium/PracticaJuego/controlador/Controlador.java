package es.Studium.PracticaJuego.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import es.Studium.PracticaJuego.modelo.Jugador;
import es.Studium.PracticaJuego.vista.Vista;

public class Controlador implements ActionListener, WindowListener
{

	private Vista vista;
	private Jugador jugador;
	
	public Controlador(Vista vista)
	{
		vista.addWindowListener(this);
	}
	
	/**
	 * @return the jugador
	 */
	public Jugador getJugador()
	{
		return jugador;
	}

	/**
	 * @param jugador the jugador to set
	 */
	public void setJugador(Jugador jugador)
	{
		this.jugador = jugador;
	}
	
	public void setVista(Vista vista) {
		this.vista = vista;
	}
	
	public void setModelo(Jugador jugador) {
		this.jugador = jugador;
	}

	@Override
	public void windowActivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0)
	{
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

}
