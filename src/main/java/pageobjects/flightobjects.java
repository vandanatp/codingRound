package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class flightobjects {

	WebDriver driver;
	public flightobjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
   By oneway=By.id("OneWay");
   
   By source = By.id("FromTag");
   
   By destination = By.id("ToTag");
   
   By date = By.id("DepartDate");
   
   By currentdate = By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active");
   
   By search = By.xpath("//input[@id='SearchBtn']");
   
   By searchsummary = By.xpath("//div[@id='ResultContainer_1_1']//ul[contains(@class,'listView flights')]");
   
   public WebElement oneway()
   {
	   return driver.findElement(oneway);
   }
         
   public WebElement source()
   {
	   return driver.findElement(source);
   }
   
   public WebElement destination()
   {
	   return driver.findElement(destination);
   }
   
   public WebElement date()
   {
	   return driver.findElement(date);
   }
  
   public WebElement currentdate()
   {
	   return driver.findElement(currentdate);
   }
   
   public WebElement search()
   {
	   return driver.findElement(search);
   }
   public WebElement searchsummary()
   {
	   return driver.findElement(searchsummary);
   }
	
      
   
}
