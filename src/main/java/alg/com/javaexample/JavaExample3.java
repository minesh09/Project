package alg.com.javaexample;

public class JavaExample3 {
	
	/*
	 * Concepts:
	 * Calling a method from another method
	 * 		Simple
	 * 		Parameter
	 * Method overloading
	 */
	
	/*
	 * Interview prep:
	 * 	Talk about how you think of Re-usability, Readability and Maintenance while writing the code
	 * 	Talk about how you use Page Object Model design pattern
	 * 	Method overloading - Polymorphism
	 */
	
	/*
	 * Real time use:
	 * We write a class and put re-usable/commonly used method in that class and call them from other classes
	 * Page Object Model design pattern
	 * Utility classes
	 */
	
	public void testCase1(){
		System.out.println("Inside Test Case 1");
		
		login();
	}
	
	public void testCase2(){
		System.out.println("Inside Test Case 2");
		login("EMEA");
	}
	
	public void login() {
		System.out.println("Login User 1");
	}
	
	public void login(String sUser) {
		System.out.println("Login - " + sUser);
	}

	public static void main(String args[]){
		System.out.println("Java Example 3");
		
		JavaExample3 obj1 = new JavaExample3();
		obj1.testCase1();
	}
}