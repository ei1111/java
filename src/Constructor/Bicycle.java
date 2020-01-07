package Constructor;

public class Bicycle {// 클래스 이름 첫글자는 대문자
	String color;
	int price;

	public Bicycle(String c, int p) {
		this.color = c;
		this.price = p;

	}

	public void info() {// 메서드
		System.out.println("bicycle");
		System.out.println("color: " + color);
		System.out.println("price: " + price);
		System.out.println("--info()--");
	}

}
