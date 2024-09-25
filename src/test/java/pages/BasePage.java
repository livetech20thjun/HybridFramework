package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import base.BaseTest;

public class BasePage extends BaseTest{
	
	public void verifyTitle(String expTitle)
	{
		Assert.assertEquals(driver.getTitle(), expTitle);
	}
	
	public void selectOptionDropdown(WebElement element,String option)
	{
		new Select(element).selectByVisibleText(option);
	}
	
	public void clearAndType(WebElement element,String text)
	{
		element.clear();
		element.sendKeys(text);
	}

}
