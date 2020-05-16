package com.techendear.lambda;

public class MainClass {

	public static void main(String[] args) {
		Functional<String> f = (msg) -> System.out.println(msg);
		f.apply(f);
	}

}
