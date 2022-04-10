package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FirstScript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\New folder\\chromedriver\\chromedriver.exe");
		

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://phptravels.net");
		System.out.println(driver.getTitle());
		
		
		WebElement m =driver.findElement(By.linkText("Tours"));
	      m.click();
	      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("DUBAI"))).click();
	      
	      //WebElement d=driver.findElement(By.linkText("Sheraton Trip"));
	     // d.click();

	     
	      
	}

}
