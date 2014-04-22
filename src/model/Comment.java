package model;

public class Comment {
	private double rate;
	private String comment;
	private User user;
	
	public Comment(double rate, String comment, User user) {
		this.rate = rate;
		this.comment = comment;
		this.user = user;
	}
	
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
