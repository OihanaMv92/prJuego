package es.Studium.PracticaJuego.vista;


import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;

public class VistaNuevaPartida extends Vista
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Label lblNombre = new Label("Nombre:");
	TextField txtNombre = new TextField(20);
	Button btnEmpezar = new Button("Empezar");
	Button btnMnuPrincipal = new Button("Menu Principal");

	public VistaNuevaPartida()
	{
		setLayout (new FlowLayout());
		setBackground(new Color(124, 155, 247 ));
		setTitle("Nueva Partida.");
		add(lblNombre);
		add(txtNombre);
		add(btnEmpezar);
		add(btnMnuPrincipal);

		setSize(300,120);
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}

