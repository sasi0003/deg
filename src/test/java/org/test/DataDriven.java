package org.test;

import java.io.IOException;

public class DataDriven extends BaseClass {
	public static void main(String[] args) throws IOException {
		launchBrowser("chrome");
		urlLaunch("http://adactinhotelapp.com//");
		implicityWait(20);
		Login l =new Login();
		Sendkeys(l.name,Filecopy("Book2", "sheet1", 0, 0));
		Sendkeys(l.pass, Filecopy("Book2", "sheet1", 1, 0));
		click(l.login); 
		SelectByValue(l.locat, Filecopy("Book2", "sheet1", 2, 0) );
        		
		
		
		
		
		
		
		
	}

	
	 
        	
        
        
        
        
	   
}
