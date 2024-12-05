package myview.demo;
import java.sql.*;
public class Mainclass1 {
public static void main(String[] args) throws Exception {
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","arun");
	CallableStatement p=c.prepareCall("call fetchemp(1)");
	ResultSet e=p.executeQuery();
	while(e.next())
	{
		System.out.println(e.getInt(1)+" "+e.getString(2)+" "+e.getLong(3));
	}
	c.close();
}
}
