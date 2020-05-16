package com.techendear.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;


public class AuthenticationTest {

	public static void main(String[] args) {

		List<User> users = new ArrayList<>();
		users.add(new User("dharam", "123"));
		users.add(new User("durga", "234"));
		users.add(new User("vikki", "789"));
		users.add(new User("koil", "389"));

		Scanner sc = new Scanner(System.in);
		System.out.println("Username:");
		String uname = sc.next();
		System.out.println("Password:");
		String pass = sc.next();

		Predicate<User> pr = myuser -> myuser.userName.equals(uname) && myuser.password.equals(pass);

		for (User user2 : users) {
			if (pr.test(user2)) {
				System.out.println("Authentication Success welcome:"+user2.userName);
				return;
			} else {
				System.out.println("Authentication Failed");
				return;
			}
		}
	}

}
