import com.sun.javafx.PlatformUtil;

import junit.framework.Assert;
import pageobjects.hotelobjects;
import resources.base;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HotelBookingTest extends base{
	
	
@BeforeTest
	
	public void initialize() throws IOException
	{
		
		 driver =setDriverPath();
			
		driver.get(prop.getProperty("url"));
	}

    @Test
    public void shouldBeAbleToSearchForHotels() {
    	    
        hotelobjects ho = new hotelobjects(driver);
        
        ho.hotelLink().click();
        
        ho.locality().sendKeys("Indiranagar,Bangalore");
        
        ho.travellers().click();

        ho.search().click();
        
            
    }

@AfterTest
	
	public void teardown()
	{
		
		driver.quit();
		driver=null;
		
	}
    
}
