package souled;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class souled {
	WebDriver driver;
	
	@BeforeTest
	void configure()
	{
		String baseurl="https://www.thesouledstore.com/";//driver.navigate().to("https://www.amazon.in/");
		System.setProperty("webdriver.chrome.driver", "G:\\study\\SEM 6\\Test Automation\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		//obj.get(baseurl);
		driver.navigate().to("https://www.thesouledstore.com/");
	}
	@Test (priority=0)
	void login_btn() 
	  {
		  WebElement element;
		  element=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/nav/div[1]/div/ul/li[2]/span/span"));
		  element.click(); 
	  }
	  @Test (priority=1) 
	  void login() 
	  {
		  WebElement element;
		  element=driver.findElement(By.className("form-control"));
		  element.submit(); 
	  }
	  //xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div/form/div[2]/div/input")
	  @Test (priority=2)
	  void login_pass() 
	  {
		  WebElement element;
		  element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div/form/div[2]/div/input"));
		  element.click(); 
	  }
	@Test (priority=3)
	void search()
	{
		WebElement element;
		/*
		 * element=driver.findElement(By.id("search")); element.sendKeys("shirts");
		 * element.click();
		 */
		element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/nav/a"));
		//element.sendKeys("shirts");
		element.click();
	}
	
	  
	 
}
