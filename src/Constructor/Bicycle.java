package Constructor;

public class Bicycle {// Ŭ���� �̸� ù���ڴ� �빮��
	String color;
	int price;

	public Bicycle(String c, int p) {
		this.color = c;
		this.price = p;

	}

	public void info() {// �޼���
		System.out.println("bicycle");
		System.out.println("color: " + color);
		System.out.println("price: " + price);
		System.out.println("--info()--");
	}

}
