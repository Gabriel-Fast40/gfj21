package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

public class JDBCInsere {

	
	
	public static void main(String[] args) throws SQLException {
Connection con = null;


try {
	con = new ConnectionFactory().getConnection();
	
}
catch(SQLException e){
	System.out.println(e);
	
}
finally {
	con.close();
	
}



         
	

	}
	
}



