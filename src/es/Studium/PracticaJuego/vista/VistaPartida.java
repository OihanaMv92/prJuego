package es.Studium.PracticaJuego.vista;


import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;

public class VistaPartida extends Frame 
{
	private static final long serialVersionUID = 1L;

	Panel abajo = new Panel();
	Panel dentro = new Panel();
	Button btnMnuPrincipal = new Button("Partida");
	Button btnAyuda = new Button("Ayuda");
	Button btnSalir = new Button("Salir");
	Image tablero;
	Toolkit herramientas;


	public VistaPartida()
	{

		abajo.setLayout(new GridLayout(1,3));
		//dentro.setLayout(new GridLayout(1,3));
		setBackground(new Color(124, 155, 247 ));
		setTitle("Partida");
		herramientas = getToolkit();
		tablero = herramientas.getImage("Solitario.png");
		abajo.add(dentro);
		dentro.add(btnAyuda);
		dentro.add(btnSalir);
		dentro.add(btnMnuPrincipal);
		add("South", abajo);



		setSize(1000,650);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.drawImage(tablero, 10, 10, this);

	}
	public static void main(String[] args) {
		new VistaPartida();
	}
	
}