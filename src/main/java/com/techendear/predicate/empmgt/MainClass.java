package com.techendear.predicate.empmgt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		Predicate<String> p1 = s -> s.length() < 20;
		Predicate<String> p2 = s -> s.length() > 5;

		Predicate<String> p3 = p1.and(p2);
		
		System.out.println("And Predicate: " + p3.test("Hello World"));
		System.out.println("And Predicate > 20: " + p3.test("Hello World garbage collector is an java thread"));

		Predicate<String> p4 = p1.or(p2);

		System.out.println("OR < 5: " + p3.test("Hola Baraf ka Gola"));
		boolean b = p1.test("Hello World");
		System.out.println(b);
		// Writing lambda expression is not easy as we think
		List<Integer> list = new ArrayList<>();
		list.add(45);
		list.add(1);
		list.add(8);
		list.add(0);
		list.add(2);
		System.out.println(list);
		Collections.sort(list, (s1, s2) -> (s1 > s2) ? -1 : (s1 < s2) ? 1 : 0);
		System.out.println(list);
	}
}
