package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vamsh\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.google.com/");
	}

}
