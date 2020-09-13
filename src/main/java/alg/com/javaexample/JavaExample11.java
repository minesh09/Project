package alg.com.javaexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JavaExample11 {
	
	/*
	 * Concept:
	 * DB connectivity
	 */
	
	/*
	 * Interview Prep:
	 * They can ask which DB was used in your project
	 * How did you connect to DB in your automation
	 */
	
	/*
	 * Real time use:
	 * There will be test cases in which the expected data won't be available before hand and has to be fetched from DB at run time
	 */
	
	// Connection object
	static Connection con;
	// Statement object
	private static Statement stmt;
	// Constant for Database URL
	public static String DB_URL = "jdbc:mysql://localhost:3306/user";   
	// Constant for Database Username
	public static String DB_USER = "root";
	// Constant for Database Password
	public static String DB_PASSWORD = "training";

	public void setUp(){
		try{
			// Make the database connection
			String dbClass = "com.mysql.jdbc.Driver";
			Class.forName(dbClass).newInstance();
			// Get connection to DB
			Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			// Statement object to send the SQL statement to the Database
			stmt = con.createStatement();
		}catch (Exception e){
			System.out.println("Error Connecting to DB - " + e.getMessage());

		}
	}

	public void test() {
		String rowData = "";
		List<String> resultSet = new ArrayList<String>();
		
		try{
			String query = "select * from userinfo";
			// Get the contents of userinfo table from DB
			ResultSet res = stmt.executeQuery(query);
			// Print the result untill all the records are printed
			// res.next() returns true if there is any next record else returns false
			while (res.next()){
				for(int i=1;i<=4;i++){
					System.out.println(res.getString(i));
				}
			}
			
			//Check if record with the name Shruti exists
			while (res.next()){ 
				if(res.getString(2).equalsIgnoreCase("Shruti")){
					System.out.println("Shruti Found");
					break;
				}
			}
		}catch(Exception e){
			System.out.println("Error fetching Results - " + e.getMessage());
		}     
	}

	public void tearDown() {
		// Close DB connection
		try{
			if (con != null) {
				con.close();
			} 
		}catch(Exception e){
			System.out.println("Error closing connection - " + e.getMessage());
		}
	}

	public static void main(String args[]){
		JavaExample11 obj = new JavaExample11();
		obj.setUp();
		obj.test();
		obj.tearDown();
	}
}