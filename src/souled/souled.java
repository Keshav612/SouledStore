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

	WebDriver obj;
	@BeforeTest
	void configure()
	{
		String baseurl="https://www.thesouledstore.com/";
		System.setProperty("webdriver.gecko.driver", "G:\\study\\SEM 6\\Test Automation\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		obj=new FirefoxDriver();
		obj.get(baseurl);
	}
	/*
	 * @Test (priority=0) void clickonlogin() { WebElement element;
	 * element=obj.findElement(By.id("nav-signin-tooltip")); element.click();
	 * 
	 * }
	 * 
	 * @Test (priority=1) void enteremail() { WebElement element;
	 * element=obj.findElement(By.id("ap_email"));
	 * element.sendKeys("prajjawalbanati16@gmail.com"); }
	 * 
	 * @Test (priority=2) void clickoncontinue() { WebElement element1; String name;
	 * element1=obj.findElement(By.id("continue")); name=element1.getText();
	 * //Assertion Statement AssertJUnit.assertTrue(name.contains("Continue"));
	 * element1.click();
	 * 
	 * }
	 * 
	 * @Test (priority=3) void enterpassword() { WebElement element;
	 * element=obj.findElement(By.id("ap_password"));
	 * element.sendKeys("puneet321banati");
	 * 
	 * }
	 * 
	 * @Test (priority=4) void ClickOnLoginButton() { WebElement element1;
	 * element1=obj.findElement(By.id("signInSubmit")); element1.click(); }
	 * 
	 * @AfterTest void QuitBrowser() { obj.quit(); }
	 */
}
