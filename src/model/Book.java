package model;

import java.util.ArrayList;

public class Book {
	private String title;
	private String author;
	private int year;
	private String filename;
	private ArrayList <Comment> rating = new ArrayList<Comment>();
	private ArrayList<String> genre;
	private String description;
	
	public Book(String title, String author, double rate) {
		this.title = title;
		this.author = author;
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


	public ArrayList<Comment> getRating() {
		return rating;
	}


	public void setRating(ArrayList<Comment> rating) {
		this.rating = rating;
	}


	public ArrayList<String> getGenre() {
		return genre;
	}


	public void setGenre(ArrayList<String> genre) {
		this.genre = genre;
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


	public void addComment(Comment comment) {
		rating.add(comment);		
	}
	
}
