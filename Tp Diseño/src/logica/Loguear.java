package logica;

public class Loguear{


	public boolean LoguearConsultor(String usuario, String contraseña) {
		if(usuario!=null & contraseña!=null){
			modelo.DAOUsuario obj= new modelo.DAOUsuario();
			return obj.validarDatos(usuario,contraseña);
		}
		else{
			return false;
		}
	}
	/*
	java.sql.Connection con;
	java.sql.Statement st;
	java.sql.ResultSet res;
	
	public Loguear(){
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
	*/
	/*public void insertar(String sql){
		try{
			st=con.createStatement();
			java.sql.ResultSet rs =st.executeQuery(sql);
		}catch(SQLException ex){
			System.out.println("Error insertando" +ex);
		}
	}
	
	public boolean validar(String sql){
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
	*/

	
}
