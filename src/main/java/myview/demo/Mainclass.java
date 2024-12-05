package myview.demo;
import java.sql.*;
import java.util.Scanner;

public class Mainclass {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","arun");
	CallableStatement p=c.prepareCall("insert into emp values(?,?,?)");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter id");
	p.setInt(1, sc.nextInt());
	System.out.println("enter name");
	p.setString(2,sc.next());
	System.out.println("enter phono");
	p.setLong(3,sc.nextLong());
	int e=p.executeUpdate();
	System.out.println(e);
	c.close();
}
}
