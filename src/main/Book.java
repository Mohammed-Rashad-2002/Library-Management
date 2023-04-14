package main;

public class Book {
	private String title, author, language;
	private int year;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, String language, int year) {
		super();
		this.title = title;
		this.author = author;
		this.language = language;
		this.year = year;
	}
	
	@Override
	public String toString() {
		return ""+title+",\n"+author+",\n"+language+",\n"+year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
