package alg.com.javaexample;

public class JavaExample2 {
	
	/*
	 * Concepts:
	 * Global Variable
	 * Methods/Functions
	 * Objects - Real meaning and usage
	 * 		Custom Class
	 * 		Jar - Predefined Class
	 */
	
	/*
	 * Interview prep:
	 * 	- Real time we have excel, browsers etc., 
	 * 			:- In terms of java, we have objects
	 * 			:- Objects are not just to execute methods of a class, they hold values depending upon their type. Like numbers, webdrivers, workbook
	 *  - Real time we perform actions like write data in excel, click on button on a browser 
	 *  		:- In terms of java, we perform this functions on objects using methods/functions
	 */
	
	/*
	 * Real time use:
	 *  - Everywhere
	 */
	
	int rank = 5;
	
	public void testCase1(){
		/*
		System.out.println("Inside Test Case 1 and the value of rank is ");
		System.out.println("rank");
		System.out.println(rank);
		*/
		System.out.println("Inside Test Case 1 and the value of rank is " + rank);
	}
	
	public void testCase2(){
		System.out.println("Inside Test Case 2 and the value of rank is " + rank);
	}

	public static void main(String args[]){
		System.out.println("Java Example 2");
		
		JavaExample2 obj1;
		obj1 = new JavaExample2();
		
		obj1.testCase1();
	}
}