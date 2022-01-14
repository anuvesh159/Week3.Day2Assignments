package week3.day2;

public class Palindrome1 {
	
	public static void main(String[] args) {
		
		String value = "madam";
		String rev= "";
		
	    int length = value.length();
	    
	    System.out.println(length);
	    
	    for(int i = length-1; i>=0; i--)
	    	rev = rev+value.charAt(i);
	    		
	    if (value.equals(rev))
	    	
	    	System.out.println(value+" : " +"It is a palindrome");
	    
	    else
	    	
	    	System.out.println(value+" : "+"It is not an palindrome");
		
		
		
		
	}
	
	
	
	
	//Build a logic to find the given string is palindrome or not
    
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */

}
