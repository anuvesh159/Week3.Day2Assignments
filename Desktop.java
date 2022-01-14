package week3.day2;

public class Desktop implements Software {
	

	public void hardwareResouces() {
	System.out.println("Hradware");
		
	}

	public void softwareResouces() {
		System.out.println("Software");
		
	}


public static void main(String[] args) {
	Desktop desk = new Desktop();
	
	desk.hardwareResouces();
	desk.softwareResouces();
		
}
}