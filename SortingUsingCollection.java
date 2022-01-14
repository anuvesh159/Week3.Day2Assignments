package week3.day2;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		
		String[] array = new String[]{"HCL","Wipro","Aspire Systems","CTS"};
		
		int len = array.length;
		System.out.println(len);
		
		Arrays.sort(array);
		System.out.println(array);
		
		for(int i=0; i < array.length; i++)
			
		{
			System.err.println(array[i]);
		}
		
				
		

	
	}

}
