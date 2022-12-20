package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing extends  BaseClass {
	

	public static void main(String[] args) {
		
	launchBrowser("chrome");
	
	urlLaunch("http://adactinhotelapp.com//");
	
	implicityWait(20);
	
	Login l=new Login();
	
	Sendkeys(l.name, "Tharaniapp");
	
	Sendkeys(l.pass, "654321");
	
	click(l.login);
	
	SelectByValue(l.locat, "London");

	SelectByValue(l.hotel, "Hotel Hervey");
		
	SelectByValue(l.room, "Super Deluxe");	
	
    Sendkeys(l.date, "23.12.2022");	
    
    Sendkeys(l.out, "27.12.2022");
    
    SelectByValue(l.adult, "2");
    
    SelectByValue(l.child, "3");
    
    click(l.search);
    
	click(l.radio);
	
	click(l.cc);
	
	Sendkeys(l.f1,"arjun");
		
	Sendkeys(l.f2, "das");
	
	Sendkeys(l.add, "23 main road,dubai");
	
	Sendkeys(l.cred, "5432987600007654");
	
	SelectByValue(l.tt, "VISA");
	
	SelectByValue(l.mm, "8");
	
	SelectByValue(l.yy, "2017");
	
	Sendkeys(l.cvv, "3880");
	
	click(l.now);
	
	String dd = getAttribute(l.attribute,"value");
	System.out.println(dd);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void SendKeys(WebElement name, String string) {
		// TODO Auto-generated method stub
		
	}

	

}
