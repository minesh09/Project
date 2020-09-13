package alg.com.javaexample;

public class JavaExample6 {
	
	/*
	 * Concepts:
	 * Constructor
	 * Constructor overloading
	 */
	
	/*
	 * Interview prep:
	 * Check JavaTPoint site for constructors - https://www.javatpoint.com/java-constructor
	 */
	
	/*
	 * Real time use:
	 * In Page Object Model, we use constructor in every page class to initiatlize the WebDriver object
	 * In Page Factory model, we use constructor in every page class to initialize the WebElements
	 */
	
	public JavaExample6(){
		System.out.println("Cons 1");
	}
	
	public JavaExample6(String designation, int rank){
		System.out.println("New - The Designation is " + designation);
		System.out.println("Cons 2");
	}
	
	public static void main(String args[]){
		JavaExample6 obj1 = new JavaExample6("Manager", 5);
		JavaExample6 obj2 = new JavaExample6();
	}
}