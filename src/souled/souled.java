package souled;
import org.testng.AssertJUnit;
import org.testng.annotations.*;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class souled
{
	WebDriver driver;
	@BeforeSuite (alwaysRun=true,enabled=true)
	void configure()
	{
		String baseurl="https://www.thesouledstore.com/";
		System.setProperty("webdriver.chrome.driver", "G:\\study\\SEM 6\\Test Automation\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.thesouledstore.com/");
	}
	  @BeforeTest 
	  public void verifyTitle() {
	  driver.get("https://www.thesouledstore.com"); 
	  String ActualTitle=driver.getTitle();
	  System.out.println(ActualTitle);
	  String ExpectedTitle="Buy Men, Women t-shirts, joggers, jackets online at The Souled Store | The Souled Store";
	  AssertJUnit.assertEquals(ActualTitle, ExpectedTitle);
	  System.out.println("Assert passed"); 
	  }
	  @Test(enabled=true)
	    public void assertURL() 
	  { 
	    //
	     driver.get("https://www.thesouledstore.com/");   
	     String actualURL = driver.getCurrentUrl();
	     System.out.println(actualURL);   
	     String expectedURL=null  ; 
	     AssertJUnit.assertNull("Not Null",expectedURL);
	     System.out.println("Test Passed");       
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
		  element.sendKeys("mkeshav126@gmail.com");
		  element.submit(); 
	  }
	  //xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div/form/div[2]/div/input")
	  @Test (priority=2,alwaysRun=true)
	  void login_pass() throws InterruptedException 
	  {
		  WebElement element;
		  element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div/form/div[2]/div/input"));
		  element.sendKeys("qwerty12");
		  element.submit(); 
		  Thread.sleep(10000);
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
	 @Test (priority=6,enabled=false)
	 void share_false()
	 {
		 try
		 {
			 driver.findElements(By.className("sharebtns f22"));//xpath("/html/body/div[1]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[7]/div/div[2]/div/span[1]/i")
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
	 }////*[@id="collapseOne"]/div/p/div/b[3]
	 @Test (priority=13)
	 void del_pro()
	 {
		 try
		 {
			 driver.findElements(By.xpath("//*[@id=\"collapseOne\"]/div/p/div/b[3]"));//xpath("/html/body/div[1]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[7]/div/div[2]/div/span[1]/i")
			 System.out.println("Element present");
		}
			catch(NoSuchElementException e){
			
			 System.out.println("Element not present");
		}
	 }
	 @Test (priority=14)
	 void del_time()
	 {
		 try
		 {
			 driver.findElements(By.xpath("//*[@id=\"collapseOne\"]/div/p/div/b[4]"));//xpath("/html/body/div[1]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[7]/div/div[2]/div/span[1]/i")
			 System.out.println("Element present");
		}
			catch(NoSuchElementException e){
			
			 System.out.println("Element not present");
		}
	 }
	 @Test (priority=15)
	 void side_bar()
	 {
		 try
		 {
			 driver.findElements(By.xpath("//*[@id=\"app\"]/div/div[1]/nav/button/span"));//xpath("/html/body/div[1]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[7]/div/div[2]/div/span[1]/i")
			 System.out.println("Element present");
		}
			catch(NoSuchElementException e){
			
			 System.out.println("Element not present");
		}
	 }
	 @Test (priority=16)
	 void select_size()
	 {
		 WebElement element;
		 element=driver.findElement(By.xpath("//*[@id=\"4\"]"));
		 element.click();
	 }
	 @Test (priority=17)
	 void addtc()
	 {
		 WebElement element;
		 element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div[2]/div/div[2]/div[2]/div/div[6]/div/div/div/div/button"));//xpath("/html/body/div[1]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[7]/div/div[2]/div/span[1]/i")
		 element.click();					  
	 }
	 @Test (priority=18)
	 void gtc() throws InterruptedException
	 {
		 Thread.sleep(1000);
		 WebElement element;
		 element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div[2]/div/div[2]/div[2]/div/div[6]/div/div/div/div/a"));//xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[6]/div/div/div/div/a")
		 
		 Thread.sleep(1000);
		// element=driver.findElement(By.xpath("//*[@id=\"navbarDropdownuser\"]"));//xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[6]/div/div/div/div/a")
		 element.click(); 
	 }
	 @Test (priority=19)
	 void tot_payable()
	 {
		 try
		 {
			 driver.findElements(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]"));//xpath("/html/body/div[1]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[7]/div/div[2]/div/span[1]/i")
			 System.out.println("Element present");
		}
			catch(NoSuchElementException e){
			
			 System.out.println("Element not present");
		}
	 }
	 @Test (priority=20)
	 void no_of_items_cart()
	 {
		 try
		 {
			 driver.findElements(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div"));//xpath("/html/body/div[1]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[7]/div/div[2]/div/span[1]/i")
			 System.out.println("Element present");
		}
			catch(NoSuchElementException e){
			
			 System.out.println("Element not present");
		}
	 }
	 @Test (priority=21)
	 void cart_item_details()
	 {
		 try
		 {
			 driver.findElements(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div[3]/div[1]/div[2]/div"));
			 try
			 {
				 driver.findElements(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div[3]/div[1]/div[2]/div/div[1]/div[2]/div/div[1]/h5/a"));
				 driver.findElements(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div[3]/div[1]/div[2]/div/div[1]/div[2]/div/div[1]/div"));
				 driver.findElements(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div[3]/div[1]/div[2]/div/div[1]/div[2]/div/div[1]/div/div[1]"));
				 driver.findElements(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div[3]/div[1]/div[2]/div/div[1]/div[2]/div/div[1]/div/div[2]/select"));
				 driver.findElements(By.xpath("//*[@id=\"c_0_up\"]/div[1]/div/button"));
				 System.out.println("All elements presents");
			 }
			 catch(NoSuchElementException e)
			 {
				 System.out.println("Element not present");
			 }
			 System.out.println("Element present");
		 }
		 catch(NoSuchElementException e){
			
			 System.out.println("Element not present");
		}
	 }
	 @Test (priority=22)
	 void coupon()
	 {
		 try
		 {
			 driver.findElements(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div[3]/div[2]/div/div[1]"));
			 driver.findElements(By.id("couponcode"));
			 driver.findElements(By.xpath("//*[@id=\"couponApply\"]"));
			 System.out.println("Element present");
		}
			catch(NoSuchElementException e){
			
			 System.out.println("Element not present");
		}
	 }
	 @Test (priority=23)
	 void billing_details()
	 {
		 try
		 {
			 driver.findElements(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div[3]/div[2]/div/div[4]/div[2]"));// cart total
			
			 driver.findElements(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div[3]/div[2]/div/div[4]/div[2]/ul/li[3]"));//gst ////*[@id="app"]/div/div[3]/div[2]/div[3]/div[2]/div/div[4]/div[2]/ul/li[4]
			 System.out.println("Element present");
		}
			catch(NoSuchElementException e){
			
			 System.out.println("Element not present");
		}
	 }
	 @Test (priority=24)
	 void total_payable()
	 {
		 try
		 {
			 driver.findElements(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div[3]/div[2]/div/div[4]/div[2]/ul/li[5]"));// cart total
			 System.out.println("Element present");
		}
			catch(NoSuchElementException e){
			
			 System.out.println("Element not present");
		}
	 }
	 @Test (priority=25)
	 void need_help ()
	 {
		 try
		 {
			 driver.findElements(By.xpath("/html/body/div[1]/div/footer/div[1]/div[1]/div[1]"));
			 driver.findElements(By.xpath("//*[@id=\"app\"]/div/footer/div[1]/div[1]/div[1]/div/ul/li[1]/a"));
			 System.out.println("Element present");
		}
			catch(NoSuchElementException e){
			
			 System.out.println("Element not present");
		}
	 }
	 @Test (priority=26)
	 void about()
	 {
		 try
		 {
			 driver.findElements(By.xpath("//*[@id=\"app\"]/div/footer/div[1]/div[1]/div[2]"));
			 driver.findElements(By.xpath("//*[@id=\"app\"]/div/footer/div[1]/div[1]/div[2]/div/ul/li[1]/a"));
			 System.out.println("Element present");
		}
			catch(NoSuchElementException e){
			
			 System.out.println("Element not present");
		}
	 }
	 
	 @Test (priority=27)
	 void place_order_btn()
	 {
		 try
		 {
			 WebElement element;
			 driver.findElements(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div[3]/div[2]/div/div[6]/button"));
			 System.out.println("Element present");
			 element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div[3]/div[2]/div/div[6]/button"));
			 element.click();
			 
		}
			catch(NoSuchElementException e){
			
			 System.out.println("Element not present");
		}
	 }
	 
	////*[@id="listaddress"]/div/div/div
		@Test (priority=28)
		void address()
		 {
			 try
			 {
				 WebElement element;
				 driver.findElements(By.xpath("//*[@id=\"listaddress\"]/div/div/div"));
				 System.out.println("Element present");
				 
			}
				catch(NoSuchElementException e){
				
				 System.out.println("Element not present");
			}
		 }///html/body/div[1]/div/div[3]/div[2]/div/div[2]/div/div[1]/div/div[2]/ul
		@Test (priority=29)
		void to_pay()
		 {
			 try
			 {
				 WebElement element;
				 driver.findElements(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div/div[2]/div/div[1]/div/div[2]/ul"));
				 System.out.println("Element present");
				 
			}
				catch(NoSuchElementException e){
				
				 System.out.println("Element not present");
			}
		 }
		@Test (priority=30)
		void con_to_pay()
		 {
			 try
			 {
				 WebElement element;
				 driver.findElements(By.xpath("//*[@id=\"con_payment\"]"));
				 System.out.println("Element present");		 
			}
				catch(NoSuchElementException e)
			 {	
				 System.out.println("Element not present");
			}
		 }
		@AfterTest
		void QuitBrowser()
		{
			
			driver.quit();
		}
	 
}
	 
	