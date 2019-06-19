package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginobjects {

	WebDriver driver;
	public loginobjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
   By trips=By.id("userAccountLink");
   
   By signin = By.xpath("//input[@id='SignIn']");
   
   By signinbutton = By.id("signInButton");
   
   By error = By.id("errors1");
   
	   
   public WebElement useraccount()
   {
	   return driver.findElement(trips);
   }
         
   public WebElement signin()
   {
	   return driver.findElement(signin);
   }
   
   public WebElement error()
   {
	   return driver.findElement(error);
   }
   
   public WebElement signinbutton()
   {
	   return driver.findElement(signinbutton);
   }
   
   
   
}
