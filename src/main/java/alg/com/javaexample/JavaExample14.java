package alg.com.javaexample;

public class JavaExample14 {
	
	/*
	 * Compile time exceptions - Checked exception
	 * 		throws
	 */
	
	/*
	 * Interview prep:
	 * 	Check JavaTpoint for exceptions
	 */
	
	/*
	 * Real time use:
	 * 	While writing BasePage class in Selenium
	 * 	Selenium classes have lot of methods which would throw exception like WebElementNotFoundException, TimeoutException etc.,
	 */
	
	String[] tranId = {"Abc123", "Abc234"};
	
	public String getTranId(int i) throws Exception{
		return tranId[i];
	}
	
	public void testCase1(){
		/*
		for(int i=0;i<=2; i++){
			System.out.println("Tran ID " + i + " - " + getTranId(i));
		}
		*/
		
		
		 for(int i=0;i<=3; i++){
			try{
				System.out.println("Tran ID " + i + " - " + getTranId(i));
			}catch(Exception e){
				System.out.println("Error accessing Tran Id - " + i);
			}
		 } 
	}

	public static void main(String args[]){
		System.out.println("Exception Handling 2");
		JavaExample14 obj1 = new JavaExample14();
		obj1.testCase1();
		
		System.out.println("End of Exception Handling 2");
	}
}