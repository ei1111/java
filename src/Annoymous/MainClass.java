package Annoymous;

public class MainClass {
	public static void main(String[] args) {
		//�͸�Annoymous Ŭ����(�ѹ� ȣ���ϰ� ȣ�� ����)
		new AnnoymousClass() {
			public void method() {
				System.out.println("--Annoymous Override--");
			};
		}.method();
	}
}
