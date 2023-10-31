package oop2;

import java.util.Arrays;

class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	// 0 - equal, > 0 - this > other , < 0 - this < other
	@Override
	public int compareTo(Person other) {
		System.out.println("compareTo");
		return this.age - other.age;
	}
}

public class SortPersons {
	public static void main(String[] args) {
		Person[] persons = { new Person("A", 30), new Person("C", 20), new Person("B", 40) };

		Arrays.sort(persons);

		for (var p : persons)
			System.out.println(p);
	}

}
