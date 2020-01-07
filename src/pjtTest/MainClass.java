package pjtTest;

public class MainClass {
	public static void main(String[] args) {
		Grandeur mycar1 = new Grandeur();
		mycar1.color = "red";
		mycar1.gear = "auto";
		mycar1.price = 1000;
				
		mycar1.run();
		mycar1.stop();
		mycar1.info();
		
		System.out.println();
		
		Bicycle bicycle = new Bicycle("red", 1000);
		bicycle.info();
		
	
	}
}
