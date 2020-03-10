package souled;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.*;

import java.util.NoSuchElementException;

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
		  element.sendKeys("mkeshav1206@gmail.com");
		  element.submit(); 
	  }
	  //xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div/form/div[2]/div/input")
	  @Test (priority=2)
	  void login_pass() 
	  {
		  WebElement element;
		  element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div/form/div[2]/div/input"));
		  element.sendKeys("qwerty12");
		  element.submit(); 
	  }
	 @Test (priority=3)
	void search()
	{
		WebElement element;
		
		  element=driver.findElement(By.id("search")); 
		  element.sendKeys("tshirts");
		 // WebElement element2  = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/nav/div[1]/div/ul/li[1]/div/div/div/span"));
	     // element2.click();
	} 
	 @Test (priority =4)
	 void select_item()
	 {////*[@id="tshirts"]
	  ////*[@id="tshirts"]
		 driver.navigate().to("https://www.thesouledstore.com/explore/t-shirts");
		  WebElement element7;
		  element7=driver.findElement(By.xpath("//*[@id=\"productlist-168334\"]/a"));
		  element7.click();
	 }
	 @Test (priority=5)

	 void buy_now()
	 {
		 try{
			 driver.findElements(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[6]/div/div/div/div/button"));
			 //Since, no exception, so element is present
			 System.out.println("Element present");
			}
			catch(NoSuchElementException e){
			 //Element is not present
			 System.out.println("Element not present");
			}
	 }
	 }