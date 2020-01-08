package Lambda;

public class MainClass {

	public static void main(String[] args) {
		// �Ű������� ���๮���� �ۼ��Ѵ�(������, ��ȯ��, return Ű���� ����)
		LambdaInterface1 li1 = (String s1, String s2, String s3) -> {
			System.out.println(s1 + " " + s2 + " " + s3);
		};
		li1.method("Hello", "Java", "World");
		System.out.println();

		// �Ű������� 1���̰ų� Ÿ���� ������ Ÿ���� ���� �Ҽ� �ִ�
		LambdaInterface2 li2 = (s1) -> {
			System.out.println(s1);
		};
		li2.method("Hello");

		// ���๮�� 1���϶� '{}'�� �����Ҽ� �ִ�
		LambdaInterface2 li3 = (s1) -> System.out.println(s1);
		li3.method("Hello");

		// �Ű������� ���๮�� 1���϶�'()'�� '{}' ��������
		LambdaInterface2 li4 = s1 -> System.out.println(s1);
		li4.method("Hello");

		// �Ű������� ������'()'�� �ۼ��Ѵ�
		LambdaInterface3 li5 = () -> System.out.println("no parameter");
		li5.method();

		// ��ȯ ���� �ִ� ���
		LambdaInterface4 li6 = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.printf("lib6.method(10,20) : %d\n", li6.method(10, 20));

	}

}
