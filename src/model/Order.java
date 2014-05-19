package model;

import java.util.Calendar;

public class Order {
	private Calendar startDate;
	private Calendar endDate;
	private Book book;
	private String state;
	
	public Order(Book book){
		this.book = book;
		Calendar date = Calendar.getInstance();
		Calendar dateTo = Calendar.getInstance();
		dateTo.add(Calendar.DAY_OF_YEAR, 14); 
		
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
        return this.book+" - "+this.startDate.getTime() + " - " + this.endDate.getTime();
    }
	
}
