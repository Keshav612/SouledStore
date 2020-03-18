package TestA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




		public class shopclues_automation {

			WebDriver driver;
		@BeforeMethod
		public void beforeMethod() {
			System.setProperty("webdriver.chrome.driver", "G:\\study\\SEM 6\\Test Automation\\chromedriver_win32\\chromedriver.exe");
		}
		
	/*
	 * @Test(dataProviderClass =
	 * Dataprovider_common.class,dataProvider="multipletestsinasinglefile") public
	 * void execution(String username, String password) {
	 * System.out.println("checking multiple data login");
	 * 
	 * }
	 */
		@Test
		public  void testcase1()
		{
			WebElement element;
		driver.manage().window().maximize();
		driver.navigate().to("https://www.shopclues.com/");
		        
		       element = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[4]/ul/li[6]/a"));
		        element.sendKeys(Keys.ENTER);
		        element = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[1]/form/fieldset/div[2]/input"));
		        element.sendKeys("muditgarg1211@gmail.com");
		        element = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[1]/form/fieldset/div[3]/input"));
		        element.sendKeys("TestAutomation");
		        element = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[1]/form/fieldset/div[4]/a[1]"));
		        element.click();
		        }				
		
		@Test
		public  void testcase2()
		{
			WebElement element;
		//driver.manage().window().maximize();
		//driver.navigate().to("https://www.shopclues.com/");
		
		        element = driver.findElement(By.id("autocomplete"));
		        element.sendKeys("Iphone 7");
		        element = driver.findElement(By.xpath("//*[@id=\"search\"]/a"));
		        element.click();
		       // WebElement element6 = driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[1]/div[3]/div[1]/a"));
		        //element6.click();	        
		}	
		
		
	
		@AfterMethod
		public void afterMethod() {
			System.out.print("successfull Test");
		}
	
	}