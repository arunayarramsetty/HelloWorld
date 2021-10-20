package Day_011_Katalon_Recorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver driver;

	@Test
	
	  public void testUntitledTestCase() throws Exception {
	    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	    
	  
	    driver.findElement(By.id("txtUsername")).clear();
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    
	    driver.findElement(By.id("txtPassword")).clear();
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    
	    driver.findElement(By.id("btnLogin")).click();
	    
	    driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
	    driver.findElement(By.id("menu_admin_Organization")).click();
	    driver.findElement(By.id("menu_admin_viewLocations")).click();
	    driver.findElement(By.id("searchLocation_name")).click();
	    driver.findElement(By.id("searchLocation_name")).clear();
	    driver.findElement(By.id("searchLocation_name")).sendKeys("Alwal");
	    driver.findElement(By.id("searchLocation_city")).clear();
	    driver.findElement(By.id("searchLocation_city")).sendKeys("Hyderabad");
	    driver.findElement(By.id("searchLocation_country")).click();
	    new Select(driver.findElement(By.id("searchLocation_country"))).selectByVisibleText("India");
	    driver.findElement(By.id("btnAdd")).click();
	    driver.findElement(By.id("location_name")).click();
	    driver.findElement(By.id("location_name")).clear();
	    driver.findElement(By.id("location_name")).sendKeys("Aalwal");
	    
	}
	}