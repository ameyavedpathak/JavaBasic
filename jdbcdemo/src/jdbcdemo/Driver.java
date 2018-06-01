package jdbcdemo;

import java.sql.*;
import java.util.Scanner;


public class Driver 
{

	public static void main(String[] args) 
{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Username : ");
		String username = scan.next();
		
		System.out.println("Enter the Password : ");
		int password = scan.nextInt();	
		
		int empid =0;
		String firstName= null;
		String city = null;
		String lastname = null;
		
		if(username.equals("ameya") && password == 2727)
{
	
			System.out.println("Select options : 1. Add New  2.Update");
			int option = scan.nextInt();
			if(option ==1){
				
				System.out.println("Enter empid :");
				empid = scan.nextInt();
				System.out.println(empid);
				
				System.out.println("Enter FirstName :");
				firstName = scan.next();
				System.out.println(firstName);
				
				System.out.println("Enter City :");
				city = scan.next();
				System.out.println(city);
				
				System.out.println("Enter lastname :");
				lastname = scan.next();
				System.out.println(lastname);
				
			}
			if(option==2){
				
				
			}
			try
		{
			
			//1. Connection
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "2727");
			//PreparedStatement myStmt = myConn.prepareStatement("Insert into Employee (empid,FirstName,City,lastname) values ("+empid+ ","+firstName+","+city+","+lastname+");");
			PreparedStatement ps = myConn.prepareStatement("Insert into Employee (empid,FirstName,City,lastname) values (?,?,?,?);");
			ps.setInt(1, empid);
			ps.setString(2, firstName);
			ps.setString(3, city);
			ps.setString(4, lastname);
			System.out.println("M here");
			boolean myRs = ps.execute();	
			PreparedStatement ps1 = myConn.prepareStatement("select * from employee where empid="+empid+"");
			ResultSet rs = ps1.executeQuery();
			while(rs.next())
		{
				System.out.println("Details Updated:"+ rs.getString(1)+rs.getString(2));
				
	    }
		}	
		catch(Exception exc)
		{
			exc.printStackTrace();
			
		}
}		
		else
		{
		System.out.println("Wrong Password");	
		}
		
}

}

