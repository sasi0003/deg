package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Facebook extends  BaseClass{

	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement pass;
	@FindBy(name="login")
	WebElement login;
	
}
