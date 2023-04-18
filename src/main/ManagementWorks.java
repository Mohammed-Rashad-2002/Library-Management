package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import authorization.User;
import authorization.UserAutho;

public class ManagementWorks {
	static String path1, path2;
	static int bNo;
	static Scanner sc = new Scanner(System.in);
	static OutputStream os, os2;
	static List<OutputStream> osl = new ArrayList<>();
	static InputStream is, is2;
	static List booklist = new ArrayList();
	static List bookContent = new ArrayList();
	static List bookName = new ArrayList();
	static byte[] b1;
	static byte[] b2;

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
		String title = "", author = "", language = "";
		int year = 0;
		System.out.print("Enter Book title: ");
		sc.nextLine();
		title = sc.nextLine();
		bookName.add(title);
		System.out.print("\nEnter Author Name: ");
		author = sc.nextLine();
		System.out.print("\nEnter Language: ");
		language = sc.nextLine();
		System.out.print("\nEnter published year: ");
		year = sc.nextInt();
		Book book1 = new Book(title, author, language, year);
		path1 = "F:\\Project\\Java\\Book\\" + title + ".txt";
		path2 = "F:\\Project\\Java\\Book\\" + title + year + ".txt";
		try {
			os = new FileOutputStream(path1);
			os2 = new FileOutputStream(path2);
			System.out.println("Enter the Story");
			sc.nextLine();
			String data = sc.nextLine();
			b1 = data.getBytes();
			b2 = book1.toString().getBytes();
			try {

				os.write(b1);
				os2.write(b2);
				System.out.println("Done");
				bookContent.add(path1);
				booklist.add(path2);
				os.close();
				os2.close();

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Cannot write");
			}
		} catch (IOException io) {
			System.out.println("path is incorrect please check!!!");
		}
	}

	public static void readBook() {
		
		System.out.println("Here are the Available book in the library ");
		
		for (int i = 0; i < bookName.size(); i++) {
			System.out.println(i + 1 + ". " + bookName.get(i));
		}
		if (bookName.size()>0) {
			System.out.print("Enter the Book Number you want to Read: ");
			bNo = sc.nextInt();	
		}else {
			System.out.println("No Book Available....");
		}
		

		for (int i = 0; i < bookName.size(); i++) {
			if (i == bNo - 1) {
//				System.out.println(booklist.get(i).toString());
				try {
					is = new FileInputStream(booklist.get(i).toString());
					int res = is.read();
					String fileData = new String(b2);
					String story = new String(b1);
					String[] word = fileData.split(",");
					System.out.print("\nTitle: " + word[0]);
					System.out.print("\nAuthor: " + word[1]);
					System.out.print("\nLanguage: " + word[2]);
					System.out.print("\nYear: " + word[3]);
					System.out.print("\nStory: " + story);
					System.out.println();
					System.out.println();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}

	}

	public static void removeBook() {
		System.out.println("Here are the available book: ");
		for (int i = 0; i < bookName.size(); i++) {
			System.out.println(i + 1 + ". " + bookName.get(i).toString());
		}
		System.out.println("Which book you want to remove");
		bNo = sc.nextInt();
		if (booklist.size() >= bNo - 1) {
			booklist.remove(bNo - 1);
			bookContent.remove(bNo - 1);
			bookName.remove(bNo - 1);
		} else {
			System.out.println("Book is Not available");
		}
	}
}
