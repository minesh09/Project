package alg.com.javaexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class JavaExample9 {
	
	/*
	 * Concept:
	 * Working with Properties file
	 */
	
	//This example talks about Properties file 
	public Properties openProperties(String fileName) throws Exception{
		Properties prop = new Properties();
		InputStream input = null;
		
		input = new FileInputStream(fileName);
		prop.load(input);
		input.close();
		
		return prop;
	}
		
	public void  testcase1(){			
		Properties propTc1 = new Properties();			
		try {
			propTc1 = openProperties("Test1.Properties");
			
			String userEmailId = propTc1.getProperty("Age");
			
			System.out.println(userEmailId);
			System.out.println(propTc1.getProperty("Password"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File not found");
		}
		
		
		/*
		String userId1 = propTc1.getProperty("UserId");
		System.out.println(userId1);
		
		String[] userId = userId1.split("---");
		
		for(int i=0; i<userId.length; i++){
			System.out.println(userId[i]);
		}
		
		String pswd1 = propTc1.getProperty("Password");
		System.out.println(pswd1);
		
		String[] passWord = pswd1.split("---");
		
		for(String pass:passWord){
			System.out.println(pass);
		}
		*/
	}
	
	public void testcase2(){
		Properties propTc2 = new Properties();
		
		try {
			propTc2 = openProperties("Test2.Properties");
			System.out.println(propTc2.getProperty("Country"));
			System.out.println(propTc2.getProperty("State"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {		
		JavaExample9 obj1 = new JavaExample9();
		obj1.testcase1();
		obj1.testcase2();
	}
}