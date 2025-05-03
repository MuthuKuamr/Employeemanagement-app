package day3;
import java.sql.*;

public class JDBCProgram {
				
	public static void main(String[] args) throws SQLException,ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=	
				DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctask","root","Muthu@14092004");
		Statement statement=con.createStatement();
		String query="insert into department(deptid,deptname) values (101,'Admin')";
		int rowAffected=statement.executeUpdate(query);
		System.out.println("Rows affected"+rowAffected);
		statement.close();
		con.close();

	}

}
