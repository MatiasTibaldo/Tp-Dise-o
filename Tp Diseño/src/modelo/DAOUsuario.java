package modelo;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOUsuario extends Usuario {
	logica.Loguear objConecta;
	static java.sql.Connection con;
	static java.sql.Statement st;
	java.sql.ResultSet res;
	
	public DAOUsuario(){
		try{
			try{
				Class.forName("org.postgresql.Driver");
				System.out.println("Driver Correcto");
			}
			catch(ClassNotFoundException ex){
			System.out.println("Error cargando el Driver");	
			}
			
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/dbinfo","postgres","matias");
		}catch (SQLException ex){
			System.out.println("No se pudo conectar con el motor");
		}
	}
	

	public boolean validarDatos(String usuario, String contraseña) {
		String sql="select * from usuario where nombre ='"+usuario+"'and contraseña='"+contraseña+"'";
		System.out.println(sql);
		java.sql.ResultSet hoja_resultado=null;
		try{
			st=con.createStatement();
			hoja_resultado=st.executeQuery(sql);
			if(hoja_resultado.next()){
				return true;
			}
			else{
				return false;
			}
		}catch (SQLException ex){
			System.out.println("Error consultando"+ex.toString());
			return false;
		}
	}
}
