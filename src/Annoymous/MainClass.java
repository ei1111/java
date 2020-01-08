package Annoymous;

public class MainClass {
	public static void main(String[] args) {
		//익명Annoymous 클래스(한번 호출하고 호출 안함)
		new AnnoymousClass() {
			public void method() {
				System.out.println("--Annoymous Override--");
			};
		}.method();
	}
}
