package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage
{
	public String isOnHomePage()
	{
		return driver.getCurrentUrl();
	}
	
	public CreateQualityPage qualityPage()
	{
		driver.findElement(By.linkText("Quality Management")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Create New Quality")).click();
		return new CreateQualityPage();
	}
	
}