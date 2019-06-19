package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.javafx.PlatformUtil;

public class base {
	
	public static WebDriver driver;
	public Properties prop;
	
	String workingDir = System.getProperty("user.dir");
	
	public WebDriver setDriverPath() throws IOException
	{
		prop= new Properties();
		FileInputStream fis=new FileInputStream(workingDir+ "\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
	 if (PlatformUtil.isMac()) {
         System.setProperty("webdriver.chrome.driver", "chromedriver");
         driver = new ChromeDriver();
     }
     if (PlatformUtil.isWindows()) {
         System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
         driver = new ChromeDriver();
     }
     if (PlatformUtil.isLinux()) {
         System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
         driver = new ChromeDriver();
     }
	 
     driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	 return driver;	
	}

	
}
