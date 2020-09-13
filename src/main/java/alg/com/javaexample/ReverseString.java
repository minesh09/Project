package alg.com.javaexample;

public class ReverseString {
	
	public void reverseString1(String input1)
	{
		String result = ""; 
		for (int i= input1.length()-1;i>=0;i--)
		{
			result = result + input1.charAt(i);			
		}
		System.out.println(result);
	}
	public String reverseString2(String input1)
	{
		
		 if(input1.length() == 0)
		 {
			 return "";
		 }
		return input1.charAt(input1.length()-1) + reverseString2(input1.substring(0,input1.length()-1));
	}
	
	public static void main(String args[]){	
		ReverseString obj1 =new ReverseString();
		String a = "Hi My name is Minesh";
		obj1.reverseString1(a);
		String result =	obj1.reverseString2(a);
		System.out.println(result);
	}

}
