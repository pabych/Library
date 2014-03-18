package model;

import java.util.ArrayList;

public class Book {
	private String title;
	private String author;
	private int year;
	private String filename;
	private double rate;
	private ArrayList<String> genre;
	private String description;
	
	public Book(String title, String author, double rate) {
		this.title = title;		
		this.author = author;
		this.rate = rate;
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
    public String toString()
    {
        return this.title+" - "+this.author;
    }
	
}
