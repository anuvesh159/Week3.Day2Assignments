package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates2 {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		
	    int count = 0;
	    
	    String[] str = text.split(" ");
	    
	    Set<String>duplicatename = new LinkedHashSet<String>();
	    for(String remove : str) {
	    	duplicatename.add(remove);
	    	if(count>1) {
	    		System.out.println();
	    	}
	    	}
		System.out.println(duplicatename);
	}
	}
