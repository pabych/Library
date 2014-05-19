package model;

public class Bookmark {
	
	private Book book;
	
	
	public Bookmark(Book book){
		this.book = book;
	}
	
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
	
	
	@Override
    public String toString()
    {
        return this.book+" ";
    }
}
