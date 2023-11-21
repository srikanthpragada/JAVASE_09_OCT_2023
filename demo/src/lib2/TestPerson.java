package lib2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return  name + " - " + age;
	}
}

class SortByAge implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		 return p1.getAge() - p2.getAge();
	}
}

public class TestPerson {
	public static void main(String[] args) {
		var persons = new ArrayList<Person>();

		persons.add(new Person("Abc", 30));
		persons.add(new Person("Xyz", 20));
		persons.add(new Person("Pqr", 50));
		
		//Collections.sort(persons, new SortByAge());
		// Lambda Expression 
		Collections.sort(persons, (p1, p2) -> p1.getAge() - p2.getAge());
		
		for(var p : persons)
			System.out.println(p);

	}

}
