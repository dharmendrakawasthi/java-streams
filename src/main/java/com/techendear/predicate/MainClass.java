package com.techendear.predicate;

import java.util.ArrayList;
import java.util.List;

import com.techendear.predicate.empmgt.Predicate;

public class MainClass {

	public static void main(String[] args) {
		
		String[] nams = {"Ram","Shyam", "", null, "Suresh"};
		Predicate<String> p = s-> s !=null && s.length() !=0;
		
		List<String> list = new ArrayList<String>();
		
		for(String s: nams) {
			if(p.test(s)) {
				list.add(s);
			}
		}
		
		System.out.println(list);
	}

}
