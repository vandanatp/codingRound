import com.sun.javafx.PlatformUtil;

import pageobjects.loginobjects;
import resources.base;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignInTest extends base {
	
    @BeforeTest
	
	public void initialize() throws IOException
	{
		
		 driver =setDriverPath();
			
		driver.get(prop.getProperty("url"));
	}

    @Test
    public void shouldThrowAnErrorIfSignInDetailsAreMissing() {

          
        loginobjects lo = new loginobjects(driver);
        
        lo.useraccount().click();

        lo.signin().click();
        
        driver.switchTo().frame(driver.findElement(By.id("modal_window")));
        
        lo.signinbutton().click();

        String errors1 = lo.error().getText();
        
        Assert.assertTrue(errors1.contains("There were errors in your submission"));
        
        
    }

    @AfterTest
	
	public void teardown()
	{
		
		driver.quit();
		driver=null;
		
	}

}
