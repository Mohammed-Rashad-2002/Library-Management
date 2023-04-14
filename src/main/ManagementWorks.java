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
	static Scanner sc = new Scanner(System.in);
	static OutputStream os, os2;
	static InputStream is;
	static List booklist = new ArrayList();
	static List bookContent = new ArrayList<>();
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
//				booklist.add(book1);
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

	public static void readBook(){
		String bookName="",fileData="";
//		for (Book object : booklist) {
//			System.out.println(object.getTitle());
//		}
//		if (booklist.size() > 0) {
//			System.out.println("Here are the Available book");
//			for (int i = 0; i < booklist.size(); i++) {
//				System.out.println(booklist.get(i).getTitle());
//			}
//		} else {
//			System.out.println("Book is not available");
//		}
		
		
		for (int i = 0; i < booklist.size(); i++) {
//			System.out.println(booklist.get(i).getTitle());
			try {
			is=new FileInputStream(path2);
			int res=is.read();
//			System.out.println((char)res);
			fileData=new String(b2);
			String []word=fileData.split(" ");
//			System.out.println(word);
			bookName=word[0];
			System.out.println(bookName);
			System.out.println("end");
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("File Not found");
			}
		}

	}

	public static void removeBook() {
		System.out.println("Book removing page");
	}
}
