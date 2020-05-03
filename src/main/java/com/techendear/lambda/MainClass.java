package com.techendear.lambda;

public class MainClass {

	public static void main(String[] args) {
		
		Predicate<String> p1 = s-> s.length() < 20;
		Predicate<String> p2 = s-> s.length() > 5;

		Predicate<String> p3 = p1.and(p2);
		
		System.out.println("And Predicate: " + p3.test("Hello World"));
		System.out.println("And Predicate > 20: " +p3.test("Hello World garbage collector is an java thread"));

		Predicate<String> p4 = p1.or(p2);
		
		System.out.println("OR < 5: "+p3.test("Hola Baraf ka Gola"));
		boolean b = p1.test("Hello Wor");
		System.out.println(b);
	}
}
