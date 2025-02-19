package factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.core.logging.Logger;

public class Basclass {

	
	public static WebDriver driver;
	static Properties p;
	static Logger logger;
	
	
	public static WebDriver initiaLizeBrowser() throws IOException
	{
		p=getProperties();
		String env=p.getProperty("env_variable").toLowerCase();
		String browser=p.getProperty("browser").toLowerCase();
		String os=p.getProperty("os").toLowerCase();
		
		if(env.equalsIgnoreCase("remote"))
		{
			DesiredCapabilities capabilities=new DesiredCapabilities();
			
			//os
			switch(os)
			{
			case "windows":capabilities.setPlatform(Platform.WINDOWS);break;
			case "mac":capabilities.setPlatform(Platform.MAC);break;
			case "linux":capabilities.setPlatform(Platform.LINUX);break;
			default:System.out.println("No matching browser");
			return null;
			}
			
			//browser
			switch(browser)
			{
			case "chrome":capabilities.setBrowserName("chrome");break;
			case "edge":capabilities.setBrowserName("MicrsoftEdge");break;
			case "firefox":capabilities.setBrowserName("firefox");break;
			default:System.out.println("no mathing browser"); return null;
			
			}
			
			driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
					
					
		}
		
		else if(env.equalsIgnoreCase("local"))
		{
			switch(browser)
			{
			case "chrome":driver=new ChromeDriver();break;
			case "edge":driver=new EdgeDriver();break;
			case "firefox":driver=new FirefoxDriver();break;
			default:System.out.println("no mathing browser");
			return null;
		}
	}
	
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		return driver;
	}
	public static Properties getProperties() throws IOException
	{
		FileInputStream file=new FileInputStream("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		return p;
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	
	public static String returnRandomString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(6);
		return generatedString;
	}
	
	public static String returnRandomNumeric()
	{
		String generatedNumeric=RandomStringUtils.randomNumeric(10);
		return generatedNumeric;
	}
	
	public static String returnRandomAlphaNumeric()
	{
		String generatedAlphaNumeric=RandomStringUtils.randomAlphabetic(6)+"@"+RandomStringUtils.randomNumeric(5);
		return generatedAlphaNumeric;
	}
		
}


