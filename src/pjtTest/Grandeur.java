package pjtTest;

public class Grandeur {// 클래스 이름 첫글자는 대문자
	String color;
	String gear;
	int price;

	public Grandeur() {// 생성자
		System.out.println("Grandeur Contruct");

	}

	public void run() {// 메서드
		System.out.println("--run--");
	}

	public void stop() {
		System.out.println("--stop--");
	}

	public void info() {// 메서드
		System.out.println("--info()--");
		System.out.println("color: " + color);
		System.out.println("price: " + price);
		System.out.println("gear: " + gear);
	}

}
