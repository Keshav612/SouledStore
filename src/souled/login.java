package souled;

import java.util.ArrayList;

import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;  

public class login {
	
	 public static void main(String[] args) throws InterruptedException {  
	      
         
		 System.setProperty("webdriver.chrome.driver", "G:\\study\\SEM 6\\Test Automation\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();  
        driver.navigate().to("https://www.thesouledstore.com/");  
      
      WebElement element  = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/nav/div[1]/div/ul/li[2]/span/span")); 
      element.click();
	 }
}