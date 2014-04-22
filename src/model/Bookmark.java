package model;

public class Bookmark {
	private Book book;
	private String mark;
	
	public Bookmark(Book book, String mark){
		this.book = book;
		this.mark = mark;
	}
	
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	
	
	@Override
    public String toString()
    {
        return this.book+" - "+this.mark;
    }
}
