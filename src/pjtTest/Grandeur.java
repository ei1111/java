package pjtTest;

public class Grandeur {// Ŭ���� �̸� ù���ڴ� �빮��
	String color;
	String gear;
	int price;

	public Grandeur() {// ������
		System.out.println("Grandeur Contruct");

	}

	public void run() {// �޼���
		System.out.println("--run--");
	}

	public void stop() {
		System.out.println("--stop--");
	}

	public void info() {// �޼���
		System.out.println("--info()--");
		System.out.println("color: " + color);
		System.out.println("price: " + price);
		System.out.println("gear: " + gear);
	}

}
