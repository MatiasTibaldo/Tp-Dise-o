package logica;

public class Loguear{


	public boolean LoguearConsultor(String usuario, String contrase�a) {
		if(usuario!=null & contrase�a!=null){
			modelo.DAOUsuario obj= new modelo.DAOUsuario();
			return obj.validarDatos(usuario,contrase�a);
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
