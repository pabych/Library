package model;

import java.util.Calendar;

public class Order {
	private Calendar startDate;
	private Calendar endDate;
	private Book book;
	private String state;
	
	public Order(Calendar date, Calendar dateTo, Book book){
		this.book = book;
		this.startDate = date;
		this.endDate = dateTo;
	}

	public Calendar getStartDate() {
		return startDate;
	}

	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}

	public Calendar getEndDate() {
		return endDate;
	}

	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	

	@Override
    public String toString()
    {
        return this.book+" - "+this.startDate + " - " + this.endDate;
    }
	
}
