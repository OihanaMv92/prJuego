package es.Studium.PracticaJuego.vista;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;




public class Vista extends Frame implements ActionListener, WindowListener
{

	private static final long serialVersionUID = 1L;

	Label lblSolitario = new Label("Juego del Solitario");
	Label lblRayasUno = new Label("-----------------------------");
	Label lblRayasDos = new Label("-----------------------------");
	public Button btnNewPartida = new Button("Nueva Partida");
	public Button btnRanking = new Button("Ranking");
	public Button btnAyuda = new Button("Ayuda");

	//Nueva partida
	Label lblNombre = new Label("Nombre:");
	TextField txtNombre = new TextField(20);
	Button btnEmpezar = new Button("Empezar");
	Button btnMnuPrincipal = new Button("Menu Principal");


	//Ranking
	Label lblJugadores = new Label("Los 10 mejores jugadores:");
	TextArea txtUsuarios =  new TextArea("Nombre de los usuarios");
	



	public Vista()
	{

		setLayout (new FlowLayout());
		setBackground(new Color(124, 155, 247 ));
		setTitle("Menu Principal.");
		add(lblSolitario);
		add(btnNewPartida);
		add(lblRayasDos);
		add(btnRanking);
		add(lblRayasUno);
		add(btnAyuda);


		configureActionListeners();
		setSize(200,250);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);		
	}

	private void configureActionListeners()
	{
		addWindowListener(this);
		btnAyuda.addActionListener(this);
		btnRanking.addActionListener(this);
		btnNewPartida.addActionListener(this);
		btnMnuPrincipal.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent event)
	{
		if (event.getSource().equals(btnNewPartida)) {
			removeAll();
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
		} else if (event.getSource().equals(btnRanking)) {
			removeAll();
			setLayout (new FlowLayout());
			setBackground(new Color(124, 155, 247 ));
			setTitle("Ranking");
			add(lblJugadores);
			add(txtUsuarios);
			add(btnMnuPrincipal);

			setSize(500,280);
			setResizable(false);
			setLocationRelativeTo(null);
			setVisible(true);

		} else if (event.getSource().equals(btnAyuda)) {

		} 
		else if (event.getSource().equals(btnMnuPrincipal)) {
			removeAll();
			setLayout (new FlowLayout());
			setBackground(new Color(124, 155, 247 ));
			setTitle("Menu Principal.");
			add(lblSolitario);
			add(btnNewPartida);
			add(lblRayasDos);
			add(btnRanking);
			add(lblRayasUno);
			add(btnAyuda);
			setSize(200,250);
			setResizable(false);
			setLocationRelativeTo(null);
			setVisible(true);

		}

	}


	public void borrarMenuPrincipal() {
		remove(btnNewPartida);
		remove(lblSolitario);
		remove(lblRayasDos);
		remove(btnRanking);
		remove(lblRayasUno);
		remove(btnAyuda);
	}

	@Override
	public void windowActivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent arg0)
	{

	}

	@Override
	public void windowClosing(WindowEvent arg0)
	{
		if(isActive())
		{
			setVisible(false);

		}
		else
		{
			System.exit(0);
		}
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

}

