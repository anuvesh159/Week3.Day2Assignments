package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		
				Integer[] data = {3,2,11,4,6,7};

				List<Integer> numbers = Arrays.asList(data);
				Collections.sort(numbers);
				
				int seclarg = numbers.get(data.length-2);
				
				System.out.println(seclarg);
				
	}

}
