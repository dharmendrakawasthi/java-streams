package com.techendear.mrf;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(25, "Dharam", "dharam@gmail.com"));
		employees.add(new Employee(35, "Abhishek", "abhi@gmail.com"));
		employees.add(new Employee(30, "Veena", "veena@gmail.com"));
		employees.add(new Employee(40, "Sandeep", "sandeep@gmail.com"));

		Stream<Employee> stream = employees.stream();

		stream.map(age -> age.getAge() > 25).forEach(System.out::println);
	}
}
