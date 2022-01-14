package week3.day2;

import java.util.Arrays;

public class Anagram1 {

	public static void main(String[] args) {
		
		String text1 = "stops";
		String text2 = "topss"; 
		
		int len1=text1.length();
		int len2=text2.length();
		
		char[] charArray1 = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		if(len1==len2)
		
		if (Arrays.equals(charArray1, charArray2)) {
			System.out.println("It is known as Anagram");
		}
		else {
			System.out.println("It is not an Anagram");
		}
		else {
			System.out.println("The text and length is not match");
		}
			
		}
		
	}
	
	

