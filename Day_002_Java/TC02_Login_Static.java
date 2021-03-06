package Day_002_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC02_Login_Static {
	
	//Global Variables
	static WebDriver driver;
	
	@Test
	public  void Login_Test() throws Exception
	{
		//Global Declaration
		
		TC02_Login_Static.OpenChromeBrowser();
		TC02_Login_Static.OpenOrangeHRM();
		TC02_Login_Static.Login();
		TC02_Login_Static.AddNationality();
		TC02_Login_Static.closeBrowser();
	}
	
	
	

	//Local Variables
	public static void OpenChromeBrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
	}
	
	
	public static void OpenOrangeHRM() throws Exception
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	
	
	public static void Login() throws Exception
	{
		findElement(By.id("txtUsername")).sendKeys("Admin");
		findElement(By.id("txtPassword")).sendKeys("admin123");
		findElement(By.id("btnLogin")).click();

	}
	
	
	public static void AddNationality() throws Exception
	{
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_nationality")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys("China123");
		findElement(By.name("btnSave")).click();
		
	}
	
	
	public static void closeBrowser() throws Exception
	{
		
		driver.quit();
	}
	
	
	
	 public static  WebElement findElement(By by) throws Exception 
		{
	
			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			return elem;
		}

	
	

}
