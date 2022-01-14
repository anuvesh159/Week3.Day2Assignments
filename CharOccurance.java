package week3.day2;

public class CharOccurance {

	public static void main(String[] args) {
		
		
		char occur = 'n';
		
		String str = "welcome to chennai";
		int count = 0;
		char[] characterArray = str.toCharArray();
		
		int len = characterArray.length;
		System.out.println("The length of the Array :"+len);
		
		for(int i=0; i<=len-1; i++)
		{
			if(str.charAt(i)==occur) {
				
				count++;
			}
		}
		System.out.println("The Count of n in string is :"+count);
	
		
		
		// Check number of occurrences of a char (eg 'e') in a String
		
					//String str = "welcome to chennai";

					// declare and initialize a variable count to store the number of occurrences
					
					// convert the string into char array
						
					//get the length of the array
						
					// traverse from 0 till the array length 
						
						// Check the char array has the particular char in it 
					
						// if is has increment the count
							 
						
						// print the count out of the loop
							

	}

}
