package lib1;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class TestPerson {

	public static void main(String[] args) {
		Person p1 = new Person("Scott", 35);
		System.out.println(p1.toString());
	}
}
