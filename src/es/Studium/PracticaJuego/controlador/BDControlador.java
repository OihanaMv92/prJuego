package es.Studium.PracticaJuego.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import es.Studium.PracticaJuego.modelo.Jugador;


public class BDControlador
{
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/juego?serverTimezone=UTC";
	String login = "root";
	String password = "Studium2020;";
	String sentencia = "";
	Connection connection;
	Statement statement = null;
	ResultSet rs = null;
	public BDControlador(){
		connection = conectar();
	}

	
	public void insertarJugador(Jugador jugador) {
		try
		{
			//Crear una sentencia para statement
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);

			sentencia = "INSERT INTO jugadores VALUES (null, '"
					+ jugador.getNombre() + "','" 
					+ jugador.getTiempo() +"');";

			statement.executeUpdate(sentencia);
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}


	private Connection conectar() 
	{
		try
		{
			Class.forName(driver); 
			connection = DriverManager.getConnection(url, login, password);
		}
		//En caso de error de no localizar algo o que no funcione algún dato de url, login o pass
	
		catch (ClassNotFoundException cnfe) 
		{
			System.out.println("Error 1-" + cnfe.getMessage());
		}
	
		catch (SQLException sqle)
		{
			System.out.println("Error 2-"+sqle.getMessage());
		}
		return connection;
	}
	
	public void cerrar() {
		try
		{
			connection.close();
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

}

