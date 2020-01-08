package study_interface;

public class MainClass {
	public static void main(String[] args) {
		Toy airplane = new ToyAirplane();
		Toy robot = new ToyRobot();

		Toy toys[] = { airplane, robot };

		for (Toy a : toys) {
			a.walk();
			a.run();
			a.alarm();
			a.light();
			System.out.println("--------------");
		}

	}
}
