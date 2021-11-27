package org.lo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Getteer {
	
	

	
	@FindBy(id="email")
	static WebElement userename;
	
	
	@FindBy(id="pass")
	 static WebElement password;
	
	@FindBy(name="login")
	static WebElement btn;


	
	}
	


