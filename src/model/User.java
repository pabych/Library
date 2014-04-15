package model;

import java.util.ArrayList;

public class User {
	private String name;
	private String lastname;
	private String nickname;
	private String mail;
	private ArrayList <Order> orders;
	private ArrayList <Bookmark> bookmark;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public ArrayList<Order> getOrders() {
		return orders;
	}


	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}


	public ArrayList<Bookmark> getBookmark() {
		return bookmark;
	}


	public void setBookmark(ArrayList<Bookmark> bookmark) {
		this.bookmark = bookmark;
	}


	public User(String name, String lastname, String nickname){
		this.name = name;
		this.lastname = lastname;
		this.nickname = nickname;
	}
	
	
	@Override
    public String toString()
    {
        return this.name+" "+this.nickname+" "+this.lastname;
    }
}
