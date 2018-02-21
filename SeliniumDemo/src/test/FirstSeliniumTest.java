package test;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeliniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vamsh\\eclipse-workspace\\SeliniumDemo\\Lib\\geckodriver\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.facebook.com/");
//		WebElement element = driver.findElement(By.name("q"));
//		element.sendKeys("Cheese!");
//		element.submit();
//		System.out.println("Page title is: " + driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("9135235225");
		// List<WebElement> we = driver.findElements(By.tagName("input"));
		 WebElement []we1;
		// driver.findElement(By.linkText("Forgot account?")).click();
		// driver.findElement(By.partialLinkText("Forgot")).click();
		 

	}

}
