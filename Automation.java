package week3.day2;

public class Automation extends MultipleLangauge implements Language ,TestTool  {
	
	//Implement all the methods of interface and abstract class in Automation class

	public static void main(String[] args) {
		
		Automation tool = new Automation();
		tool.java();
		tool.Selenium();
		tool.python();
		tool.ruby();
		
	}

	public void Selenium() {
		System.out.println("Selenium is a part of testing tool");
		
	}

	public void java() {
		System.out.println("Java Language needs to interact with selenium");
		
	}
	public void ruby() {
		System.out.println("Ruby is also supports in selenium");
		
	}

	
	


	

	

}
