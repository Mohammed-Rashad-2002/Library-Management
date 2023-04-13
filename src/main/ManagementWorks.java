package main;

import java.util.Scanner;

import authorization.User;
import authorization.UserAutho;

public class ManagementWorks {
	static Scanner sc = new Scanner(System.in);

	public static Boolean userDetails() {
		System.out.print("Enter Your Name: ");
		String name = sc.next();
		System.out.print("Enter Your Password: ");
		String password = sc.next();
		new User();
		UserAutho.user();
		for (int i = 0; i < UserAutho.userList.size(); i++) {
//			System.out.println(UserAutho.userList.size());
			if (UserAutho.userList.get(i).getName().equals(name)
					&& UserAutho.userList.get(i).getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	public static void addBook() {
		System.out.println("Book adding page");
	}

	public static void readBook() {
		System.out.println("Book reading page");
	}

	public static void removeBook() {
		System.out.println("Book removing page");
	}
}
