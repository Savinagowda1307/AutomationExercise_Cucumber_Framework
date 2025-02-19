package hooks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.Basclass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	WebDriver driver;
	Properties p;
	@Before
	public void setUp() throws IOException
	{
		driver=Basclass.initiaLizeBrowser();
		p=Basclass.getProperties();
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	
	@AfterStep
	public void addScreenshot(Scenario scenario)
	{
		if(!scenario.isFailed())
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			byte[] sc=ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(sc, "image/png", scenario.getName());
		}
	}
}
