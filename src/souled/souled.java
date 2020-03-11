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
public class souled
{
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

	 void add_to_cart()
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
	 @Test (priority=6)
	 void share()
	 {
		 try{
			 driver.findElements(By.className("sharebtns f22"));//xpath("/html/body/div[1]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[7]/div/div[2]/div/span[1]/i")
			 //Since, no exception, so element is present
			 System.out.println("Element present");
			}
			catch(NoSuchElementException e){
			 //Element is not present
			 System.out.println("Element not present");
			}
	 }
	 @Test (priority=7)
	 void quantity()
	 {
		 try{
			 driver.findElements(By.className("fltdiv lh28"));//xpath("/html/body/div[1]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[7]/div/div[2]/div/span[1]/i")
			 //Since, no exception, so element is present
			 System.out.println("Element present");
			}
			catch(NoSuchElementException e){
			 //Element is not present
			 System.out.println("Element not present");
			}
	 }
	 //
	 @Test (priority=8)
	 void pro_des()
	 {
		 try
		 {
			 driver.findElements(By.xpath("//*[@id=\"headingTwo\"]/h5/a"));//xpath("/html/body/div[1]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[7]/div/div[2]/div/span[1]/i")
			 //Since, no exception, so element is present
			 System.out.println("Element present");
		 }
			catch(NoSuchElementException e)
		 {
			 //Element is not present
			 System.out.println("Element not present");
		 }
	 }
	 ////*[@id="collapseOne"]/div/p/b
	 @Test (priority=9)
	 void pro_material()
	 {
		 try
		 {
			 driver.findElements(By.xpath("//*[@id=\"collapseOne\"]/div/p/b"));//xpath("/html/body/div[1]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[7]/div/div[2]/div/span[1]/i")
			 //Since, no exception, so element is present
			 System.out.println("Element present");
		}
			catch(NoSuchElementException e){
			 //Element is not present
			 System.out.println("Element not present");
		}
	 }
	 @Test (priority=10)
	 void pro_detail()
	 {
		 try
		 {
			 driver.findElements(By.className("mb-0 accordianheading"));//xpath("/html/body/div[1]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[7]/div/div[2]/div/span[1]/i")
			 //Since, no exception, so element is present
			 System.out.println("Element present");
		}
			catch(NoSuchElementException e){
			 //Element is not present
			 System.out.println("Element not present");
		}
	 }
	 @Test (priority=11)
	 void wash_care()
	 {
		 try
		 {
			 driver.findElements(By.xpath("//*[@id=\"collapseOne\"]/div/p/div/b[1]"));//xpath("/html/body/div[1]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[7]/div/div[2]/div/span[1]/i")
			 System.out.println("Element present");
		}
			catch(NoSuchElementException e){
			
			 System.out.println("Element not present");
		}
	 }
	 @Test (priority=12)
	 void sizing()
	 {
		 try
		 {
			 driver.findElements(By.xpath("//*[@id=\"collapseOne\"]/div/p/div/b[2]"));//xpath("/html/body/div[1]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[7]/div/div[2]/div/span[1]/i")
			 System.out.println("Element present");
		}
			catch(NoSuchElementException e){
			
			 System.out.println("Element not present");
		}
	 }
}
	 
	