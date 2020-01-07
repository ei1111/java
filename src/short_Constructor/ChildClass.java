package pjtTest_13;

public class ChildClass {
	String name;
	String gender;
	int age;

	public ChildClass(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;

	}

	public void getInto() {
		System.out.println("--get Info()--");
		System.out.println("name: " + name);
		System.out.println("gender: " + gender);
		System.out.println("age: " + age);
	}
}
