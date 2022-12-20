package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass  {
 
	public Login() {
    PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	WebElement name;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(id="login")
	WebElement login;
	
	@FindBy(id="location")
	WebElement locat;
	
	@FindBy (id="hotels")
	WebElement  hotel;
	
	@FindBy (name="room_type")
	WebElement room;
	
	@FindBy (id="room_nos")
	WebElement no;
	
	@FindBy (id="datepick_in")
	WebElement date;
	
	@FindBy(id="datepick_out")
    WebElement out;
	
	@FindBy(id="adult_room")
	WebElement adult;
	
	@FindBy(id="child_room")
	WebElement child;
	
	
	@FindBy(name="Submit")
	WebElement search;
	
	@FindBy(id="radiobutton_0")
	WebElement radio;
	
	@FindBy(name="continue")
	WebElement cc;
	
	@FindBy(name="first_name")
	WebElement f1;
	
	@FindBy(id="last_name")
	WebElement f2;
	
	@FindBy(id="address")
	WebElement add;
	
	@FindBy(name="cc_num")
	WebElement cred;
	
	@FindBy(id="cc_type")
	WebElement tt;
	
	@FindBy(id="cc_exp_month")
	WebElement mm;
	
	@FindBy(name="cc_exp_year")
	WebElement yy;
	
	@FindBy(name="cc_cvv")
	WebElement cvv;
	
	@FindBy(id="book_now")
	WebElement now;
	
	@FindBy(id="order_no")
	WebElement attribute;
	
	
}
