package alg.com.javaexample;

public class JavaExample4 {
	
	/*
	 * Concepts:
	 * Global variables and Local variables
	 */
	
	/*
	 * Interview prep:
	 * None
	 */
	
	/*
	 * Real time use:
	 * None
	 */
	
	int globalLocalVariable = 4;
	
	public void testCase1(){
		int globalLocalVariable = 15;
		String localVariable = "Session1";
		
		
		System.out.println("Inside Test Case 1");
		System.out.println("Value of Global Variable 'globalLocalVariable' is " + this.globalLocalVariable + " and the value of "
				+ "local variable 'globalLocalVariable' is " + globalLocalVariable);
		System.out.println("The value of 'localVariable' in testCase2 - " + localVariable);
		
		/*
		System.out.println("Before Changing value of 'globalLocalVariable' - " + globalLocalVariable);
		globalLocalVariable= 40;
		System.out.println("After Changing value of 'globalLocalVariable' - " + globalLocalVariable);
		*/
	}
	
	public void testCase2(){
		System.out.println("Inside Test Case 2");
		System.out.println("The value of 'globalLocalVariable' in testCase2 - " + globalLocalVariable);
		//System.out.println("The value of 'localVariable' in testCase2 - " + localVariable);
	}

	public static void main(String args[]){
		System.out.println("Java Example 4");
		
		JavaExample4 obj1 = new JavaExample4();
		obj1.testCase1();
		obj1.testCase2();
	}
}