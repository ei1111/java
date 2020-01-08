package study_interface;

public class ToyRobot implements Toy {

	@Override
	public void walk() {
		System.out.println("walk");

	}

	@Override
	public void run() {
		System.out.println("run");
	}

	@Override
	public void alarm() {
		System.out.println("alarm");
	}

	@Override
	public void light() {
		System.out.println("light");
	}

}
