package Day_004_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class Dropdown {
	
	WebDriver driver;
  @Test
  public void DropDown()throws Exception 
  
  
  {driver = TestBrowser.OpenChromeBrowser();
  
  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
  
  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
  driver.findElement(By.id("btnLogin")).click();
  driver.findElement(By.linkText("Admin")).click();
  driver.findElement(By.id("menu_admin_Organization")).click();
  driver.findElement(By.id("menu_admin_viewLocations")).click();
  driver.findElement(By.id("searchLocation_country")).click();
  
  //Select dropdown22 = new Select(driver.findElement(By.id("searchLocation_country")));
  //dropdown22.selectByIndex(4);
  
  
  //Select dropdown22 = new Select(driver.findElement(By.id("searchLocation_country")));
  //dropdown22.selectByValue("PK");
  
  Select dropdown22 = new Select(driver.findElement(By.id("searchLocation_country")));
  dropdown22.selectByVisibleText("Nepal");
	  
  
	  
  }
}
