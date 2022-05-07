package waitPackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;


public class explicitWaitTest {

	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); //Illegal State Exception
		
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
	    driver.get("www.google.com");//invalid Argument Exception
	    
	    WebDriverWait wait = new WebDriverWait(driver, 1000);
	    
		wait.until(ExpectedConditions.titleContains("Google"));
		
		
	                     
	}
	
	public String waitforElementFluentwaitTest(By Locator,int timeout, int interval) {
		
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
		                       
		                  .withTimeout(Duration.ofSeconds(timeout))
		                  .pollingEvery(Duration.ofSeconds(interval))
	                      .ignoring(NoSuchElementException.class);
		Alert al =wait1.until(ExpectedConditions.alertIsPresent());
		return al.getText();
		
	}

}
