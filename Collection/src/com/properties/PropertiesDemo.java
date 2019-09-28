package com.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {

		
		/*Properties p=new Properties();
		FileInputStream fis=new FileInputStream("test.properties");
		p.load(fis);
		System.out.println(p);*/
		
		FileReader reader=new FileReader("test.properties");  
	      
	    Properties p=new Properties();  
	    p.load(reader);  
	      
	    System.out.println(p.getProperty("Suresh")); 
	}

}
