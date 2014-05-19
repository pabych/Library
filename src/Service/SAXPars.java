package Service;

import model.Book;
import model.User;

import org.xml.sax.helpers.DefaultHandler; 
import org.xml.sax.*; 

public class SAXPars extends DefaultHandler{
	LibraryService ls = new XmlLibraryService();	
	String thisElement = "";
	Book book;
	User user;
	
	public LibraryService getLs() {
		return ls;
	}

	public void setLs(LibraryService ls) {
		this.ls = ls;
	}

	@Override 
	public void startDocument() throws SAXException { 
	  System.out.println("Start parse XML..."); 
	}
	
	@Override 
	public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException{ 
	  thisElement = qName;
	  if(thisElement == "user"){
		  user = new User(atts.getValue("name"), atts.getValue("lastname"), atts.getValue("nickname"));
		  user.setMail(atts.getValue("email"));
		  user.setId(Integer.parseInt(atts.getValue("id")));
		  ls.getXdb().addUser(user);
		  
	  }
	  
	  

	  if(thisElement == "book"){
		  book = new Book(atts.getValue("title"), atts.getValue("author"));
		  book.setFilename(atts.getValue("filename"));
		  book.setId(Integer.parseInt(atts.getValue("id")));
		  book.setYear(Integer.parseInt(atts.getValue("year")));
		  ls.getXdb().addBook(book);  
	  }
	  
	  if(thisElement == "rate"){
		  user = ls.findUserById(Integer.parseInt(atts.getValue("user")));
		  ls.addComment(user, book, atts.getValue("comment"), Double.parseDouble(atts.getValue("rate")));
	  }
	  
	  if(thisElement == "order"){
		  book = ls.findBookById(Integer.parseInt(atts.getValue("bookid")));
		  ls.addToOrders(user, book);
	  }
	  
	  if(thisElement == "bookmark"){
		  book = ls.findBookById(Integer.parseInt(atts.getValue("bookid")));
		  ls.addToBookmarks(user, book);
	  }
	  
	} 
	
	
	@Override 
	public void characters(char[] ch, int start, int length) throws SAXException {
		
		
		
	}
	
	
	@Override 
	public void endDocument() { 
	  System.out.println("Stop parse XML...");
	}
	
	@Override 
	public void endElement(String namespaceURI, String localName, String qName) throws SAXException {
		
		
	    thisElement = "";
	    
	  
	} 
	
	
}
