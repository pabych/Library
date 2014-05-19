package Service;

import java.io.FileWriter;
import java.io.IOException;


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
		   
		   for (User userok : ls.getFdb().getUsers()) {
			   Element user = new Element("user");  
			  
			  
			   user.setAttribute(new Attribute("id", Integer.toString(userok.getId())));
			   user.setAttribute(new Attribute("name", userok.getName()));
			   user.setAttribute(new Attribute("lastname", userok.getLastname()));
			   user.setAttribute(new Attribute("nickname", userok.getNickname()));
			   user.setAttribute(new Attribute("email", userok.getMail()));
			   
			   
			   Element orders = new Element("orders");
			   orders.addContent(new Element("order").setText("1"));
			   user.addContent(orders);
			   
			   Element bookmarks= new Element("bookmarks");
			   bookmarks.addContent(new Element("bookmark").setText("2"));
			   user.addContent(bookmarks);
			   
			   users.addContent(user);
		   
		   
		   }
		   
		     
		   XMLOutputter xmlOutput = new XMLOutputter();  
		    
		   xmlOutput.output(document, System.out);  
		  
		    
		   xmlOutput.setFormat(Format.getPrettyFormat());  
		   xmlOutput.output(document, new FileWriter(  
		     "testUser.xml"));  
		  
		  } catch (IOException io) {  
		   System.out.println(io.getMessage());  
		  }  
		 } 
}
