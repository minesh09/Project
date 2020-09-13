package alg.com.javaexample;

public class JavaExample7 {
	
	/*
	 * Concepts:
	 * static
	 */
	
	/*
	 * Interview prep:
	 * You can talk about singleton pattern
	 * You can talk about making Properties file object (Config data) as static
	 * https://www.javatpoint.com/static-keyword-in-java
	 */
	
	/*
	 * Real time use:
	 * Configuration properties file object
	 */
	
	int rank = 2;
	int age = 2;
	
	public void testCase1(){		
		System.out.println("Inside Test Case 1");
		System.out.println("Value of Global Variable age is " + age);
	}
	
	public void testCase2(){
		System.out.println("Inside Test Case 2");
		System.out.println("Value of Global Variable rank is " + rank);
		System.out.println("Value of Global Variable age is " + age);
	}

	public static void main(String args[]){		
		JavaExample7 obj1;
		obj1 = new JavaExample7();
		
		obj1.rank = 5;
		
		obj1.testCase1();
		obj1.testCase2();
		
		JavaExample7 obj2 = new JavaExample7();
		obj2.testCase1();
		obj2.testCase2();
	}
}