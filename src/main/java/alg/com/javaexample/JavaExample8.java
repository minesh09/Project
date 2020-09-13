package alg.com.javaexample;

public class JavaExample8 {
	
	/*
	 * Concepts:
	 * final
	 */
	
	/*
	 * Interview prep:
	 * https://www.javatpoint.com/final-keyword
	 *  You can talk about making objects that you don't want to get modified as final like Locators, WebElements etc.,
	 *  Difference between static and final
	 *  		Static: The object does not change but the value of the object can change. 
	 *  		Example, within a class, if we have a static variable/object - No matter how many object we create for that class, that particular
	 *  		static variable/object will be created only once. It will be accessed via class name because it is class variable. Its value can change
	 *  		
	 *  		final: The value of the object cannot change but can create more than one object.
	 *  		Example, within a class, if we have a final variable/object - There will be one copy of this final variable/object for every class
	 *  		object. It's value cannot change.
	 *  
	 *  		static final variable: Both object and value cannot change.
	 */
	
	/*
	 * Real time use:
	 *  Locators, WebElements, Configuration Properties Object etc.,
	 */
	
	final int RANK=5;
	int age;
	static final int staticRANK=5;
	
	public void testCase1(){
		age = 5;
		//RANK = 10;
		
		System.out.println("The value of Rank is " + RANK);
	}
	
	public static void main(String args[]){
		JavaExample8 obj1 = new JavaExample8();
		obj1.testCase1();
	}
}
