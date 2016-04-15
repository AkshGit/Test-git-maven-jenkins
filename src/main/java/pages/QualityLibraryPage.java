package pages;

import org.openqa.selenium.By;

public class QualityLibraryPage extends BasePage
{
	public String isOnQualityLibraryPage()
	{
		return driver.findElement(By.cssSelector(".main-title.trim-top")).getText();
	}
	
	

}
