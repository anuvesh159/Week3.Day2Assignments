package week3.day2;

public class College extends University {

	@Override
	public void ug() {
		
		System.out.println("UG");
		
	}

	public static void main(String[] args) {
		
		College col = new College();
		
		col.ug();
		col.pg();
	}


}
