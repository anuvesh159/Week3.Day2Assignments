package week3.day2;

public class FindTypes {

	public static void main(String[] args) {
		
		String test = "$$ Welcome to 2nd Class of Automation $$";
		
		int  letter = 0;
		int	 space = 0;
		int  num = 0;
		int  specialChar = 0;
		
		
		char[] cs = test.toCharArray();
		
		for(int i = 0; i<cs.length; i++)
		{
			if (Character.isLetter(cs[i])) {
				letter++;
			}
			else if (Character.isSpaceChar(cs[i])) {
				space++;
			}
			else if (Character.isDigit(cs[i])) {
				num++;
			}
			else {
				specialChar++;
			}
		}
			
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
		
	}
}
		


