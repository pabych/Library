package Service;

import java.io.FileWriter;
import java.io.IOException;


import java.util.ArrayList;

import model.Bookmark;
import model.Order;
import model.User;

import org.jdom2.*;
import org.jdom2.input.*;
import org.jdom2.output.*;

import com.sun.xml.internal.ws.message.RootElementSniffer;

public class XmlGen {
	
	public void createUserXml(LibraryService ls) {  

		  
		  
		  try {  
		    
		   Element users = new Element("users");  
		     
		   Document document = new Document(users);  
		   
		   for (User userok : ls.getXdb().getUsers()) {
			   Element user = new Element("user");  
			  
			  
			   user.setAttribute(new Attribute("id", Integer.toString(userok.getId())));
			   user.setAttribute(new Attribute("name", userok.getName()));
			   user.setAttribute(new Attribute("lastname", userok.getLastname()));
			   user.setAttribute(new Attribute("nickname", userok.getNickname()));
			   user.setAttribute(new Attribute("email", userok.getMail()));
			   
			   
			   Element orders = new Element("orders");
			   for(Order orderok : userok.getOrders()){
				   
//				   orders.addContent(new Element("order").setAttribute(new Attribute("bookid",  bookid+"" )));
				   int bookid = orderok.getBook().getId();
				   
				   Element order = new Element("order");
				   orders.addContent(order);
				   order.setAttribute(new Attribute("bookid",  bookid+"" ));
				   order.setAttribute(new Attribute("startdate",  orderok.getStartDate().getTime().toString() ));
				   order.setAttribute(new Attribute("enddate",  orderok.getEndDate().getTime().toString() ));
			   }
			   user.addContent(orders);
			   
			   Element bookmarks= new Element("bookmarks");
			   
			   for(Bookmark bookmarkok : userok.getBookmark()){
				   bookmarks.addContent(new Element("bookmark").setAttribute(new Attribute("bookid", bookmarkok.getBook().getId()+""  )));
			   }
			   user.addContent(bookmarks);
			   
			   users.addContent(user);
		   
		   
		   }
		   
		     
		   XMLOutputter xmlOutput = new XMLOutputter();  
		    
//		   xmlOutput.output(document, System.out);  
		  
		    
		   xmlOutput.setFormat(Format.getPrettyFormat());  
		   xmlOutput.output(document, new FileWriter(  
		     "User.xml"));  
		  
		  } catch (IOException io) {  
		   System.out.println(io.getMessage());  
		  }  
		 } 
}
