package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CreateQualityPage extends BasePage
{
	public String isOnQualityPage()
	{
		return driver.findElement(By.cssSelector(".main-title.trim-top")).getText();
				
	}
	
	public QualityLibraryPage createQuality()
	{
		
		 Select selectSupplier = new Select (driver.findElement(By.id("supplier")));
		 selectSupplier.selectByVisibleText("JamesBond");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.id("qrc")).sendKeys("AB");
		 driver.findElement(By.id("weight")).sendKeys("100");
		 driver.findElement(By.id("construction")).sendKeys("Construction123");
		 driver.findElement(By.id("width")).sendKeys("100");
		 Select selectFabric = new Select (driver.findElement(By.id("fabric_type")));
		 selectFabric.selectByVisibleText("LACE");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 Select selectCloth = new Select (driver.findElement(By.id("Cloth_Type")));
		 selectCloth.selectByVisibleText("Cotton");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.findElement(By.id("Percentage")).sendKeys("99");
		 driver.findElement(By.id("getpercentage")).click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.findElement(By.id("submit")).click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 return new QualityLibraryPage();
	}
	
}