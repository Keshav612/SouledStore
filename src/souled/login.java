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
	
	 public static void main(String[] args) throws InterruptedException 
	 {       
		 System.setProperty("webdriver.chrome.driver", "G:\\study\\SEM 6\\Test Automation\\chromedriver_win32\\chromedriver.exe"); 
      WebDriver driver=new ChromeDriver();  
      driver.navigate().to("https://www.amazon.com/");  
      WebElement element  = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/nav/div[1]/div/ul/li[2]/span/span"));//used xpath to login properly 
      element.click();
      WebElement element2  = driver.findElement(By.className("nav-link"));
      element.click();
		/*
		 * element2.sendKeys("mkeshav1026@gmail.com"); element2.submit();
		 */
      WebElement element3  = driver.findElement(By.className("form-control"));
      element3.sendKeys("keshav120@gmail.com");
      element3.submit();
      WebElement element4  = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div/form/div[2]/div/input"));
      element4.sendKeys("qwerty12");
      element4.submit();
      driver.navigate().to("https://www.amazon.com/");
      WebElement element5  = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/nav/a"));
      element5.click();
	 }
}