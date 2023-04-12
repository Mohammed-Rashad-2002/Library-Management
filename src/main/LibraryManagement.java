package main;

import java.util.Scanner;

import authorization.*;

public class LibraryManagement {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("\t\t\tWelcome to Rashad's Library");
		System.out.println("1.Press if you are staff\n2.Press if you are Reader");
		int num = sc.nextInt();
		if (num == 1) {
			if(ManagementWorks.userDetails()==true) {
				System.out.println("Welcome");
			}

		} else if (num == 2) {

		} else {

		}
	}
}
