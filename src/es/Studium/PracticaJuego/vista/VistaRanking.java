package es.Studium.PracticaJuego.vista;


import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextArea;

public class VistaRanking extends Vista
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Label lblJugadores = new Label("Los 10 mejores jugadores:");
	Button btnMnuPrincipal = new Button("Menu Principal");
	TextArea txtUsuarios =  new TextArea("Nombre de los usuarios");

	public VistaRanking()
	{
		setLayout (new FlowLayout());
		setBackground(new Color(124, 155, 247 ));
		setTitle("Ranking");


		setSize(500,280);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new VistaRanking();
	}
}