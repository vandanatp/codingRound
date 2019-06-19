package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hotelobjects {

	WebDriver driver;
	public hotelobjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Hotels")
    WebElement hotelLink;
	
	@FindBy(id = "Tags")
    WebElement localityTextBox;

    @FindBy(id = "SearchHotelsButton")
    WebElement searchButton;

    @FindBy(id = "travellersOnhome")
    WebElement travellerSelection;
    
    @FindBy(xpath = "//div[@id='ResultContainer_1_1']//ul[@class='listView clearFix']")
    WebElement searchresult;
    
   
   public WebElement hotelLink()
   {
	   return hotelLink;
   }
         
   public WebElement locality()
   {
	   return localityTextBox;
   }
   
   public WebElement search()
   {
	   return searchButton;
   }
   public WebElement travellers()
   {
	   return travellerSelection;
   }
   public WebElement searchresult()
   {
	   return searchresult;
   }
	
}
