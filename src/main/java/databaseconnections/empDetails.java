package databaseconnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class empDetails {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://" + "localhost" + ":" + "3306" + "/qadb", "root",
				"root123");
          Statement s=con.createStatement();
       
         
          ResultSet rs= s.executeQuery("select * from emp where empId = 11");
          rs.next();
          System.out.println(rs.getString(1));
          System.out.println(rs.getString("edept"));
	}

	

}
