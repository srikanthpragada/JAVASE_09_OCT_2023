package oop2;

import java.util.Arrays;
import java.util.Comparator;

class NameCompare implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
	    return p1.getName().compareTo(p2.getName()); 
	}
}

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
	
	public String getName() {
		return this.name;
	}
}

public class SortPersons {
	public static void main(String[] args) {
		Person[] persons = { new Person("AA", 30), new Person("C", 20), new Person("BBB", 40) };

		//Arrays.sort(persons);
		//Arrays.sort(persons,  new NameCompare());
		
//		Arrays.sort(persons, 
//				(p1, p2) -> p1.getName().compareTo(p2.getName()));
		
		Arrays.sort(persons, 
				 new Comparator<Person>() {
					@Override
					public int compare(Person p1, Person p2) {
						 return p1.getName().length() - 
								   p2.getName().length();
					}
			
		});

		for (var p : persons)
			System.out.println(p);
	}

}
