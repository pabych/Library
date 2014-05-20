package main;

import java.io.File;
import java.io.IOException;


import java.text.ParseException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
 






import org.xml.sax.*; 

import Service.LibraryService;
import Service.ConsoleInterface;
import Service.SAXPars;
import Service.XmlGen;

public class Main {
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, ParseException {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
		SAXParserFactory factory = SAXParserFactory.newInstance(); 
		SAXParser parser = factory.newSAXParser();
		SAXPars saxp = new SAXPars(); 
		
		parser.parse(new File("book.xml"), saxp);
		parser.parse(new File("user.xml"), saxp);
		
		
		LibraryService ls = saxp.getLs();
		
		ConsoleInterface ci = new ConsoleInterface();
		ci.consoleStart(ls);
		
		XmlGen asd = new XmlGen();
		asd.createUserXml(ls);
		
		
		
		
	}
}
