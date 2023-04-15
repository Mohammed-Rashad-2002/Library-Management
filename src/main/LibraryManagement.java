package main;

import java.util.Scanner;

public class LibraryManagement {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean rep = true;
		System.out.println("\t\t\tWelcome to Rashad's Library");
		while (rep) {
			System.out.println("1.Press if you are staff\n2.Press if you are Reader\n3.Press for exit");
			int num = sc.nextInt();
			if (num == 1) {
				if (ManagementWorks.userDetails() == true) {
					boolean b = true;
					while (b) {
						System.out.println(
								"Press 1 to add book in the library\nPress 2 to read book from library\nPress 3 to remove book from library\nPress 4 for exit");
						switch (sc.nextInt()) {
						case 1: {
							ManagementWorks.addBook();
							break;
						}
						case 2: {
							ManagementWorks.readBook();
							break;
						}
						case 3: {
							ManagementWorks.removeBook();
							break;
						}
						case 4: {
							b = false;
							break;
						}
						default:
							System.out.println("You have entered wrong Input check again");
							break;
						}
					}

				} else {
					System.out.println("You entered wrong input please check again");
				}

			} else if (num == 2) {
				ManagementWorks.readBook();
			} else if (num == 3) {
				rep = false;
			} else {
				System.out.println("You entered wrong input please check again");
			}
		}
	}
}
