import com.sun.javafx.PlatformUtil;



import pageobjects.flightobjects;
import resources.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;



public class FlightBookingTest extends base {
	
	
	@BeforeTest
	
	public void initialize() throws IOException
	{
		
		 driver =setDriverPath();
			
		driver.get(prop.getProperty("url"));
	}


	
	@Test
    public void testThatResultsAppearForAOneWayJourney() throws InterruptedException {

                
        flightobjects fo = new flightobjects(driver);
        
        fo.oneway().click();
        
        fo.source().sendKeys("Bangalore");
        
        List<WebElement> sourceoptions =driver.findElement(By.id("ui-id-1")).findElements(By.tagName("li"));
        
        for(WebElement suggest : sourceoptions)
        {
        	if(suggest.getText().equalsIgnoreCase("Bangalore, IN - Kempegowda International Airport (BLR)"))
        	{
        		suggest.click();
        	}
        }
       
        fo.destination().sendKeys("Delhi");
        
        List<WebElement> destinationoptions = driver.findElement(By.id("ui-id-2")).findElements(By.tagName("li"));
        
        for(WebElement suggest1 : destinationoptions)
        {
        	if(suggest1.getText().equalsIgnoreCase("New Delhi, IN - Indira Gandhi Airport (DEL)"))
        	{
        		suggest1.click();
        	}
        }
        
        fo.date().click();
        
        fo.currentdate().click();        
        
        fo.search().click();
       
        Assert.assertTrue(fo.searchsummary().isDisplayed());
        
       

    } 

	@AfterTest
	
	public void teardown()
	{
		
		driver.quit();
		driver=null;
		
	}

    }


  

